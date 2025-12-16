import java.util.*;
class CelsiustoFahrenheit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int tempcel=sc.nextInt();
int tempfah=(tempcel*9/5)+ 32;
System.out.println(tempfah);
}
}