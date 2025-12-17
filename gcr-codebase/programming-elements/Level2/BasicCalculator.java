import java.util.Scanner;
// create basic calculator Class to perform arithmetic calculation
public class BasicCalculator
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  // taken input from user for number1 and number2
  double number1=sc.nextDouble();
  double number2=sc.nextDouble();
  
   double addition=number1+number2; // calculating addition
   double substraction=number1-number2;// calculating substraction
   double multiplication=number1*number2;//  calculating multiplication
   double division=number1/number2;// calculating division
   
   // displays the result
   System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " 
                           + multiplication + ", and " + division);
  
}
}