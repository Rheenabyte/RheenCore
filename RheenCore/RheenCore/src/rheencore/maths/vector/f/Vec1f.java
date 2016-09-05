package rheencore.maths.vector.f;

import rheencore.maths.vector.Vector;

/**
 * A one dimensional float vector
 */
public class Vec1f extends Vector {
	
	protected float x;
	
	public Vec1f(float x){
		this.x = x;
	}
	
	public Vec1f(){
		new Vec1f(0F);
	}
	
	public void add(Vec1f vector){
		this.x += vector.x;
	}
	
	public void add(float x){
		this.x += x;
	}
	
	public void set(Vec1f vector){
		this.x = vector.x;
	}
	
	public void set(float x) {
		this.x = x;
	}
	
	public void setX(float x){
		this.x = x;
	}
	
	public float getX(){
		return this.x;
	}
}
