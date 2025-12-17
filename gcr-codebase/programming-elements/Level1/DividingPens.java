// create dividing pens Calss to divide the pens among students
public class DividingPens
{
public static void main(String[] args)
{
//declare and initialize variables
    int totalPens = 14;
    int students = 3;
        
   //calculating pens per student
    int pensPerStudent = totalPens / students;
	
    //calculating remaining pens	
    int remainingPens = totalPens % students;  //calculating remaining pens
        
	//Display the result
     System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens); 
}
}