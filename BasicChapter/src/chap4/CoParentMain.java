package chap4;

public class CoParentMain {

	public static void main(String[] args) {
		CoParent cp = new CoParent();
		Parent p = cp.getObj();
		p.printInfo();
		
		System.out.println("------------------------------");
		
		CoChild cc = new CoChild();
		Child c = cc.getObj();
		c.printInfo();
	}

}
