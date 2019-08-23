package jdbc;

import java.util.Scanner;

public class BankFirstPage {
	public static void main(String[] args) {
		int val,age;
		long ssn,moblie;
		String name,gender,address,email,password,conpassword;
		
		
		
		System.out.println("***********************************************************");
		System.out.println();
		System.out.println("          Now open your savings account online          ");
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println();
		
		System.out.println("1. Register");
		System.out.println("2. Login");
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the numer you want to perform banking operations");
		 val=sc.nextInt();
		
		switch(val)
		{
		case 1:
			System.out.println("Enter your Name");
			name=sc.next();
			System.out.println("Enter your gender");
			gender=sc.next();
			System.out.println("Enter your Age");
			age=sc.nextInt();
			System.out.println("Enter your Address");
			address=sc.next();
			System.out.println("Enter your Email-id");
			email=sc.next();
			System.out.println("Enter Social security number");
			ssn=sc.nextLong();
			System.out.println("Enter your Phone Number");
			moblie=sc.nextLong();
			System.out.println("Set your password");
			password=sc.next();
			System.out.println("Confirm your Password");
			conpassword=sc.next();
			
		}
		sc.close();
	}

	}


