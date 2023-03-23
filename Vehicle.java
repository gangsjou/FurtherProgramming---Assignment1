package myCar;

import java.util.ListIterator;

public class Vehicle {
	

  private String vehicleID;
  private String brand;
  private String model;
  private String type;
  private int yom;
  private int seatsNum;
  private String color;
  private double rentalpd;
  private double insurancepd;
  private double serviceFee;
  private double discount;
  private int index;
  public int count = 9;
  
  public Vehicle(String vehicleID, String brand, String model, String type, int yom, int seatsNum,
		  String color, double rentalpd, double insurancepd, double serviceFee, double discount)
  {
    this.vehicleID = vehicleID;
    this.brand = brand;
    this.model = model;
    this.type = type;
    this.yom = yom;
    this.seatsNum = seatsNum;
    this.color = color;
    this.rentalpd = rentalpd;
    this.insurancepd = insurancepd;
    this.serviceFee = serviceFee;
    this.discount = discount;
    
}
  public String getVehicleID() {
    return vehicleID;
  }
  public String getBrand() {
	return brand;
  }
  public String getModel() {
	return model;
  }
  public String getType() {
	return type;
  }
  public int getYom() {
	return yom;
  }
  public int getSeatsNum() {
	return seatsNum;
  }
  public String getColor() {
	return color;
  }
  public double getRentalpd() {
	return rentalpd;
  }
  public double getServiceFee() {
	return serviceFee;
  }
  public double getInsurancepd() {
	return insurancepd;
  }
  public double getDiscount() {
	return discount;
  }
  
 
}
 
  
  
