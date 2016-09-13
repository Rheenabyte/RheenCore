package rheencore.maths;

import rheencore.maths.vector.d.Vec3d;

public class Circle {
	
	public Vec3d position;
	protected double radius;
	protected double density;
	
	public Circle(Vec3d position, double radius){
		this.position = position;
		this.radius = radius;
		this.density = 1F;
	}
	
	public Circle(Vec3d position, double radius, double density){
		this.position = position;
		this.radius = radius;
		this.density = density;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public double getArea(){
		return this.radius * this.radius * Math.PI;
	}
	
	public double getMass(){
		return this.getArea() * this.density;
	}
	
}
