package chap4;

public class CoParent {
	protected Parent p = new Parent();
	
	public CoParent() {
		p.name = "parent";
	}
	public Parent getObj() {
		return p;
	}
}
