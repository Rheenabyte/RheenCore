package rheencore.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keys implements KeyListener {

	private static boolean keys[] = new boolean[68192];
	
	private void setKeyDown(int keycode){
		keys[keycode] = true;
	}
	
	private void setKeyUp(int keycode){
		keys[keycode] = false;
	}
	
	public static boolean isKeyDown(int keycode){
		return keys[keycode];
	}

	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			
		}
		
		setKeyDown(e.getKeyCode());
		e.consume();
	}

	public void keyReleased(KeyEvent e){
		setKeyUp(e.getKeyCode());
		
		e.consume();
	}
	
	public void keyTyped(KeyEvent e){}
}