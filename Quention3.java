import java.util.Scanner;
public class Quention3 {
	public static void main(String[] arg) {
Scanner sc = new  Scanner(System.in);
int total = 0;  
 int choice;
  do {
	// Menu 
	  System.out.println("\n===== MENU ====="); 
	  System.out.println("1. Dosa , Price : 50");
	  System.out.println("2. Samosa , Price : 20"); 
	  System.out.println("3.  Idli, Price : 40");
	  System.out.println("enter the 4 for total"); 
	  System.out.print("Enter your choice: ");
	  choice = sc.nextInt();
	    switch(choice ) {
	    case 1: 
	    	System.out.println("Enter quantity : ");
	    	int quantity = sc.nextInt();
	    	total = total + (quantity * 50);
	    	break;
	    
	    case 2:
	    	System.out.println("Enter the quantity of Samosa: ");
	         quantity = sc.nextInt();
	         total = total +(quantity*20);
	         break;
	    case 3: 
	    	System.out.println("Enter the quantity of Idli   ");
	    	quantity = sc.nextInt();
	    	total = total+(quantity*40);
	    	break;
	    	default :
	    		System.out.println("Give your grong chpice");
	    }
 
  } while(choice  != 4);
	
	System.out.println("Total bill of customer  "+total);	

}
}