package chap3;

class Parent_0 {
	protected String name;
	
	public void printInfo() {
		System.out.println("name : "+name);
	}
}

class Child_0 extends Parent_0 {
	private String hobby;
	
	@Override //������̼�
	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("hobby : "+hobby);
	}
	
	public String getHobby( ) { //������ ���
		return hobby;
	}
	
	public void setHobby(String hobby) { //������ ���
		this.hobby = hobby;
	}
}

public class Parent_Main {

	public static void main(String[] args) {
		Parent_0 p = new Parent_0();
		
		p.name = "parent";
		p.printInfo();
		
		System.out.println("------------------------------");
		
		Child_0 c = new Child_0();
		
		c.name = "child";
		c.setHobby("hobby");
		
		c.printInfo();
	}
}