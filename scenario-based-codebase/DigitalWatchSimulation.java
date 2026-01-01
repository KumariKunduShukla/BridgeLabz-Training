// Program of Digital watch simulation

public class DigitalWatchSimulation{
    public static void main(String[] args){
	
	for(int hour=0;hour<24;hour++){
	 for(int minutes=0;minutes<60;minutes++){
	
	// Simulate power cut
	if(hour==13 && minutes==0){
	  System.out.println("Power cut! Watch stopped at 13:00 pm");
	  break;
	}
	
	// Display time till 13:00
	System.out.format("%02d:%2d\n", hour, minutes);
	 }
	 
	 // Break condition for outer loop
	 if(hour==13)
	 break;
    }
  }
}
	
	