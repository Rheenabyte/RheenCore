package rheencore.maths.vector.f;

/**
 * A four dimensional float vector
 */
public class Vec4f extends Vec3f {
	
	protected float w;
	
	public Vec4f(float x, float y, float z, float w){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4f(){
		new Vec4f(0F, 0F, 0F, 0F);
	}
	
	public void add(Vec4f vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
		this.w += vector.w;
	}
	
	public void add(float x, float y, float z, float w){
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
	}
	
	public void set(Vec4f vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		this.w = vector.w;
	}
	
	public void set(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void setW(float w){
		this.w = w;
	}
	
	public float getW(){
		return this.w;
	}
}
