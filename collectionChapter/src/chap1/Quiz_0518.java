// �л� �ټ����� ������ �Է� �޴´�.
// �̸��� ����, ����, ����, 3���� ������ �Է� �޴´�.
// ���κ� ������ ��ȸ�� �� �ִ�.(������ ���)
// ���� ������ ��ȸ�� �� �ִ�.(������ ���)
// ���Ḧ �������� ������ �޴��� �ݺ������� ��µǵ��� �ϰ�, �޴��� ���� �Է�, ���κ� ���� ��ȸ, ���� ���� ��ȸ, ���Ḧ �����.
// [����]1. ��浿 ���� 78, ���� 64, ���� 82
// [����]2. ��浿 ���� 85, ���� 71, ���� 64
// [����]3. �̱浿 ���� 74, ���� 69, ���� 57
// [����]4. �ڱ浿 ���� 74, ���� 77, ���� 95
// [����]5. ȫ�浿 ���� 68, ���� 95, ���� 84

package chap1;

import java.util.Scanner;

public class Quiz_0518 {

	public static void main(String[] args) { //���α׷��� ���۰� ���� ����ϴ� ���θ޼ҵ�
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		boolean input = false;
		
		String[] student = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		while (run) {
			System.out.println("------------------------------");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���κ� ���� ��ȸ");
			System.out.println("3. ���� ���� ��ȸ");
			System.out.println("4. ����");
			System.out.println("------------------------------");
			System.out.println("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
			String selectNum = scan.next();
			
			if (selectNum.equals("1")) {
				if (input == false) {
					for (int i=0; i<5; i++) {
						System.out.println("�л��� �̸��� �Է��ϼ��� : ");
						String studentName = scan.next();
						student[i] = studentName;
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int korScore = scan.nextInt();
						kor[i] = korScore;
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int engScore = scan.nextInt();
						eng[i] = engScore;
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int matScore = scan.nextInt();
						mat[i] = matScore;
						System.out.println(studentName+" �л��� ������ ��� �Է��Ͽ����ϴ�.");
					}
					input = true;
				} else {
					System.out.println("�л� �ټ����� ������ ��� �Է��Ͽ����ϴ�.");
				}
				
			} else if (selectNum.equals("2")) {
				System.out.println("���κ� ���� ��ȸ �Դϴ�.");
				if (input == false) {
					System.out.println("���� �л� ������ �Է����� �ʾҽ��ϴ�.");
				} else {
					for (int i=0; i<5; i++) {
						System.out.println(student[i] + "�л��� ������ ���� : " + kor[i] + "��, ���� : " + eng[i] + "��, ���� : " + mat[i] + "�� �Դϴ�.");
						System.out.println("������" + (kor[i]+eng[i]+mat[i]) + "�� �̸�, ����� " + ((kor[i]+eng[i]+mat[i])/3) + "�� �Դϴ�.");
					}
				}
				
			} else if (selectNum.equals("3")) {
				System.out.println("���� ���� ��ȸ �Դϴ�.");
				if (input == false) {
					System.out.println("���� �л� ������ �Է����� �ʾҽ��ϴ�.");
				} else {
					System.out.println("���� ������ ������ " + (kor[0]+kor[1]+kor[2]+kor[3]+kor[4]) + "���̸�, ����� " + ((kor[0]+kor[1]+kor[2]+kor[3]+kor[4])/5) + "�� �Դϴ�.");
					System.out.println("���� ������ ������ " + (eng[0]+eng[1]+eng[2]+eng[3]+eng[4]) + "���̸�, ����� " + ((eng[0]+eng[1]+eng[2]+eng[3]+eng[4])/5) + "�� �Դϴ�."); 
					System.out.println("���� ������ ������ " + (mat[0]+mat[1]+mat[2]+mat[3]+mat[4]) + "���̸�, ����� " + ((mat[0]+mat[1]+mat[2]+mat[3]+mat[4])/5) + "�� �Դϴ�.");
				}
				
			} else if (selectNum.equals("4")) {
				run = false;
				break;
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
