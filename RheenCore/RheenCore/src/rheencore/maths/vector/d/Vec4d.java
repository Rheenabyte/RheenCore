package rheencore.maths.vector.d;

/**
 * A four dimensional double vector
 */
public class Vec4d extends Vec3d {
	
	public double w;
	
	public Vec4d(double x, double y, double z, double w){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4d(){
		new Vec4d(0F, 0F, 0F, 0F);
	}
	
	public void add(Vec4d vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
		this.w += vector.w;
	}
	
	public void add(double x, double y, double z, double w){
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
	}
	
	public void set(Vec4d vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		this.w = vector.w;
	}
	
	public void set(double x, double y, double z, double w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void setW(double w){
		this.w = w;
	}
	
	public double getW(){
		return this.w;
	}
}
