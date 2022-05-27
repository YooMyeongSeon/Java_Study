package ScoreProgram;

public class Controller { // ������� �κ�(���� ����)
	
	private Service service = new Service();
	
	public Controller() { // ���� �޼���
		init();
	}
	
	private void init( ) { // ���� main�� ������ �ϰ� �� �޼���
		boolean run = true;
		do {
			int selectNum = View.menu(); // �޴� ȭ���� �����ִ� ���
			
			switch (selectNum) {
			case 0 :
				dummy();
				break;
			case 1 : // ���� �Է� ���
				Student student = View.inputScore();
				service.save(student); // ���� �����ϱ�
				break;
			case 2 : // ���κ� ���� ��� ���
				String name = View.inputName(); //��ȸ �л� �Է� �ޱ�
				Student s_student = service.selectByName(name); // �Է� �޴� �̸����� ��ȸ�ϱ�
				View.viewScore(s_student); // ��ȸ�� ���� ���
				break;
			case 3 : // ���� ���� ��� ���
				SubjectName subjectName = View.inputSubjuct();// ���� �̸� �Է¹ޱ�
				double[] subjectScore = service.selectBySubject(subjectName); // �Է� �޴� ���� ��ȸ
				View.viewSubjectScore(subjectScore); // ��ȸ�� ���� ���
				break;
			case 4 : // ���� ���
				run = View.exitProgram();
				break;
			default : // 1 ~ 4 �̿��� ���ڸ� ���� ���	
				View.error();
			}
		} while (run);
	}

	private void dummy() {
		Main.stuList[0] = new Student("��浿",78,64,82);
		Main.stuList[1] = new Student("��浿",85,71,64);
		Main.stuList[2] = new Student("�̱浿",74,69,57);
		Main.stuList[3] = new Student("�ڱ浿",74,77,95);
		Main.stuList[4] = new Student("ȫ�浿",68,95,84);
		System.out.println("���̵����� �Է� �Ϸ�");
	}
}