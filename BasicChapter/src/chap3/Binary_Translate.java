package chap3;

public class Binary_Translate {

	public static void main(String[] args) {
		int a[] = new int[8]; //�迭�� 8ĭ ����
		int i = 0;
		int n = 255;
		
		while (n>0) {
			a[i++] = n % 2;  //��ġ����
			n /= 2;
		}
		for (i=7; i>=0; i--) {
			System.out.print(a[i]);
		}
	}

}
