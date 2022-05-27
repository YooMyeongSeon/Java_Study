package ScoreProgram;

import java.util.Scanner;

public class View { // 프로그램을 사용하는 사용자가 보는 부분(예:html)
	
	static Scanner scan = new Scanner(System.in);
	
	public static int menu() { // 메뉴 출력
		System.out.println("그린컴퓨터아카데미 성적 조회 프로그램 입니다.");
		System.out.println("==============================");
		System.out.println("1. 성적 입력");
		System.out.println("2. 개인별 성적 조회");
		System.out.println("3. 과목별 성적 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("==============================");
		System.out.println("원하는 메뉴의 번호를 입력하세요 : ");
		int selectNum = Integer.parseInt(scan.nextLine());
		return selectNum;
	}
	
	public static Student inputScore() { // 성적 입력 출력
		System.out.println("성적을 입력할 학생의 이름을 입력하세요.");
		String name = scan.nextLine();
		System.out.println(name + "학생의 국어 성적을 입력하세요.");
		int kor = Integer.parseInt(scan.nextLine());
		System.out.println(name + "학생의 영어 성적을 입력하세요.");
		int eng = Integer.parseInt(scan.nextLine());
		System.out.println(name + "학생의 수학 성적을 입력하세요.");
		int mat = Integer.parseInt(scan.nextLine());
		Student student = new Student(name, kor, eng, mat);
		return student;
	}
	
	public static String inputName() { // 개인별 성적 조회중 학생 조회 출력
		System.out.println("성적을 조회할 학생의 이름을 입력하세요.");
		String name = scan.nextLine();
		return name;
	}
	
	public static void viewScore(Student student) {
		if (student != null) {
			System.out.println("==============================");
			System.out.println("이름 : " + student.getName());
			System.out.println("국어 점수 : " + student.getKorScore());
			System.out.println("영어 점수 : " + student.getEngScore());
			System.out.println("수학 점수 : " + student.getMatScore());
			System.out.println("점수 합계 : " + student.getTotalScore());
			System.out.println("평균 점수 : " + student.getAvgScore());
			System.out.println("==============================");
		} else {
			System.out.println("==============================");
			System.out.println("존재하지 않는 학생입니다.");
			System.out.println("==============================");
		}
	}
	
	public static SubjectName inputSubjuct() {
		System.out.println("조회할 과목을 입력하세요.");
		String subjectName = scan.nextLine();
		
		if (subjectName.equals("국어")) {
			return SubjectName.KOR;
		} else if (subjectName.equals("영어")) {
			return SubjectName.ENG;
		} else if (subjectName.equals("수학")) {
			return SubjectName.MAT;
		} else {
			return null;
		}
	}
	
	public static void viewSubjectScore(double[] subjectScore) {
		if (subjectScore != null) {
			System.out.println("==============================");
			System.out.println("과목의 총점 : " + subjectScore[0]);
			System.out.println("과목의 평균 : " + subjectScore[1]);
			System.out.println("==============================");
		} else {
			System.out.println("==============================");
			System.out.println("존재하지 않는 과목입니다.");
			System.out.println("==============================");
		}
	}
	
	
	public static boolean exitProgram() {
		System.out.println("종료하시겠습니까?(Y/N) : ");
		String answer = scan.nextLine();
		if (answer.equals("Y")  || answer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			return false;
		} else if (answer.equals("N") || answer.equals("n")) {
			return true;
		} else
			System.out.println("올바른 입력이 아닙니다.");
			System.out.println("==============================");
			return true;
	}
	
	public static void error() {
		System.out.println("올바른 입력이 아닙니다.");
		System.out.println("==============================");
	}
}