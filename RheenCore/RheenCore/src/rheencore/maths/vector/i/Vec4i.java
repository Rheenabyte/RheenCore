package rheencore.maths.vector.i;

/**
 * A four dimensional integer vector
 */
public class Vec4i extends Vec3i {
	
	protected int w;
	
	public Vec4i(int x, int y, int z, int w){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vec4i(){
		new Vec4i(0, 0, 0, 0);
	}
	
	public void add(Vec4i vector){
		this.x += vector.x;
		this.y += vector.y;
		this.z += vector.z;
		this.w += vector.w;
	}
	
	public void add(int x, int y, int z, int w){
		this.x += x;
		this.y += y;
		this.z += z;
		this.w += w;
	}
	
	public void set(Vec4i vector){
		this.x = vector.x;
		this.y = vector.y;
		this.z = vector.z;
		this.w = vector.w;
	}
	
	public void set(int x, int y, int z, int w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public void setW(int w){
		this.w = w;
	}
	
	public int getW(){
		return this.w;
	}
}
