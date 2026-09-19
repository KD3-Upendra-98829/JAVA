package day3;


import java.util.Scanner;
public class DateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		System.out.print("Enter the Day -");
		   int Day =sc.nextInt();
		   date.setDay(Day);
		   
		   
		   
		   System.out.print("Enter the month -");
		   int month = sc.nextInt();
		   date.setMonth(month);
		   
		   
		   System.out.print("Enter the year -");
		   int year= sc.nextInt();
		   date.setYear(year);
		
		
		   System.out.println( date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
		   
		   
		   
		   
	}
}
