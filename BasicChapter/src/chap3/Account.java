package chap3;

public class Account {
	public static final int MAX_BALANCE = 1000000; //최대 입금&잔액한도 설정
	
	private String ano; //계좌번호
	private String name; //예금주
	private int balance; //잔고
	
	public Account(String ano, String name, int balance) { //생성자
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
		
	public boolean d_Balance(int money) { //출금시 금액 확인
		if (money > balance) {
			return false;
		} else {
			balance -= money;
			return true;
		}
	}
	public boolean i_Balance(int money) { //입금시 금액 확인
		if (balance + money > MAX_BALANCE) {
			return false;
		} else {
			balance += money;
			return true;
		}
	}
}
