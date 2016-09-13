package rheencore.maths;

import rheencore.maths.vector.f.Vec3f;

public class Rect {

	public Vec3f position;
	public float width;
	public float height;
	
	public Rect(Vec3f position, float width, float height){
		this.position = position;
		this.width = width;
		this.height = height;
	}
	
	public Rect(){
		new Rect(new Vec3f(), 0F, 0F);
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	
	public void setHeight(float height){
		this.height = height;
	}
	
	public float getWidth(){
		return this.width;
	}
	
	public float getHeight(){
		return this.height;
	}
	
}
