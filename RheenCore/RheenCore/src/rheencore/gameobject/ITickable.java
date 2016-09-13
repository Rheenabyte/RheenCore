package rheencore.gameobject;

import java.awt.Graphics2D;
import java.awt.Window;

public interface ITickable {
	
	/**
	 * Called once upon instantiation
	 */
	public default void start() {
		
	}
	
	/**
	 * Called once every frame
	 */
	public default void update() {
		
	}
	
	/**
	 * Called once every frame after update, but before render
	 */
	public default void lateUpdate(){
		
	}
	
	/**
	 * Called once every frame to render things
	 * @param graphics
	 * @param window
	 */
	public default void render(Graphics2D graphics, Window window){
		
	}
}
