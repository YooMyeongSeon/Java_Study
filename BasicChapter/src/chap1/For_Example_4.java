package chap1;

public class For_Example_4 {

	public static void main(String[] args) {
		for (int i=1; i<6; ++i) {
			for (int j=1; j<=i; ++j) {
				System.out.printf("*");
				if(j==i) {
					System.out.println();
				}
			}	
		}
		for (int i=1; i<6; ++i) {
			for (int j=5; j>0; --j) {
				if(i<j) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
			}
			System.out.println(" ");
		}
	}
}
