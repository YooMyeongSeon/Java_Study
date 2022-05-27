package chap3;

class Parent_0 {
	protected String name;
	
	public void printInfo() {
		System.out.println("name : "+name);
	}
}

class Child_0 extends Parent_0 {
	private String hobby;
	
	@Override //어노테이션
	public void printInfo() {
		System.out.println("name : "+name);
		System.out.println("hobby : "+hobby);
	}
	
	public String getHobby( ) { //나가는 취미
		return hobby;
	}
	
	public void setHobby(String hobby) { //들어오는 취미
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