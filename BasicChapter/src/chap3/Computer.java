package chap3;

public class Computer extends Calculator{
	@Override // �޼ҵ� �������̵� ������̼� : �����ص� ������, @Override�� �Է��ϸ� �������̵� ���� ��Ÿ�� ���� ������ ������ ��´�.
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle ����");
		return Math.PI * r * r;
	}
}
