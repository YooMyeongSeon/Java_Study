package chap1;

public class FloatExample {

	public static void main(String[] args) {
		float var1 = 3.14f; //4����Ʈ �Ǽ���, �ݵ�� �� �ڿ� f, F�� ��
		double var2 = 3.14;  //8����Ʈ �Ǽ���
		int var3 = 999999999; // 4����Ʈ ������
		byte var4 = 127; // 1����Ʈ ������
		short var5 = 127; // 2����Ʈ ������
		long var6 = 1270000000; //8����Ʈ ������
		char var7 = 'a'; // ������, 2����Ʈ
		
		System.out.println("var1(�Ǽ�) : " + var1);
		System.out.println("var2(�Ǽ�) : " + var2);
		System.out.println("var3(����) : " + var3);
		System.out.println("var4(����) : " + var4);
		System.out.println("var5(����) : " + var5);
		System.out.println("var6(����) : " + var6);
		System.out.println("var7(����) : " + var7);
		System.out.println();
		
		boolean stop = true;
		boolean state = false;
		
		if (stop) {System.out.println("�����մϴ�.");}
		else {System.out.println("�����մϴ�.");}
		
		stop = false;
		
		if (stop) {System.out.println("�����մϴ�.");}
		else {System.out.println("�����մϴ�.");}
		
		if (state) {System.out.println("������ ������� ���� �����ϴ�.");}
		else {System.out.println("������ ������� �� �����ϴ�.");}
	}

}
