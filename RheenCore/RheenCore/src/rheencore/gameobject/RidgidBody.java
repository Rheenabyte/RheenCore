package rheencore.gameobject;

import rheencore.RheenGame;
import rheencore.maths.AxisAlignedBoundingBox;

public class RidgidBody {
	
	public AxisAlignedBoundingBox boundingbox;
	
	public RidgidBody(GameObject gameObject){
		this.boundingbox = new AxisAlignedBoundingBox();
		
		RheenGame.gameObjectsWithRidgidBodies.add(gameObject);
	}
}
