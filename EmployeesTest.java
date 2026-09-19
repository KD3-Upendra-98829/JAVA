package day3;
import java.util.Scanner;

public class EmployeesTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		Employees employees = new Employees();
		
		System.out.println("Enter the first name - ");
		String Firstname = sc.next();
		employees.setFirstname(Firstname);
	
		System.out.println("Enter the lastname ");
		String lastName = sc.next();
		employees.setLastname(lastName);
		
		
		System.out.println("Enter your salary :  ");
		double monthlysalary = sc.nextDouble();	
		

		System.out.println("Fullname  "+  Firstname+ lastName);
		// System.out.println("  "+   lastName);
		System.out.println("Salary of employees yearly  "+(monthlysalary*12)*0.12 );
		}	
	}


