// Program to generate the result
import java.util.Scanner;

public class ResultGenerator{
     public static void main(String[] args){
	 // Create scanner object
	 Scanner sc=new Scanner(System.in);
	 
	 int subjects=5;
	 double totalMarks=0;
	 int marks[]=new int[5];
	 for(int i=0 ; i<marks.length ; i++){
	 System.out.println("Enter the marks for subject "+(i+1)+":");
	 marks[i]=sc.nextInt();
	 totalMarks=totalMarks+marks[i];
	 }
	 double averageMarks=totalMarks/subjects;
	 System.out.println("Average marks:"+ averageMarks);
	 
	 switch((int)averageMarks/10){
	 case 10:
	 case 9:
	   System.out.println("Grade: A ");
	   break;
	 case 8:
	 case 7:
	   System.out.println("Grade: B ");
	   break;
	 case 6:
	   System.out.println("Grade: C ");
	   break;
	 case 5:
	 case 4:
	 System.out.println("Grade: D ");
	 break;
	 default:
	 System.out.println("Grade: F ");
	}
	
	// Closing scanner stream
	sc.close();
 }
}