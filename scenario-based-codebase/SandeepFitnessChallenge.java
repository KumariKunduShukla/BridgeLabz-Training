// Program of Sandeep Fitness Challenge Tracker
import java.util.Scanner;

public class SandeepFitnessChallenge{
    public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 
	 int pushUpCount[]=new int[7];
	 for(int i=0;i<pushUpCount.length;i++){
	   System.out.println("Enter "+(i+1)+"day count:");
	   pushUpCount[i]=sc.nextInt();
	 }
	  int totalCount=0;
	  double averageCount=0;
	  int activeDays=0;
	  
	  // Use for each loop to iterate and calculate total and average
	  for(int ele:pushUpCount){
	    if(ele==0){
	    continue;
	   }
	  else{
	  totalCount=totalCount+ele;
	  activeDays++;
	  }
	 }
	  
	 averageCount=(double)totalCount/activeDays;
	 
	 //Display the result
	 System.out.println("-----Sandeep Fitness Challenge Tracker-----");
	 System.out.println("----------------------------------------------");
	 System.out.println(" Total Counts:    "+totalCount);
	 System.out.println(" Average Counts:  "+averageCount);
	 
	 // Closing scanner stream 
	 sc.close();
    }	 
}