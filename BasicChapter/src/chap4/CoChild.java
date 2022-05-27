package chap4;

public class CoChild extends CoParent{
	Child c = new Child();
	
	public CoChild() {
		c.name = "child";
		c.setHobby("swimming");
	}
	
	@Override
	public Child getObj() {
		return c;
	}
	
}
