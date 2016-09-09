package rheencore.gameobject;

import java.awt.Graphics2D;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;

import rheencore.RheenGame;
import rheencore.gameobject.component.BaseComponent;
import rheencore.maths.Transform;
import rheencore.maths.vector.f.Vec3f;
import rheencore.maths.vector.f.Vec4f;

/**
 * GameObject
 */
public class GameObject implements ITickable {
	
	public Transform transform;
	private List<BaseComponent> components = new ArrayList<>(); 
	
	public GameObject(){
		this.transform = new Transform(new Vec3f(), new Vec3f(), new Vec4f());
		this.start();
		RheenGame.gameObjects.add(this);
	}
	
	public void render(Graphics2D graphics, Window window) {
		
	}
	
}