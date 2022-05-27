package ScoreProgram;

public class Student {
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;
	private int totalScore;
	private double avgScore;
	
	public Student(String name, int korScore, int engScore, int matScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
		this.totalScore = korScore + engScore + matScore;
		this.avgScore = totalScore/3.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMatScore() {
		return matScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}
}