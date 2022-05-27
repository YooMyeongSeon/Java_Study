package ScoreProgram;

public class Service { //데이터 저장소와 연결을 담당하는 부분

	public void save(Student student) {
		for (int i=0; i<Main.stuList.length; i++) {
			if (Main.stuList[i] == null) {
				Main.stuList[i] = student;
				return; //반환값이 없을때의 리턴은 함수 종료
			}
		}
	}

	public Student selectByName(String name) {
		Student student = null;
		for (int i=0; i<Main.stuList.length; i++) {
			if (Main.stuList[i] != null) {
				if (Main.stuList[i].getName().equals(name)) {
					student = Main.stuList[i];
					break;
				}
			}
		}
		return student;
	}
	
	public double[] selectBySubject(SubjectName subjectName) {
		if (subjectName==SubjectName.KOR) {
			return korScore();
		} else if (subjectName==SubjectName.ENG) {
			return engScore();
		} else if (subjectName==SubjectName.MAT) {
			return matScore();
		} else {
			return null;
		}
	}
	
	private double[] korScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.stuList.length; i++) {
			if (Main.stuList[i] != null) {
				hap += Main.stuList[i].getKorScore();
				count ++;
			}
		}
		return new double[] {hap,(hap/count)};
	}
	
	private double[] engScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.stuList.length; i++) {
			if (Main.stuList[i] != null) {
				hap += Main.stuList[i].getEngScore();
				count ++;
			}
		}
		return new double[] {hap,(hap/count)};
	}
	
	private double[] matScore() {
		double hap = 0.0;
		int count = 0;
		for (int i=0; i<Main.stuList.length; i++) {
			if (Main.stuList[i] != null) {
				hap += Main.stuList[i].getMatScore();
				count ++;
			}
		}
		return new double[] {hap,(hap/count)};
	}

}