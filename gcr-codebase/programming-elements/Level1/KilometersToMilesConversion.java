// create kilometers to miles conversion Class
public class KilometersToMilesConversion
{
public static void main(String[] args)
{
// Declare and initialize variables
      double distanceInKilometers = 10.8;
      double conversionFactor = 1.6; 
		// 1 km = 1.6 miles (as given)

       // Convert kilometers to miles
       double distanceInMiles = distanceInKilometers * conversionFactor;

       // Display the result
       System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
		}
		}