import java.util.Scanner;
public class Question2 {
 public static void main(String[] args ){
			Scanner sc = new Scanner(System.in);
		
			if(!sc.hasNextDouble()) {
				System.out.println("number is not valid");
			}
	         double num1 = sc.nextDouble();
	         
	         if(!sc.hasNextDouble() ) {
		     System.out.println("number is not valid");
		     return ;
	         }
	         double num2 = sc.nextDouble(); 
	         
	         double avg = (num2+num1)/2;
	         System.out.println(avg);
	}
}
