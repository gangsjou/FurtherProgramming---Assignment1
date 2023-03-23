package myCar;

public class Customers {
	
  private String givenName;
  private String surname;
  private String email;
  private int passengerNum;      //passengers = total persons - 1
  public int count = 9;
  public int customerCount;
	  
  public Customers(String givenName, String surname, String email, int passengerNum)
  {
	this.givenName = givenName;
	this.surname = surname;
	this.email = email;
	this.passengerNum = passengerNum;   
  }
  public String getGivenName() {
	return givenName;
  }
  public String getSurname() {
    return surname;
  }
  public String getEmail() {
	return email;
  }
  public int getPassengerNum() {
	return passengerNum;
  }
  public int getCustomerCount() {
	return customerCount;
  }
  public void setCustomerCount(int customerCount) {
    this.customerCount = customerCount;
  } 
}
