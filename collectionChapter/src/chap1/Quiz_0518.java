// 학생 다섯명의 정보를 입력 받는다.
// 이름과 국어, 영어, 수학, 3과목 점수를 입력 받는다.
// 개인별 성적을 조회할 수 있다.(총점과 평균)
// 과목별 성적도 조회할 수 있다.(총점과 평균)
// 종료를 선택하지 않으면 메뉴가 반복적으로 출력되도록 하고, 메뉴는 성적 입력, 개인별 성적 조회, 과목별 성적 조회, 종료를 만든다.
// [더미]1. 고길동 국어 78, 영어 64, 수학 82
// [더미]2. 김길동 국어 85, 영어 71, 수학 64
// [더미]3. 이길동 국어 74, 영어 69, 수학 57
// [더미]4. 박길동 국어 74, 영어 77, 수학 95
// [더미]5. 홍길동 국어 68, 영어 95, 수학 84

package chap1;

import java.util.Scanner;

public class Quiz_0518 {

	public static void main(String[] args) { //프로그램의 시작과 끝을 담당하는 메인메소드
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		boolean input = false;
		
		String[] student = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
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
						student[i] = studentName;
						System.out.println(studentName+" 학생의 국어 점수를 입력하세요 : ");
						int korScore = scan.nextInt();
						kor[i] = korScore;
						System.out.println(studentName+" 학생의 영어 점수를 입력하세요 : ");
						int engScore = scan.nextInt();
						eng[i] = engScore;
						System.out.println(studentName+" 학생의 수학 점수를 입력하세요 : ");
						int matScore = scan.nextInt();
						mat[i] = matScore;
						System.out.println(studentName+" 학생의 점수를 모두 입력하였습니다.");
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
						System.out.println(student[i] + "학생의 성적은 국어 : " + kor[i] + "점, 영어 : " + eng[i] + "점, 수학 : " + mat[i] + "점 입니다.");
						System.out.println("총점은" + (kor[i]+eng[i]+mat[i]) + "점 이며, 평균은 " + ((kor[i]+eng[i]+mat[i])/3) + "점 입니다.");
					}
				}
				
			} else if (selectNum.equals("3")) {
				System.out.println("과목별 성적 조회 입니다.");
				if (input == false) {
					System.out.println("아직 학생 정보가 입려되지 않았습니다.");
				} else {
					System.out.println("국어 성적의 총점은 " + (kor[0]+kor[1]+kor[2]+kor[3]+kor[4]) + "점이며, 평균은 " + ((kor[0]+kor[1]+kor[2]+kor[3]+kor[4])/5) + "점 입니다.");
					System.out.println("영어 성적의 총점은 " + (eng[0]+eng[1]+eng[2]+eng[3]+eng[4]) + "점이며, 평균은 " + ((eng[0]+eng[1]+eng[2]+eng[3]+eng[4])/5) + "점 입니다."); 
					System.out.println("수학 성적의 총점은 " + (mat[0]+mat[1]+mat[2]+mat[3]+mat[4]) + "점이며, 평균은 " + ((mat[0]+mat[1]+mat[2]+mat[3]+mat[4])/5) + "점 입니다.");
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
