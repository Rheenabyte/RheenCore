package rheencore.maths.vector.f;

/**
 * A two dimensional float vector
 */
public class Vec2f {
	
	protected float x;
	protected float y;
	
	public Vec2f(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public Vec2f(){
		new Vec2f(0F, 0F);
	}
	
	public void add(Vec2f vector){
		this.x += vector.x;
		this.y += vector.y;
	}
	
	public void add(float x){
		this.x += x;
	}
	
	public void add(float x, float y){
		this.x += x;
		this.y += y;
	}
	
	public void set(Vec2f vector){
		this.x = vector.x;
		this.y = vector.y;
	}
	
	public void set(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(float x){
		this.x = x;
	}
	
	public void setY(float y){
		this.y = y;
	}
	
	public float getX(){
		return this.x;
	}
	
	public float getY(){
		return this.y;
	}
	
}
