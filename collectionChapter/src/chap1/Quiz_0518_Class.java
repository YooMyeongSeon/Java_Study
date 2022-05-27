package chap1;

import java.util.Scanner;

class Score {
	String name;
	int kor;
	int eng;
	int mat;
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int total() {
		return this.kor + this.eng + this.mat;
	}
	public int average() {
		return total() / 3;
	}
	public int rank;
}

public class Quiz_0518_Class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		boolean input = false;
		Score[] student = new Score[5];
		
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
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int korScore = scan.nextInt();
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int engScore = scan.nextInt();
						System.out.println(studentName+" �л��� ���� ������ �Է��ϼ��� : ");
						int matScore = scan.nextInt();
						System.out.println(studentName+" �л��� ������ ��� �Է��Ͽ����ϴ�.");
						student[i] = new Score(studentName, korScore, engScore, matScore);
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
						student[i].rank = 1;
						for (int j=0; j<5; j++) {
							if (student[i].total() < student[j].total()) {
								student[i].rank += 1;
							}
						}
					}
					for (int i=0; i<5; i++) {
						System.out.println(student[i].name + "�л��� ������ ���� : " + student[i].kor + "��, ���� : " + student[i].eng + "��, ���� : " + student[i].mat + "�� �Դϴ�.");
						System.out.println("������" + student[i].total() + "�� �̸�, ����� " + student[i].average() + "�� �Դϴ�, �׸��� "+ student[i].rank + "�� �Դϴ�.");
					}
				}
				
			} else if (selectNum.equals("3")) {
				System.out.println("���� ���� ��ȸ �Դϴ�.");
				if (input == false) {
					System.out.println("���� �л� ������ �Է����� �ʾҽ��ϴ�.");
				} else {
					int korTotal = student[0].kor + student[1].kor + student[2].kor + student[3].kor + student[4].kor;
					int engTotal = student[0].eng + student[1].eng + student[2].eng + student[3].eng + student[4].eng;
					int matTotal = student[0].mat + student[1].mat + student[2].mat + student[3].mat + student[4].mat;
					System.out.println("���� ������ ������ " + korTotal + "���̸�, ����� " + (korTotal/5) + "�� �Դϴ�.");
					System.out.println("���� ������ ������ " + engTotal + "���̸�, ����� " + (engTotal/5) + "�� �Դϴ�."); 
					System.out.println("���� ������ ������ " + matTotal + "���̸�, ����� " + (matTotal/5) + "�� �Դϴ�.");
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