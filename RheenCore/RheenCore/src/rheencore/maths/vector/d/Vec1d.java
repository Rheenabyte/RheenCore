package rheencore.maths.vector.d;

import rheencore.maths.vector.Vector;

/**
 * A one dimensional double vector
 */
public class Vec1d extends Vector {
	
	public double x;
	
	public Vec1d(double x){
		this.x = x;
	}
	
	public Vec1d(){
		new Vec1d(0F);
	}
	
	public void add(Vec1d vector){
		this.x += vector.x;
	}
	
	public void add(double x){
		this.x += x;
	}
	
	public void set(Vec1d vector){
		this.x = vector.x;
	}
	
	public void set(double x) {
		this.x = x;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getX(){
		return this.x;
	}
}
