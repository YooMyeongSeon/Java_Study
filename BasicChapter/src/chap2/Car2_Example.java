package chap2;

public class Car2_Example {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("Á¦Á¶»ç : "+car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("¾Æ¹Ý¶¼");
		System.out.println("Á¦Á¶»ç : "+car2.company);
		System.out.println("¸ðµ¨ : "+car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("¾Æ¹Ý¶¼","Èò»ö");
		System.out.println("Á¦Á¶»ç : "+car3.company);
		System.out.println("¸ðµ¨ : "+car3.model);
		System.out.println("»ö»ó : "+car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("¾Æ¹Ý¶¼","Èò»ö", 300);
		System.out.println("Á¦Á¶»ç : "+car4.company);
		System.out.println("¸ðµ¨ : "+car4.model);
		System.out.println("»ö»ó : "+car4.color);
		System.out.println("ÃÖ°í¼Ó·Â : "+car4.maxSpeed+"km/h");
		System.out.println();
	}
}
