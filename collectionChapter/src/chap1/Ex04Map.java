package chap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04Map {

	public static void main(String[] args) {
		HashMap<Integer, Student> stuList = new HashMap<>(); //<>���� Ÿ���� Ű, ���� Ÿ��
		stuList.put(1, new Student(1, "�����", 7));
		stuList.put(2, new Student(2, "������", 19));
		stuList.put(2, new Student(3, "���ٸ�", 26)); //�����ϴ� Ű�� �Է��ϸ� ���� Ű�� �ִ� ���� ����� �ٽ� ����
		
		System.out.println(stuList.size()); //�Էµ� ���� ���� Ȯ��
		
		String name = stuList.get(2).getStuName(); //������ �̸��� ������ �Ҵ�
		System.out.println("2�� �л� �̸� : " + name);
		System.out.println("------------------------------");
		
		//�� ���� ��ü �����͸� �о���� ��� : Set���� ������ �� �ݺ��ڸ� �̿��ϴ� ���
		//1-1. Ű�� Set���� �ٲٴ� ���
		Set<Integer> stuListKeySet = stuList.keySet(); //Set�� Ÿ���� ���ڷ� �����ϰ�, ���� Ű�� ������
		
		Iterator<Integer> stuListKeySetItr = stuListKeySet.iterator();
		
		while (stuListKeySetItr.hasNext()) { //stuListKeySetItr�� �������� ������ �ִ���,
			int stuListKey = stuListKeySetItr.next();
			Student stuListValue = stuList.get(stuListKey);
			
			System.out.println(stuListKey + "�� �л� �̸� : " + stuListValue.getStuName());
		}
		System.out.println("------------------------------");
		//1-2. ��Ʈ���� Set���� �ٲٴ� ���
		Set<Map.Entry<Integer, Student>> stuListEntrySet = stuList.entrySet();
		
		Iterator<Map.Entry<Integer, Student>> stuListEntrySetItr = stuListEntrySet.iterator();
		
		while (stuListEntrySetItr.hasNext()) {
			Map.Entry<Integer, Student> stuListEntry = stuListEntrySetItr.next();
			Integer stuListKey = stuListEntry.getKey();
			Student stuListValue = stuListEntry.getValue();
			
			System.out.println(stuListKey + "�� �л��� �̸� : " + stuListValue.getStuName());
		}
		
		System.out.println("------------------------------");
		if (stuList.containsKey(2)) { //2�� �л��� �ִ���(�Ҹ�)�� ����
			System.out.println("�̸� : " + stuList.get(2).getStuName()); 
		} else {
			System.out.println("�ش� ��ȣ �л��� �������� �ʽ��ϴ�.");
		}
	}
}
