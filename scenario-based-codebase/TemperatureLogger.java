// Program of temperature logger
import java.util.Scanner;

public class TemperatureLogger{
    public static void main(String[] args){
	// Create scanner object
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Record of temperature for 7 days");
	  double total=0.0;
	  double temperature[]=new double[7];
	  for(int i=0;i<temperature.length;i++){
	  System.out.println("Enter the temperature "+(i+1)+":");
	  temperature[i]=sc.nextDouble();
	  total=total+temperature[i];
	  }
	  double average=0.0;
	  double maxTemperature=Double.MIN_VALUE;
	  
	  // Checking for maximum value
	  for(int i=0;i<temperature.length;i++){
	   if(temperature[i]>maxTemperature){
	   maxTemperature=temperature[i];
	   }
	  }
	  
	  // Average temperature
	  average=total/temperature.length;
	  
	  // Displaying the average temperature and maximum value
	  System.out.println("Average value of temperature :"+average);
	  System.out.println("Maximum value of temperature :"+maxTemperature);
	  
	  // Closing scanner stream
	  sc.close();
	  
    }
}
	  
	  
	  
	  