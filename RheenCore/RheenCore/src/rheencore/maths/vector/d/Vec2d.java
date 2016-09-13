package rheencore.maths.vector.d;

/**
 * A two dimensional double vector
 */
public class Vec2d extends Vec1d {
	
	public double y;
	
	public Vec2d(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Vec2d(){
		new Vec2d(0F, 0F);
	}
	
	public void add(Vec2d vector){
		this.x += vector.x;
		this.y += vector.y;
	}
	
	public void add(double x, double y){
		this.x += x;
		this.y += y;
	}
	
	public void set(Vec2d vector){
		this.x = vector.x;
		this.y = vector.y;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getY(){
		return this.y;
	}
	
}
