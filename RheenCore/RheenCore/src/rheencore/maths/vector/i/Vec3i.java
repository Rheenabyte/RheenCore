package rheencore.maths.vector.i;

/**
 * A three dimensional integer vector
 */
public class Vec3i extends Vec2i {
	
	protected int z;
	
	public Vec3i(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vec3i(){
		new Vec3i(0, 0, 0);
	}
	
	public void add(Vec3i vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
	}
	
	public void add(int x, int y, int z){
		this.x += x;
		this.y += y;
		this.z += z;
	}
	
	public void set(Vec3i vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
	}
	
	public void set(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void setZ(int z){
		this.z = z;
	}
	
	public int getZ(){
		return this.z;
	}
}
