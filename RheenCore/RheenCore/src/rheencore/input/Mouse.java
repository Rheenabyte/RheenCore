package rheencore.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import rheencore.maths.vector.d.Vec2d;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener{

	public static Vec2d position;
	public static Vec2d moved;
	
	public Mouse(){
		position = new Vec2d();
		moved = new Vec2d();
	}
	
	@Override
	public void mousePressed(MouseEvent e){}
	
	@Override
	public void mouseReleased(MouseEvent e){}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		Mouse.position.set(new Vec2d(e.getX(), e.getY()));
		
		e.consume();
	}
	
	@Override
	public void mouseClicked(MouseEvent e){}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		mouseMoved(e);
	}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e){}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e){}
}
