import java.util.*;
class SimpleInterest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
		double time = sc.nextDouble();
		
		double simpleinterest= (principal*rate*time)/100;
		System.out.println(simpleinterest);
		}
		}