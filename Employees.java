package day3;

public class Employees {
    
		String firstname;
		String lastname;
		double monthlysalary;
		
		public void Employees() {
	}
	public void Employees(String firstname,  String lastname, double monthlysalary) {
		this.firstname = firstname;
		this.lastname =lastname;
		this.monthlysalary = monthlysalary;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getMonthlysalary() {
		return monthlysalary;
	}
	public void setMonthlysalary(double monthlysalary) {
		if(monthlysalary>0.0)
		this.monthlysalary = monthlysalary;
	}
	  
	public void giveRaise(double percent) {
		if(monthlysalary>0) {
			monthlysalary +=monthlysalary*(12/100);
		}
	}
	
	
		
	}

