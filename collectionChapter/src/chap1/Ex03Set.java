package chap1;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03Set { //Set�� ���� ����

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		
		names.add("��浿"); //names �¿� �߰�
		names.add("��浿");
		names.add("��浿");
		names.add("�̱浿");
		names.add("��浿");
		names.add("�ڱ浿");
		
		System.out.println("��ü ���� : "+names.size()); //�ߺ��� ��浿�� �����ϰ� 4�� ǥ��
		
		//Set���� ��ü ������ ��ȸ�ϱ�(Set���� �����͸� ������ �Ϸķ� �����.)
		Iterator<String> itr = names.iterator();
		
		//���� ������ �ִ��� üũ ��, �ϳ��� ���
		while (itr.hasNext()) { //itr�� �������� ������ �ִ��İ� ����
			String name = itr.next();
			System.out.println("�̸� : "+name);
		}
		//[����]�ݺ��ڴ� 1ȸ���̰� Set�� �����ʹ� ������ �����ִ�.
		
		//1. �ݺ���(iterator, iterable �������̽��� ����) : ���� for��(foreach��)�� �����ϴ�.
		
		String[] tests = new String[100];
		
		for (int i=0; i<tests.length; i++) {
			//for�� ����
		}
		
		System.out.println("------------------------------");
		for (String str:tests) { //���� for��
			System.out.println("�̸� : "+str);
		}
		
		System.out.println("------------------------------");
		for (String name:names) { //Set�� �ݺ��ڸ� �����ϹǷ�, ���� for���� ����� �� �ִ�.
			System.out.println("�̸� : "+name);
		}
		
		//2. ������ �ߺ��ΰ�
		System.out.println("------------------------------");
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		studentSet.add(new Student(1, "��浿", 55)); //�л����� ��Ͽ� �߰�
		studentSet.add(new Student(2, "��浿", 56));
		studentSet.add(new Student(3, "�̱浿", 57));
		studentSet.add(new Student(4, "��浿", 52));
		studentSet.add(new Student(2, "�ڱ浿", 55)); //��浿�� �ڱ浿�� ���ڰ� ����.(���� �� 5��)
		
		System.out.println("�ο��� : "+studentSet.size()); //�й��� ������ ���� ������� �ν��ϰ� �����߱� ������, ��浿�� �ڱ浿�� ���� ������� �ν��Ѵ�.
		
	}
}
