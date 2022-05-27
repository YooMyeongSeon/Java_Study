package ScoreProgram;

public class Controller { // 기능적인 부분(내부 로직)
	
	private Service service = new Service();
	
	public Controller() { // 메인 메서드
		init();
	}
	
	private void init( ) { // 실제 main의 역할을 하게 될 메서드
		boolean run = true;
		do {
			int selectNum = View.menu(); // 메뉴 화면을 보여주는 기능
			
			switch (selectNum) {
			case 0 :
				dummy();
				break;
			case 1 : // 성적 입력 기능
				Student student = View.inputScore();
				service.save(student); // 성적 저장하기
				break;
			case 2 : // 개인별 성적 출력 기능
				String name = View.inputName(); //조회 학생 입력 받기
				Student s_student = service.selectByName(name); // 입력 받는 이름으로 조회하기
				View.viewScore(s_student); // 조회된 성적 출력
				break;
			case 3 : // 과목별 성적 출력 기능
				SubjectName subjectName = View.inputSubjuct();// 과목 이름 입력받기
				double[] subjectScore = service.selectBySubject(subjectName); // 입력 받는 과목 조회
				View.viewSubjectScore(subjectScore); // 조회된 과목 출력
				break;
			case 4 : // 종료 기능
				run = View.exitProgram();
				break;
			default : // 1 ~ 4 이외의 숫자를 누른 경우	
				View.error();
			}
		} while (run);
	}

	private void dummy() {
		Main.stuList[0] = new Student("고길동",78,64,82);
		Main.stuList[1] = new Student("김길동",85,71,64);
		Main.stuList[2] = new Student("이길동",74,69,57);
		Main.stuList[3] = new Student("박길동",74,77,95);
		Main.stuList[4] = new Student("홍길동",68,95,84);
		System.out.println("더미데이터 입력 완료");
	}
}