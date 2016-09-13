package rheencore.gameobject;

import java.util.ArrayList;
import java.util.List;

import rheencore.RheenGame;
import rheencore.gameobject.component.BaseComponent;
import rheencore.maths.Transform;
import rheencore.maths.vector.d.Vec3d;
import rheencore.maths.vector.d.Vec4d;

/**
 * GameObject
 */
public class GameObject implements ITickable {
	
	public Transform transform;
	protected List<BaseComponent> components = new ArrayList<>(); 
	
	public GameObject(){
		this.transform = new Transform(new Vec3d(), new Vec3d(), new Vec4d());
		this.start();
		RheenGame.gameObjects.add(this);
	}
	
}