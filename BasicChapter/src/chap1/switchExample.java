package chap1;

public class switchExample {

	public static void main(String[] args) {
		//8�� = ����մϴ�
		//9�� = ȸ�Ǹ� �����մϴ�.
		//10�� = ������ ���� �ֽ��ϴ�.
		//�� �� �ð� = �ܱ��� �����ϴ�.
		//time ������ �������� ����, switch�� case�� �̿�
		//����ð� ǥ��
		
//		int num = (int)(Math.random()*6)+1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1���� ���Խ��ϴ�.");
//			break;
//		case 2:
//			System.out.println("2���� ���Խ��ϴ�.");
//			break;
//		case 3:
//			System.out.println("3���� ���Խ��ϴ�.");
//			break;
//		case 4:
//			System.out.println("4���� ���Խ��ϴ�.");
//			break;
//		case 5:
//			System.out.println("5���� ���Խ��ϴ�.");
//			break;
//		default :
//			System.out.println("6���� ���Խ��ϴ�.");
//			break;
//		}
		
		int time = (int)(Math.random()*4)+8;
		
		System.out.println("���� �ð��� "+time+"�� �Դϴ�.");
		
		switch(time) {
		case 8:
			System.out.println("����� �߽��ϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �����մϴ�.");
			break;
		case 10:
			System.out.println("������ �����մϴ�.");
			break;
		default :
			System.out.println("�ܱ� ���Դϴ�.");
			break;
		}
	}

}
