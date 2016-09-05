package rheencore.maths;

import rheencore.maths.vector.f.Vec3f;
import rheencore.maths.vector.f.Vec4f;

/**
 * An object for storing the position, scale, and rotation of a GameObject
 */
public class Transform {
	
	public Vec3f position;
	public Vec3f scale;
	public Vec4f rotation; //This is going to be changed from a Vec4f to a Quaternion once I make a Quaternion class
	
	public Transform(Vec3f position, Vec3f scale, Vec4f rotation){
		this.position = position;
		this.scale = scale;
		this.rotation = rotation;
	}
	
	public Transform(){
		new Transform(new Vec3f(), new Vec3f(), new Vec4f());
	}
	
}
