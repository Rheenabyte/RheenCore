package rheencore.maths.vector.d;

/**
 * A three dimensional double vector
 */
public class Vec3d extends Vec2d {
	
	public double z;
	
	public Vec3d(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3d(){
		new Vec3d(0F, 0F, 0F);
	}
	
	public void add(Vec3d vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
	}
	
	public void add(double x, double y, double z){
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	public void set(Vec3d vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
	}
	
	public void set(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setZ(double z){
		this.z = z;
	}
	
	public double getZ(){
		return this.z;
	}
}
