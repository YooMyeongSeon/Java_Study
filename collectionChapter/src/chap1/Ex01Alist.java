package chap1;

import java.util.ArrayList;

public class Ex01Alist { //�迭�� ���� ����

	public static void main(String[] args) {
		int[] ArrNumbers = new int[5]; //5ĭ �迭�� ���� Ÿ������ �غ��ϴ�.
		ArrNumbers[0] = 0; //ArrNumbers �ε��� 0�� 0 �����͸� �ִ�.
		String[] ArrNames = new String[5]; //5ĭ �迭�� ���ڿ� Ÿ�������� �غ��ϴ�.
		ArrNames[0] = "��浿"; //ArrNames �ε��� 0�� ��浿 �����͸� �ִ�.
		ArrNames[1] = "��浿";
		ArrNames[2] = "�̱浿";
		ArrNames[3] = "�ڱ浿";
		ArrNames[4] = "ȫ�浿";
		
		System.out.println("0���� �̸� : "+ArrNames[0]);
		
		ArrayList<String> names = new ArrayList<String>();
		//�迭�� ��������� ������ ���� �ʰ�, ���׸� Ÿ��(<>���� Ÿ��)�� ������ ���� Ÿ�Ը� �����ϴ�.
		//�⺻ Ÿ���� ���� Ÿ������ �����Ѵ�.(Wrapper Ŭ������ �Ѵ�.)
		
		//byte : Byte
		//short : Short
		//int : Integer
		//long : Long 
		//float : Float
		//double : Double
		//char : Character
		//boolean : Boolean
		
		names.add("��浿"); //names��� ArrayList�� �߰��Ѵ�.
		System.out.println("0���� �̸� : "+names.get(0));
		names.add("��浿");
		System.out.println("1���� �̸� : "+names.get(1));
		names.add("�̱浿");
		names.add("�ڱ浿");
		names.add("ȫ�浿"); //�ε��� 4
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) { //for���� ���� ����Ʈ ��� ������
			System.out.println((i)+"��° ��� : "+names.get(i));
		}
		
		names.add(2, "���浿"); //2�� �ε����� �����ְ�, ���� 2���� 3������ �з��ٳ���.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"��° ��� : "+names.get(i));
		}
		
		names.set(2, "���浿"); //2�� �ε��� ���� �ٲ۴�.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"��° ��� : "+names.get(i));
		}
		
		names.remove(2); //2�� �ε����� �����Ѵ�.
		
		System.out.println("------------------------------");
		for (int i=0; i<names.size(); i++) {
			System.out.println((i)+"��° ��� : "+names.get(i));
		}
		
		for (String name:names) { //�ݺ��ڸ� �����ϹǷ�, ���� for���� ����� �� �ִ�.
			System.out.println("�ݺ��ڷ� ����� �̸� : "+name);
		}
		
		names.clear(); //����Ʈ�� ��� �����Ѵ�.
		
		System.out.println(names);
		
		//ArrayList�� ����� : �˻��� ��������, ����½� �ӵ� ���ϰ� �ִ�.
	}
}
