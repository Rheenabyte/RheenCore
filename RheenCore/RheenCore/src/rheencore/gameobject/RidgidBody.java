package rheencore.gameobject;

import rheencore.maths.vector.d.Vec3d;

public abstract class RidgidBody extends GameObject {
	
	public double radius;
	public double density;
	
	public RidgidBody(float radius){
		super();
		this.transform.position = new Vec3d();
		this.radius = radius;
		this.density = 1F;
	}
	
	public RidgidBody(double radius, double density){
		super();
		this.transform.position = new Vec3d();
		this.radius = radius;
		this.density = density;
	}
	
	public RidgidBody(){
		super();
	}
	
	public String toString(){
		return "This is the RidgidBody Class";
	}
}
