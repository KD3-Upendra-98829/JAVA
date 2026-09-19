import java.util.Scanner;
public class Assignment1 {
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.err.println("Enter the number : ");
	   int num1  = sc.nextInt();
	   Integer num = new Integer(num1);
	   String binary = num.toBinaryString(num);
	   System.out.println(binary);
	   String oct = num.toOctalString(num1);
	  System.out.println(oct);		
	  String hexa = num.toHexString(num1);
	  System.err.println(hexa);
	   
	}
}
