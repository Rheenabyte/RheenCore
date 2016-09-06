package rheencore.gameobject.component;

public class RidgidBody extends BaseComponent {
	
	String string;
	
	public RidgidBody(){
		string = "hi";
	}
	
	public void ridgidFunction(){
		System.out.println("RidgidBody specific function");
	}
	
	public String toString(){
		return "This is the RidgidBody Class";
	}
}
