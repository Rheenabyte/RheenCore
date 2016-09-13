package rheencore.maths.vector.i;

/**
 * A two dimensional integer vector
 */
public class Vec2i extends Vec1i {
	
	protected int y;
	
	public Vec2i(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Vec2i(){
		new Vec2i(0, 0);
	}
	
	public void add(Vec2i vector){
		this.x += vector.x;
		this.y += vector.y;
	}
	
	public void add(int x, int y){
		this.x += x;
		this.y += y;
	}
	
	public void set(Vec2i vector){
		this.x = vector.x;
		this.y = vector.y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return this.y;
	}
	
}
