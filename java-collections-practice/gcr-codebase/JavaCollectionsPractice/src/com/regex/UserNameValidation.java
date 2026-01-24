package com.regex;

import java.util.Scanner;
import java.util.regex.*;

public class UserNameValidation {
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name:");
		String name=sc.nextLine();
		
		String regex="^[A-Za-z][A-Za-z0-9_]{4,14}$";
		Pattern pattern=Pattern.compile(regex);
		
		if(name.matches(regex)) {
			System.out.println("Valid user name ");
		}
		
		else {
			System.out.println("Invalid user name");
		}
		
		sc.close();
	}

}
