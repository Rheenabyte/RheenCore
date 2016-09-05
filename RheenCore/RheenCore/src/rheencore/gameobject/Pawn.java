package rheencore.gameobject;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Window;

public class Pawn extends GameObject {
	
	public Color color;
	
	public Pawn(){
		super();
	}
	
	public void render(Graphics2D graphics, Window window){
		graphics.setColor(this.color);
		graphics.fillRoundRect((int)this.transform.position.getX(), (int)this.transform.position.getY(), 30, 30, 35, 35);
		
		graphics.setColor(window.getForeground());
	}
	
}