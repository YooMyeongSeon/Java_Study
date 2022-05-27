package ScoreProgram;

import java.util.Scanner;

public class View { // ���α׷��� ����ϴ� ����ڰ� ���� �κ�(��:html)
	
	static Scanner scan = new Scanner(System.in);
	
	public static int menu() { // �޴� ���
		System.out.println("�׸���ǻ�;�ī���� ���� ��ȸ ���α׷� �Դϴ�.");
		System.out.println("==============================");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���κ� ���� ��ȸ");
		System.out.println("3. ���� ���� ��ȸ");
		System.out.println("4. ���α׷� ����");
		System.out.println("==============================");
		System.out.println("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
		int selectNum = Integer.parseInt(scan.nextLine());
		return selectNum;
	}
	
	public static Student inputScore() { // ���� �Է� ���
		System.out.println("������ �Է��� �л��� �̸��� �Է��ϼ���.");
		String name = scan.nextLine();
		System.out.println(name + "�л��� ���� ������ �Է��ϼ���.");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.println(name + "�л��� ���� ������ �Է��ϼ���.");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.println(name + "�л��� ���� ������ �Է��ϼ���.");
		int mat = Integer.parseInt(scan.nextLine());
		Student student = new Student(name, kor, eng, mat);
		return student;
	}
	
	public static String inputName() { // ���κ� ���� ��ȸ�� �л� ��ȸ ���
		System.out.println("������ ��ȸ�� �л��� �̸��� �Է��ϼ���.");
		String name = scan.nextLine();
		return name;
	}
	
	public static void viewScore(Student student) {
		if (student != null) {
			System.out.println("==============================");
			System.out.println("�̸� : " + student.getName());
			System.out.println("���� ���� : " + student.getKorScore());
			System.out.println("���� ���� : " + student.getEngScore());
			System.out.println("���� ���� : " + student.getMatScore());
			System.out.println("���� �հ� : " + student.getTotalScore());
			System.out.println("��� ���� : " + student.getAvgScore());
			System.out.println("==============================");
		} else {
			System.out.println("==============================");
			System.out.println("�������� �ʴ� �л��Դϴ�.");
			System.out.println("==============================");
		}
	}
	
	public static SubjectName inputSubjuct() {
		System.out.println("��ȸ�� ������ �Է��ϼ���.");
		String subjectName = scan.nextLine();
		
		if (subjectName.equals("����")) {
			return SubjectName.KOR;
		} else if (subjectName.equals("����")) {
			return SubjectName.ENG;
		} else if (subjectName.equals("����")) {
			return SubjectName.MAT;
		} else {
			return null;
		}
	}
	
	public static void viewSubjectScore(double[] subjectScore) {
		if (subjectScore != null) {
			System.out.println("==============================");
			System.out.println("������ ���� : " + subjectScore[0]);
			System.out.println("������ ��� : " + subjectScore[1]);
			System.out.println("==============================");
		} else {
			System.out.println("==============================");
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.out.println("==============================");
		}
	}
	
	
	public static boolean exitProgram() {
		System.out.println("�����Ͻðڽ��ϱ�?(Y/N) : ");
		String answer = scan.nextLine();
		if (answer.equals("Y")  || answer.equals("y")) {
			System.out.println("���α׷��� �����մϴ�.");
			return false;
		} else if (answer.equals("N") || answer.equals("n")) {
			return true;
		} else
			System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
			System.out.println("==============================");
			return true;
	}
	
	public static void error() {
		System.out.println("�ùٸ� �Է��� �ƴմϴ�.");
		System.out.println("==============================");
	}
}