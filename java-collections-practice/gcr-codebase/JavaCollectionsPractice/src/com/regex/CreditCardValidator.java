package com.regex;

import java.util.regex.*;

class CreditCardValidator{
	public static void main(String[] args){
		
		//Sample credit card number
		String card="4122222222222222";
		
		//Regex pattern 
		String regex="\\b(4[0-9]{15}|5[0-9]{15})\\b";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(card);
		
		if(m.matches())
			System.out.println("Valid Credit Card");
		else
			System.out.println("Invalid Credit Card");
	}
}