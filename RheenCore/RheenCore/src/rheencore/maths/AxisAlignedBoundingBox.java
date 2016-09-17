package rheencore.maths;

import rheencore.maths.vector.d.Vec3d;

public class AxisAlignedBoundingBox {
	
	Vec3d min;
	Vec3d max;
	
	public AxisAlignedBoundingBox(Vec3d min, Vec3d max){
		this.min = min;
		this.max = max;
	}
	
	public AxisAlignedBoundingBox(){
		new AxisAlignedBoundingBox(new Vec3d(), new Vec3d());
	}
	
	public boolean vsAABB(AxisAlignedBoundingBox boundingBox){
		if(boundingBox != null){
			if (this.min.getX() <= boundingBox.max.getX() && this.max.getX() >= boundingBox.min.getX()
					&& this.min.getY() <= boundingBox.max.getY() && this.max.getY() >= boundingBox.min.getY()
					&& this.min.getZ() <= boundingBox.max.getZ() && this.max.getZ() >= boundingBox.min.getZ()) {
				return true;
			} else {
				return false;
			} 
		} else return false;
	}
	
}
