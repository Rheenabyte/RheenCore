package rheencore;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Robot;
import java.awt.Window;
import java.util.ArrayList;

import rheencore.gameobject.GameObject;
import rheencore.graphics.ScreenManager;
import rheencore.input.Input;
import rheencore.input.Keys;
import rheencore.input.Mouse;
import rheencore.maths.vector.d.Vec2d;

/**
 * @author Rheenabyte
 */
public abstract class RheenGame implements Runnable {
	
	public static ScreenManager screen = new ScreenManager();
	private static boolean running = true;
	
	protected static Robot robot;
	
	public static Vec2d center;
	protected static boolean centered;
	
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
    	
    	//Initialize Screen
    	DisplayMode dm = screen.getFirstCompatibleDisplayMode(modes);
    	screen.setFullScreen(dm);
    	Window window = screen.getFullScreenWindow();
    	window.setFocusTraversalKeysEnabled(false);
    	window.setFont(new Font("Arial", Font.PLAIN, 20));
    	window.setBackground(Color.BLACK);
    	window.setForeground(Color.WHITE);
    	
    	//initialize Points
    	Mouse.position = new Vec2d();
    	
    	Input.init();
    	
    	window.addKeyListener(new Keys());
		window.addMouseListener(new Mouse());
		window.addMouseMotionListener(new Mouse());
		window.addMouseWheelListener(new Mouse());
		
		//Start the main game loop
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
	}
	
	/**
	 * Center the mouse cursor on the screen
	 */
	protected synchronized static void centerMouse(){
		Window window = screen.getFullScreenWindow();
		if(robot != null && window.isShowing()){
			center.set(window.getWidth() / 2, window.getHeight() / 2);
			//SwingUtilities.convertPointToScreen(center, window);
			centered = true;
			robot.mouseMove((int)center.getX(), (int)center.getY());
		}
	}
	
	public static final double getDeltaTime(){
		return deltaTime;
	}
    
    public static final void stop(){
    	running = false;
	}
    
    public abstract void update();
}
