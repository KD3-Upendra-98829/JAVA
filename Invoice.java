package day3;
import java.util.Scanner;

public class Invoice {
	String description;
	String partumber;
	 int quantity;
	 int price;
	public Invoice() {};
	public Invoice(String description,String partumber,int quentity,int price) {
		this.description =description;
		this.partumber = partumber;
		this. quantity =  quantity;
		this.price = price;
	}
  public void setDes(String description ) {
	  this.description = description;
  }
  public String getDes() {
	  
	  return this.description;
  }
  public String getPartumber() {
	return partumber;
  }
  public void setPartumber(String partumber) {
	this.partumber = partumber;
  }
  public int getQuantity() {
	return quantity;
  }
  public void setQuantity(int quantity) {
	this.quantity = quantity;
  }
  public int getPrice() {
	return price;
  }
  public void setPrice(int price) {
	this.price = price;
  }
	
	
	
	
	
	
	
	
	

}
