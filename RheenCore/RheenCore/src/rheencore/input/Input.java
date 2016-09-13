package rheencore.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.HashMap;
import java.util.Map;

public abstract class Input implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener {
	
	private static Map<String, Float> inputs = new HashMap<String, Float>();
	private static Map<String, Boolean> buttons = new HashMap<String, Boolean>();
	
	public static float getAxis(String axis){
		return inputs.get(axis);
	}
	
	public static boolean getButtonDown(String button){
		return buttons.get(button);
	}
	
	public static void init(){
		inputs.put("Mouse X", 0F);
		inputs.put("Mouse Y", 0F);
		inputs.put("Vertical", 0F);
		inputs.put("Horizontal", 0F);
		
		buttons.put("Jump", false);
	}
	
	public static void pollInput() {
		
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
	
	}
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		
	}
	
	public void mouseDragged(MouseEvent e) {
		
	}
	
	public void mouseMoved(MouseEvent e) {
		
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public void mousePressed(MouseEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}
	
	public void mouseExited(MouseEvent e) {
		
	}
	
}
