package myCar;

public class Methods {
	
  public static void printBrand(String vehicleID, String brand, String model, String type, int seatsNum) {
    for(int i = 0; i < 9; i++) {
	  if(vehicleID.equalsIgnoreCase(vehicleID)) {
		System.out.printf("%5s %8s %10s %10s %5s", vehicleID, brand, model, type, seatsNum);
	  }
	}
  }

  public static void printDetails(String vehicleID, String brand, String model, String type, int yom, int seatsNum, String color){
	for(int i = 0; i < 9; i++) {
	  if(vehicleID.equalsIgnoreCase(vehicleID)) {
		System.out.printf("-------------------------");
		System.out.printf("%5s %20s", " ", "Vehicle Details" );
		System.out.printf("-------------------------");
		System.out.printf("%5s %20S %20s", "VehicleID: ", vehicleID);
		System.out.printf("%5s %20S %20S", "Vehicle Brand: ", brand);
		System.out.printf("%5s %20S %20S", "Vehicle Model: ", model);
		System.out.printf("%5s %20S %20S", "Vehicle Type: ", type);
		System.out.printf("%5s %20S %20S", "Manufacture Year: ", yom);
		System.out.printf("%5s %20S %20S", "Seats: ", seatsNum);
		System.out.printf("%5s %20S %20S", "Vehicle Color: ", color);
	  }
	}
  }
  
  public double getCalcTotalPay(double rentalpd, double discount, double insurancepd, double serviceFee, int rentalDaysNum) {
	double totalPay;
	if(//rentalDays >= 7) {
	(rentalpd*((100-discount)/100)+ insurancepd)*7+serviceFee = totalPay;
       return totalPay;
  }else if(rentalDays<7) {
	  (rentalpd*((100-discount)/100)+ insurancepd)*7+serviceFee = totalPay;
	  return totalPay;
  }  
  }

  public static void booking()
