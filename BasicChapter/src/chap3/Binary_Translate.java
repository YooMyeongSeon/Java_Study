package chap3;

public class Binary_Translate {

	public static void main(String[] args) {
		int a[] = new int[8]; //배열을 8칸 생성
		int i = 0;
		int n = 255;
		
		while (n>0) {
			a[i++] = n % 2;  //후치연산
			n /= 2;
		}
		for (i=7; i>=0; i--) {
			System.out.print(a[i]);
		}
	}

}
