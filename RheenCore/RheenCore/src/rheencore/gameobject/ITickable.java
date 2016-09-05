package rheencore.gameobject;

import java.awt.Graphics2D;
import java.awt.Window;

public interface ITickable {
	
	public default void start() {
		
	}
	
	public default void update() {
		
	}
	
	public default void lateUpdate(){
		
	}
	
	public abstract void render(Graphics2D graphics, Window window);
}