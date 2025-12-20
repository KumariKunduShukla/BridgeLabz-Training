// Program to check whether a season is spring season or not

public class SpringSeasonUsingMethods{
        
	   // Create method to check spring season
	   public static boolean seasonCheck(int month, int day){
	   if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)){
	   return true;
	   }
	   else{
	   return false;
	   }
	  }
	 // Main method  
    public static void main(String[] args) {

        // Read month and day from command the line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        
        // Print and check for spring season
		if(seasonCheck(month,day)){
		System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}
}