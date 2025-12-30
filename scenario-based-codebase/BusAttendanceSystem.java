// Program of school bus attendance system

import java.util.Scanner;
 
public class BusAttendanceSystem {
     public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 
	 String students[]=new String[10];
	 for(int i=0;i<students.length;i++){
	 System.out.println(" Enter students name "+(i+1)+" : ");
	 students[i]=sc.nextLine();
	 }
	 int presentCount=0;
	 int absentCount=0;
	 System.out.println("School Bus Attendance System");
	 for(String name:students){
	 System.out.println(" Is "+name+" Present or Absent ? ");
	 String status=sc.nextLine().toLowerCase();
	 
	 if(status.equals("present")){
	 presentCount++;
	 }
	 else{
	 absentCount++;
	 }
	}
	
	// Display attendance summary
	System.out.println("\n-----------Attendance Summary---------");
	System.out.println("Total students: "+ students.length);
	System.out.println("Total present: "+ presentCount);
	System.out.println("Total absent: "+ absentCount);
	
	// Closing scanner stream
	sc.close();
	
  }
}	
	 
	 