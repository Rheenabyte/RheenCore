package rheencore.gameobject;

import rheencore.RheenGame;
import rheencore.maths.Transform;
import rheencore.maths.vector.d.Vec3d;
import rheencore.maths.vector.d.Vec4d;

public class GameObject implements ITickable {
	
	public Transform transform;
	public RidgidBody ridgidBody;
	
	public GameObject(){
		this.transform = new Transform(new Vec3d(), new Vec3d(), new Vec4d());
		this.start();
		RheenGame.gameObjects.add(this);
	}
	
}
