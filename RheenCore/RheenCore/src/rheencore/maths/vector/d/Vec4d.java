package rheencore.maths.vector.d;

/**
 * A four dimensional double vector
 */
public class Vec4d extends Vec3d {
	
	protected double w;
	
	public Vec4d(double x, double y, double z, double w){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4d(double x, double y, double z){
		new Vec4d(x, y, z, 0D);
	}
	
	public Vec4d(double x, double y){
		new Vec4d(x, y, 0D, 0D);
	}
	
	public Vec4d(Vec3d vec3d){
		new Vec4d(vec3d.getX(), vec3d.getY(), vec3d.getZ(), 0D);
	}
	
	public Vec4d(Vec2d vec2d){
		new Vec4d(vec2d.getX(), vec2d.getY(), 0D, 0D);
	}
	
	public Vec4d(){
		new Vec4d(0D, 0D, 0D, 0D);
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
