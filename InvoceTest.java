package day3;

import java.util.Scanner;

public  class InvoceTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Invoice invoice=new Invoice();
		  System.out.print("Enter the description");
		String  description = sc.next();
		  invoice.setDes(description);
		
		  System.out.print("Enter the partumber ");
		  String partumber = sc.next();
		  invoice.setPartumber(partumber);
		  
		  System.out.print("Enter the quantity");
		  int quantity = sc.nextInt();
		  invoice.setQuantity(quantity);
		  
		  System.out.print("Enter the price ");
		  int price = sc.nextInt();
		  invoice.setPrice(price);
		  
		  
		  System.out.println("description     " +invoice.getDes());
		  System.out.println("Partumber"   +invoice.getPartumber());
		  System.out.println("Quantity "+invoice.getQuantity());
		  System.out.println(" Price  "+invoice.getPrice());
		  System.out.println("Quantity "+ invoice.getQuantity()*invoice.getPrice());  
		  
		  
	}
	 
	 
}
