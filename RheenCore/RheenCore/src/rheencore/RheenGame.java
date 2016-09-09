package rheencore;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Window;
import java.util.ArrayList;

import rheencore.gameobject.GameObject;
import rheencore.graphics.ScreenManager;
import rheencore.input.Input;
import rheencore.input.Keys;
import rheencore.input.Mouse;
import rheencore.maths.vector.f.Vec2f;

/**
 * @author Rheenabyte
 */
public abstract class RheenGame implements Runnable {
	
	public static ScreenManager screen = new ScreenManager();
	private static boolean running = true;
	
	private static long startTime;
	private static long lastTime;
	private static double elapsedTime;
	private static double deltaTime;
	
	private static final DisplayMode modes[] = {
			new DisplayMode(1920, 1080, 24, 0),
//			new DisplayMode(1600, 900, 32, 0), //Commented because 32 bit color (the third parameter) messes with my Google+ Chat app Graphics
			new DisplayMode(1600, 900, 24, 0),
			new DisplayMode(1600, 900, 16, 0),
			new DisplayMode(1366, 768, 24, 0)
	};
	
	public static ArrayList<GameObject> gameObjects = new ArrayList<>();
	
    public static final void run(RheenGame game){
    	//main initialization stuff
    	DisplayMode dm = screen.getFirstCompatibleDisplayMode(modes);
    	screen.setFullScreen(dm);
    	Window window = screen.getFullScreenWindow();
    	window.setFocusTraversalKeysEnabled(false);
    	window.setFont(new Font("Arial", Font.PLAIN, 20));
    	window.setBackground(Color.BLACK);
    	window.setForeground(Color.WHITE);
    	
    	//initialize Points
    	Mouse.position = new Vec2f();
    	
    	Input.init();
    	
    	window.addKeyListener(new Keys());
		window.addMouseListener(new Mouse());
		window.addMouseMotionListener(new Mouse());
		window.addMouseWheelListener(new Mouse());
		
		mainGameLoop(game);
		
		screen.restoreScreen();
    }

	private static final void mainGameLoop(RheenGame game){
    	startTime = System.nanoTime();
		lastTime = startTime;
		elapsedTime = 0;
    	
    	game.run();
    	while(running){
    		deltaTime = (float)(System.nanoTime() - lastTime) / 1000000000;
			lastTime = System.nanoTime();
			elapsedTime += deltaTime;
			
			Engine.update();
			
    		game.update();
    		for(GameObject e : RheenGame.gameObjects){
    			e.update();
    		}
    		for(GameObject e : RheenGame.gameObjects){
    			e.lateUpdate();
    		}
    		
    		//Graphics
			Graphics2D graphics = screen.getGraphics();
			draw(graphics, screen.getFullScreenWindow());
			graphics.dispose();
			screen.update();
    	}
    }
    
    /**
	 * Called once per frame to draw the contents of the current frame to the screen
	 * @param graphics
	 * @param window
	 */
	private synchronized static final void draw(Graphics2D graphics, Window window){
		
		graphics.setColor(window.getBackground());
		graphics.fillRect(0, 0, window.getWidth(), window.getHeight());
		
		for(GameObject e : RheenGame.gameObjects){
			e.render(graphics, window);
		}
		
		/*///Debug stuff (Comment to hide obtrusive debugging graphics)
		{
			//Random info
			graphics.drawString("Player1 posX: " + player.position.x, 20, 20);
			graphics.drawString("Player1 posY: " + player.position.y, 20, 40);
			graphics.drawString("Player1 velX: " + player.velocity.x, 20, 60);
			graphics.drawString("Player1 velY: " + player.velocity.y, 20, 80);
			graphics.drawString("Player1 distanceToMouse: " + player.distanceToMouse, 20, 100);
			graphics.drawString("MouseX: " + Mouse.position.x, 20, 120);
			graphics.drawString("MouseY: " + Mouse.position.y, 20, 140);
						
			//Triangle of the player and the mouse cursor
			{
				graphics.setColor(Color.MAGENTA);
				
				graphics.drawLine((int)player.position.x, (int)player.position.y, (int)Mouse.position.x, (int)Mouse.position.y);  //Hypotenuse
				graphics.rotate(
						Math.sin((player.position.y - Mouse.position.y) / (player.position.x - Mouse.position.x) ),
						player.position.x, player.position.y);
				graphics.drawString("" + player.distanceToMouse, player.position.x + (player.distanceToMouse / 2), player.position.y);
				graphics.rotate(
						-Math.sin( (player.position.y - Mouse.position.y) / (player.position.x - Mouse.position.x) ),
						player.position.x, player.position.y);
				graphics.drawString("" + (Math.sin(Math.toRadians(player.position.y - Mouse.position.y) / Math.toRadians(player.position.x - Mouse.position.x))), 20, 160);
				
				
				graphics.drawLine((int)player.position.x, (int)player.position.y, (int)Mouse.position.x, (int)player.position.y); //Base
				
				graphics.drawLine((int)Mouse.position.x, (int)player.position.y, (int)Mouse.position.x, (int)Mouse.position.y);   //Height
			}
		}
		/*///End Debug Stuff
	}
	
	public static final double getDeltaTime(){
		return deltaTime;
	}
    
    public static final void stop(){
    	running = false;
	}
    
    public abstract void update();
}