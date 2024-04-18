package bankingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMethods {
	LoginMethods loginMethods=new LoginMethods();
	
	ArrayList<RegisterDetails> registerList=new ArrayList<RegisterDetails>();
	Scanner sc=new Scanner(System.in);
	String email, password;
	String firstName, lastName;
	int age;
	long mobileNo, aadharNo;
	
	public void register() {
		boolean found=false;
		System.out.print("Enter Email: ");
		email=sc.next();
		for(RegisterDetails registerDetails:registerList) {
			
			if(registerDetails.getEmail().equals(email)) {
				System.out.println("Account already Registered");
				System.out.println();
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.print("Enter First Name: ");
			firstName=sc.next();
			 
			System.out.print("Enter Last Name: ");
			lastName=sc.next();
			 
			System.out.print("Enter Age: ");
			age=sc.nextInt();
			
			System.out.print("Enter Password: ");
			password=sc.next();
			
			System.out.print("Enter Mobile Number: ");
			mobileNo=sc.nextLong();
			 
			System.out.print("Enter Aadhar Number: ");
			aadharNo=sc.nextLong();
				
			RegisterDetails register=new RegisterDetails(email, password, firstName, lastName, age, mobileNo, aadharNo);
			registerList.add(register);
			System.out.println("Registered Successfully");
			System.out.println();
			}
			
	}
	
	public void login() {
		boolean found=false;
		int choice;
		
		System.out.print("Enter email: ");
		email=sc.next();
		
		System.out.print("Enter Password: ");
		password=sc.next();
		
		for(RegisterDetails details:registerList) {
			if(details.getEmail().equals(email) && details.getPassword().equals(password)) {
				found=true;
				break;
			}
		}
		
		if(found) {
			do {
				System.out.println(" ______________________________");
				System.out.println("|                              |");
				System.out.println("| 1. Open Account              |");
				System.out.println("| 2. Search Account Details    |");
				System.out.println("| 3. Delete Account            |");
				System.out.println("| 4. Deposit Money             |");
				System.out.println("| 5. Withdraw Money            |");
				System.out.println("| 6. Check Balance             |");
				System.out.println("| 0. Log Out                   |");
				System.out.println("|______________________________|");
				System.out.print("Enter Your Choice: ");
				choice=sc.nextInt();
				System.out.println();
				
				switch(choice) {
					case 1: loginMethods.openAccount(email);
							break;
        	
					case 2: loginMethods.searchAccount(email, registerList);
							break;
        	
					case 3: loginMethods.deleteAccount();
							break;
        	
					case 4: loginMethods.depositMoney();
							break;
        	
					case 5: loginMethods.withdrawMoney();
							break;
        	
					case 6: loginMethods.checkBalance();
							break;
        	
					case 0: break;
        	
					default: System.out.println("Invalid Option");
							 break;
				}
			}while(choice!=0);
		}
		else {
			System.out.println("Incorrect Email or Password. Please Register if not registered.");
			System.out.println();
		}
	}
}
