package bankingapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		MainMethods methods=new MainMethods();
		
		do {
			System.out.println("*** ** * BANKING APPLICATION * ** ***");
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("0. Exit");
			System.out.print("Enter a choice: ");
			choice=sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1: methods.login();
					break;
					
			case 2: methods.register();
			 		break;
			 		
			case 0: System.out.println("Exited Application");
					break;
					
			default: System.out.println("Invalid Choice! Please try again.");
					 System.out.println();
			  		 break;	
			}
		}while(choice!=0);
		sc.close();
		
	}

}
