package chap1;

import java.util.TreeSet;

public class Ex05TreeSet {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(); //Ʈ������ Ÿ���� ���ڿ��� ������
		
		names.add("��浿");
		names.add("��浿");
		names.add("�̱浿");
		names.add("�ڱ浿");
		names.add("ȫ�浿");
		names.add("���浿");
		names.add("�ֱ浿");
		
		System.out.println("ù��° ���� �̸� : " + names.first()); //�ѱ��� �����ټ����� ����
		System.out.println("������ ���� �̸� : " + names.last());
		System.out.println("���浿 �� ���� �̸� : " + names.lower("���浿"));
		System.out.println("���浿 ���� ���� �̸� : " + names.higher("���浿"));
		System.out.println("���浿���� �۰ų� ���� �̸� : " + names.floor("���浿")); //���浿�� �ֱ� ������ ���浿�� ���´�.
		System.out.println("��浿���� �۰ų� ���� �̸� : " + names.floor("��浿")); //��浿�� ���� ������ �� ������ �ڱ浿�� ���´�.
		System.out.println("���浿���� ũ�ų� ���� �̸� : " + names.ceiling("���浿")); //���浿�� �ֱ� ������ ���浿�� ���´�.
		System.out.println("��浿���� ũ�ų� ���� �̸� : " + names.ceiling("��浿")); //��浿�� ���� ������ ���� ������ ���浿�� ���´�.
	}

}
