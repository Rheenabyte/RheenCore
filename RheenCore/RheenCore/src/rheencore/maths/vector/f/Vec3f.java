package rheencore.maths.vector.f;

/**
 * A three dimensional float vector
 */
public class Vec3f extends Vec2f {
	
	protected float z;
	
	public Vec3f(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3f(){
		new Vec3f(0F, 0F, 0F);
	}
	
	public void add(Vec3f vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
	}
	
	public void add(float x, float y, float z){
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	public void set(Vec3f vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
	}
	
	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setZ(float z){
		this.z = z;
	}
	
	public float getZ(){
		return this.z;
	}
}
