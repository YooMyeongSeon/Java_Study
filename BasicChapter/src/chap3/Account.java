package chap3;

public class Account {
	public static final int MAX_BALANCE = 1000000; //�ִ� �Ա�&�ܾ��ѵ� ����
	
	private String ano; //���¹�ȣ
	private String name; //������
	private int balance; //�ܰ�
	
	public Account(String ano, String name, int balance) { //������
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance = balance;
	}
		
	public boolean d_Balance(int money) { //��ݽ� �ݾ� Ȯ��
		if (money > balance) {
			return false;
		} else {
			balance -= money;
			return true;
		}
	}
	public boolean i_Balance(int money) { //�Աݽ� �ݾ� Ȯ��
		if (balance + money > MAX_BALANCE) {
			return false;
		} else {
			balance += money;
			return true;
		}
	}
}
