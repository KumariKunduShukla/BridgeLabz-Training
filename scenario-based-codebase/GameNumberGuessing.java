// Program for number guessing game

import java.util.Scanner;

public class GameNumberGuessing{
     public static void main(String[] args){
	 // Create scanner object
	 Scanner sc=new Scanner(System.in);
	 
	 int guess;
	 int number=(int)(Math.random()*100)+1;
	 int attempts=0;
	 
	 System.out.println("Guess a number between 1 and 100");
     System.out.println("You have only 5 attempts!");
	 
	 do{
	 System.out.println("Enter your number guess");
	 guess=sc.nextInt();
	 attempts++;
	 
	 if(guess>number){
	 System.out.println(" You Guessed\"Too High\"");
	 }
	 else if(guess<number){
	 System.out.println(" You Guessed\"Too Low\"");
	 }
	 else{
	 System.out.println(" Great! You Guessed correct"+ attempts +"attempts");
	 break;
	 }
	 }
	 while(attempts<5);
	 
	 if(guess != number){
		 System.out.println("You guessed wrong! The correct number was: "+number);
	 }
	 
	 // Closing scanner stream
	 sc.close();
	 
  }
}
	 