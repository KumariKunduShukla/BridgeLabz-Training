import java.util.*;
class Average
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();
		
		System.out.print("Enter third number: ");
        double number3 = sc.nextDouble();
		double average=(number1 +number2+number3)/3;
		System.out.println("Average="+ average);
		
		}
		}