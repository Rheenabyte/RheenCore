package rheencore.maths;

import rheencore.maths.vector.d.Vec3d;
import rheencore.maths.vector.d.Vec4d;

/**
 * An object for storing the position, scale, and rotation of a GameObject
 */
public class Transform {
	
	public Vec3d position;
	public Vec3d scale;
	public Vec4d rotation; //This is going to be changed from a Vec4f to a Quaternion once I make a Quaternion class
	
	public Transform(Vec3d position, Vec3d scale, Vec4d rotation){
		this.position = position;
		this.scale = scale;
		this.rotation = rotation;
	}
	
	public Transform(){
		new Transform(new Vec3d(), new Vec3d(), new Vec4d());
	}
	
}
