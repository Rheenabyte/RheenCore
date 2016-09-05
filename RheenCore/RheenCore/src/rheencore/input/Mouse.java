package rheencore.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import rheencore.maths.vector.f.Vec2f;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener{

	public static Vec2f position;
	public static Vec2f moved;
	
	public Mouse(){
		position = new Vec2f();
		moved = new Vec2f();
	}
	
	@Override
	public void mousePressed(MouseEvent e){}
	
	@Override
	public void mouseReleased(MouseEvent e){}
	
	@Override
	public void mouseMoved(MouseEvent e)
	{
		Mouse.position.set(new Vec2f(e.getX(), e.getY()));
		
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
