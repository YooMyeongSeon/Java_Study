package chap2;

public class Korean_Example {

	public static void main(String[] args) {
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		System.out.println("k1�� �̸� : "+k1.name);
		System.out.println("k1�� �ֹι�ȣ : "+k1.ssn);
		System.out.println();
		Korean k2 = new Korean("���ڹ�", "021225-1234567");
		System.out.println("k2�� �̸� : "+k2.name);
		System.out.println("k2�� �ֹι�ȣ : "+k2.ssn);
	}

}
