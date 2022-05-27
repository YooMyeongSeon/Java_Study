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
			System.out.println("1. 성적 입력");
			System.out.println("2. 개인별 성적 조회");
			System.out.println("3. 과목별 성적 조회");
			System.out.println("4. 종료");
			System.out.println("------------------------------");
			System.out.println("원하는 메뉴의 번호를 입력하세요 : ");
			String selectNum = scan.next();
			
			if (selectNum.equals("1")) {
				if (input == false) {
					for (int i=0; i<5; i++) {
						System.out.println("학생의 이름을 입력하세요 : ");
						String studentName = scan.next();
						System.out.println(studentName+" 학생의 국어 점수를 입력하세요 : ");
						int korScore = scan.nextInt();
						System.out.println(studentName+" 학생의 영어 점수를 입력하세요 : ");
						int engScore = scan.nextInt();
						System.out.println(studentName+" 학생의 수학 점수를 입력하세요 : ");
						int matScore = scan.nextInt();
						System.out.println(studentName+" 학생의 점수를 모두 입력하였습니다.");
						student[i] = new Score(studentName, korScore, engScore, matScore);
					}
					input = true;
				} else {
					System.out.println("학생 다섯명의 정보를 모두 입력하였습니다.");
				}
				
			} else if (selectNum.equals("2")) {
				System.out.println("개인별 성적 조회 입니다.");
				if (input == false) {
					System.out.println("아직 학생 정보가 입려되지 않았습니다.");
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
						System.out.println(student[i].name + "학생의 성적은 국어 : " + student[i].kor + "점, 영어 : " + student[i].eng + "점, 수학 : " + student[i].mat + "점 입니다.");
						System.out.println("총점은" + student[i].total() + "점 이며, 평균은 " + student[i].average() + "점 입니다, 그리고 "+ student[i].rank + "등 입니다.");
					}
				}
				
			} else if (selectNum.equals("3")) {
				System.out.println("과목별 성적 조회 입니다.");
				if (input == false) {
					System.out.println("아직 학생 정보가 입려되지 않았습니다.");
				} else {
					int korTotal = student[0].kor + student[1].kor + student[2].kor + student[3].kor + student[4].kor;
					int engTotal = student[0].eng + student[1].eng + student[2].eng + student[3].eng + student[4].eng;
					int matTotal = student[0].mat + student[1].mat + student[2].mat + student[3].mat + student[4].mat;
					System.out.println("국어 성적의 총점은 " + korTotal + "점이며, 평균은 " + (korTotal/5) + "점 입니다.");
					System.out.println("영어 성적의 총점은 " + engTotal + "점이며, 평균은 " + (engTotal/5) + "점 입니다."); 
					System.out.println("수학 성적의 총점은 " + matTotal + "점이며, 평균은 " + (matTotal/5) + "점 입니다.");
				}
				
			} else if (selectNum.equals("4")) {
				run = false;
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}