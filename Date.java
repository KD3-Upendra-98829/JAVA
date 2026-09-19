package day3;

public class Date {
	int Day;
	int Month;
	int year;
		
public void	Date(int Day,int Month,int year) {
	this.Day =Day;
	this.Month = Month;
	this.year = year;
}

public int getDay() {
	return Day;
}

public void setDay(int day) {
	Day = day;
}

public int getMonth() {
	return Month;
}

public void setMonth(int month) {
	Month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}	
}
