package rheencore.maths.vector.i;

import rheencore.maths.vector.Vector;

/**
 * A one dimensional integer vector
 */
public class Vec1i extends Vector {
	
	protected int x;
	
	public Vec1i(int x){
		this.x = x;
	}
	
	public Vec1i(){
		new Vec1i(0);
	}
	
	public void add(Vec1i vector){
		this.x += vector.x;
	}
	
	public void add(int x){
		this.x += x;
	}
	
	public void set(Vec1i vector){
		this.x = vector.x;
	}
	
	public void set(int x) {
		this.x = x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public float getX(){
		return this.x;
	}
}
