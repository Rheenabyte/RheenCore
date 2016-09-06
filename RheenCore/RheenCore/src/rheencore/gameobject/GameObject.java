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
import rheencore.throwable.ComponentNotFoundException;
import rheencore.throwable.IllegalComponentRequestException;

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
	
	public <T> T getComponent(T clazz) throws ComponentNotFoundException, InstantiationException, IllegalAccessException, IllegalComponentRequestException {
		
		if(this.components.contains(clazz)){
			return clazz;
		}
		
//		if(!((clazz.newInstance() instanceof BaseComponent)){
//			throw new IllegalComponentRequestException();
//		} else {
//			for(int i = 0; i < this.components.size(); i++){
//				if(this.components.get(i).getClass() == clazz){
//					return (T) this.components.get(i);
//				}
//			}
//		}
		throw new ComponentNotFoundException();
	}
	
	public void addComponent(Class<? extends BaseComponent> clazz) throws InstantiationException, IllegalAccessException {
		this.components.add(clazz.newInstance());
	}
	
	public void render(Graphics2D graphics, Window window) {
		
	}
	
}