// Program of coffee counter reciept

import java.util.Scanner;

public class CoffeeCounter{
   public static void main(String[] args){
   // Creating scanner object
   Scanner sc=new Scanner(System.in);
   String customerInput=" ";
   
    System.out.println("Welcome to Coffee Counter!");
    System.out.println("-------------------------------");
	
	while(true){
	System.out.println("\nWhat would you like to have today?");
	System.out.println("(Espresso | Americano | Cappuccino | Latte | Mocha)");
    System.out.print("Enter coffee name(or type 'exit' to close shop: ");	
	customerInput=sc.nextLine().trim();
	if(customerInput.equalsIgnoreCase("exit")){
	  System.out.println(" Shutting down the coffee machine");
	  break;
	}
	
	double pricePerCup=0;
	switch(customerInput.toLowerCase()){
	 case "espresso":
	      pricePerCup=150.0;
		  break;
	 case "americano":
          pricePerCup=200.0;
		  break;
	 case "cappuccino":
          pricePerCup=300.0;
		  break;
     case "latte":
          pricePerCup=500.0;
		  break;
     case "mocha":
          pricePerCup=400.0;
		  break;
     default:
          System.out.println("Sorry, we don't serve");
                    continue; 
    }
    
    System.out.print("How many cups of " + customerInput + " would you like? ");
            int quantity = sc.nextInt();
            sc.nextLine(); 
            if (quantity <= 0) {
                System.out.println("You need to order at least 1 cup!");
                continue;
            }
            double basicCost = pricePerCup * quantity;
            double gstAmount = basicCost * 0.18; // Adding 18% GST standard
            double totalBill = basicCost + gstAmount;	
	

    //  Printing the receipt
            System.out.println("\n---Order Receipt---");
            System.out.println("Item: " + customerInput);
            System.out.println("Price: " + pricePerCup + " x " + quantity);
            System.out.println("Base Cost: " + basicCost);
            System.out.println("GST (18%): " + gstAmount);
            System.out.println("-------------------------");
            System.out.println("TOTAL PAYABLE: " + totalBill);
            System.out.println("-------------------------");
            
            System.out.println("Serving next customer...");
        }
        
        sc.close(); 
    }
}    