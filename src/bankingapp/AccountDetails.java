package bankingapp;

public class AccountDetails {	
	String gmail;
	int pin;
	long  balance;
	String accNo;
	String accType;
	
	public AccountDetails(String accNo, String gmail, String accType, int pin, long balance) {
		super();
		this.gmail = gmail;
		this.pin = pin;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
}
