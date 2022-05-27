package chap1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex06TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> students = new TreeMap<>();
		
		students.put("��浿", 90);
		students.put("��浿", 70);
		students.put("�̱浿", 80);
		students.put("�ڱ浿", 50);
		students.put("ȫ�浿", 60);
		students.put("���浿", 30);
		students.put("�ֱ浿", 40);
		
		System.out.println("ù��° ������ �̸� : " + students.firstEntry().getKey());
		System.out.println("ù��° ������ ���� : " + students.firstEntry().getValue());
		System.out.println("������ ������ �̸� : " + students.lastEntry().getKey());
		System.out.println("������ ������ ���� : " + students.lastEntry().getValue());
		
		System.out.println("���浿 �� ���� �̸� : " + students.lowerEntry("���浿"));
		System.out.println("���浿 ���� ���� �̸� : " + students.higherEntry("���浿"));
		System.out.println("���浿���� �۰ų� ���� �̸� : " + students.floorEntry("���浿"));
		System.out.println("��浿���� �۰ų� ���� �̸� : " + students.floorEntry("��浿"));
		System.out.println("���浿���� ũ�ų� ���� �̸� : " + students.ceilingEntry("���浿"));
		System.out.println("��浿���� ũ�ų� ���� �̸� : " + students.ceilingEntry("��浿"));
		
		//��ü ������ ���� ��ȸ
		Set<Map.Entry<String, Integer>> studentsEntrySet = students.entrySet();
		
		Iterator<Map.Entry<String, Integer>> studentsEntrySetItr = studentsEntrySet.iterator(); //�� ���� ������ �ݺ��ڷ� ���ؼ� �����ϴ� �۾�
		
		while (studentsEntrySetItr.hasNext()) {
			Map.Entry<String, Integer> studentsEntry = studentsEntrySetItr.next();
			
			String name = studentsEntry.getKey();
			Integer score = studentsEntry.getValue();
			
			System.out.println(name + "�� ���� : " + score);
		}
	}
}
