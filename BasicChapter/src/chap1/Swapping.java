package chap1;

public class Swapping {

	public static void main(String[] args) {
		int x = 30;
		int y = 50;
		System.out.println("x: "+x+", y: "+y);
		System.out.println("x�� y���� ��ȯ�մϴ�. �����ε˴ϴ�.\n");
		
		int temp1; ;//�ӽú��� ����
		temp1 = x; //������ ����
		x = y;
		y = temp1;
				
		System.out.println("x: "+x+", y: "+y);
		
		//i:�����̸� you:ȫ�浿
		//��:����, ��:ȫ�浿
		//���� ���� �̸��� ������ �ϰڽ��ϴ�.
		//���� ȫ�浿�̰�, �ʴ� �����̴�.
		//���� ���� �̸��� ������ �Ǿ����ϴ�.
		
		String i = "����";
		String you = "ȫ�浿";
		System.out.println("���� �̸��� "+i+"�̰�, ���� �̸��� "+you+"�̴�.\n���� ���� �̸��� ������ �Ѵ�.");
		String swapping = i;
		i=you;
		you=swapping;
		System.out.println("���� �̸��� "+i+"�̰�, ���� �̸��� "+you+"�̴�.\n���� ���� �̸��� ������ �Ǿ���.");
	}

}
