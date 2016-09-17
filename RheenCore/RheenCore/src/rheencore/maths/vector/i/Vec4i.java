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
	
	public Vec4i(int x, int y, int z){
		new Vec4i(x, y, z, 0);
	}
	
	public Vec4i(int x, int y){
		new Vec4i(x, y, 0, 0);
	}
	
	public Vec4i(Vec3i vec3i){
		new Vec4i(vec3i.getX(), vec3i.getY(), vec3i.getZ(), 0);
	}
	
	public Vec4i(Vec2i vec2i){
		new Vec4i(vec2i.getX(), vec2i.getY(), 0, 0);
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
