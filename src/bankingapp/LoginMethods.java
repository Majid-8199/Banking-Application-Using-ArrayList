package bankingapp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoginMethods {
	
	ArrayList<AccountDetails> accountList=new ArrayList<AccountDetails>();
	Scanner sc=new Scanner(System.in);
	
	String firstName, lastName, gmail;
	int age, pin;
	long mobileNo, aadharNo, balance;
	String accType, accNo;
	
	public String generateAccNo() {
		String formatted=String.format("%08d", new Random().nextInt(100000000));
		return "141401" + formatted;
	}
	
	public void openAccount(String email) {
		 
		 System.out.println("Enter Account Type: ");
		 accType=sc.next();
		 
		 System.out.println("Enter PIN: ");
		 pin=sc.nextInt();
		 
		 balance=0;
		 accNo=generateAccNo();
		 System.out.println("Account Number: "+accNo);
		 
		 AccountDetails account=new AccountDetails(accNo, email, accType, pin, balance);
		 accountList.add(account);
		 System.out.println("Account Created");
	}
	
	public void searchAccount(String email, ArrayList<RegisterDetails> registerList) {
		boolean found=false;
		
		for(AccountDetails accountDetails:accountList) {
			if(accountDetails.getGmail().equals(email) ) {
				found=true;
				System.out.println("Account Number: " + accountDetails.getAccNo());
				System.out.println("Account Type: " + accountDetails.getAccType());
				System.out.println();
			}
		}
		for(RegisterDetails registerDetails:registerList) {
			if(registerDetails.getEmail().equals(email) ) {
				found=true;
				System.out.println("First Name: "+registerDetails.getFirstName());
				System.out.println("Last Name: "+registerDetails.getLastName());
				System.out.println("Age: "+registerDetails.getAge());
				System.out.println("Email: "+registerDetails.getEmail());
				System.out.println("Mobile Number: "+registerDetails.getMobileNo());
				System.out.println("Aadhar Number"+registerDetails.getAadharNo());
				System.out.println();
			}
		}
		if(!found) {
			System.out.println("Invalid Acoount Number");
		}
	}
	
	public void deleteAccount() {
		boolean found=false;
		System.out.println("Enter Account Number: ");
		accNo=sc.next();
		
		for(AccountDetails accountDetails:accountList) {
			found=true;
			System.out.println("Enter PIN: ");
			pin=sc.nextInt();
			if(accountDetails.getAccNo().equals(accNo)) {
				if(accountDetails.getPin()==pin){
					accountList.remove(accountDetails);
					System.out.println("Account Deleted");
					break;
				}
				else {
					System.out.println("Invalid PIN");
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Invalid Account Number");
		}
	}
	
	public void depositMoney() {
		boolean found=false;
		System.out.println("Enter Account Number: ");
		accNo=sc.next();
		
		for(AccountDetails accountDetails:accountList) {
			if(accountDetails.getAccNo().equals(accNo)) {
				found=true;
				System.out.println("Enter PIN: ");
				pin=sc.nextInt();
				
				if(accountDetails.getPin()==pin){
					System.out.println("Enter Deposit Amount: ");
					long amount=sc.nextLong();
					accountDetails.setBalance(accountDetails.getBalance()+amount);
					System.out.println("Amount Deposited");
					break;
				}
				else {
					System.out.println("Invalid Password");
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Invalid Account Number");
		}
	}
	
	public void withdrawMoney() {
		boolean found=false;
		System.out.println("Enter Account Number: ");
		accNo=sc.next();
		
		for(AccountDetails accountDetails:accountList) {
			
			if(accountDetails.getAccNo().equals(accNo)) {
				found=true;
				System.out.println("Enter PIN: ");
				pin=sc.nextInt();
				if(accountDetails.getPin()==pin){
					System.out.println("Enter Withdraw Amount: ");
					long amount=sc.nextLong();
					if(amount<=accountDetails.getBalance()) {
						accountDetails.setBalance(accountDetails.getBalance()-amount);
						System.out.println("Money Withdrawn");
						break;
					}
					else {
						System.out.println("Insufficient Balance");
						return;
					}
					
				}
				else {
					System.out.println("Invalid Password");
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Invalid Account Number");
		}

	}
	
	public void checkBalance() {
		boolean found=false;
		System.out.println("Enter Account Number: ");
		accNo=sc.next();
		
		for(AccountDetails accountDetails:accountList) {
			if(accountDetails.getAccNo().equals(accNo)) {
				found=true;
				System.out.println("Enter PIN: ");
				pin=sc.nextInt();
				if(accountDetails.getPin()==pin){
					System.out.println("Balance: "+accountDetails.balance);
					break;
				}
				else {
					System.out.println("Invalid Password");
					return;
				}
			}
		}
		if(!found) {
			System.out.println("Invalid Account Number");
		}
	}
}
