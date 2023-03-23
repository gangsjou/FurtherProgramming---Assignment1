package myCar;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.HashMap;

public class MyCar {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int menuChoice = 0;
	String userInput;
	String delimiter = ",";
	String line;
	int i;
	String vehicleID;
	HashMap <String, Integer> qResults = new HashMap<String, Integer>(); 
	Vehicle[] vehicles = new Vehicle[20];
	int arrayCount = 9;
	int subMenuChoice = 0;
	String carID;
       
    vehicles[0] = new Vehicle("C001", "Toyota", "Yaris", "Sedan", 2012, 4, "Blue", 50.00, 15.00, 10.00, 10.00);
    vehicles[1] = new Vehicle("C002", "Audi", "A3", "Sedan", 2015, 5, "Red", 65.00, 10.00, 20.00, 10.00);
    vehicles[2] = new Vehicle("C003", "Toyota", "Kluga", "SUV", 2019, 7, "Grey", 70.00, 20.00, 20.00, 10.00);
    vehicles[3] = new Vehicle("C004", "Audi", "A3", "Sedan", 2015, 5, "Red", 65.00, 10.00, 20.00, 10.00);
    vehicles[4] = new Vehicle("C005", "Holden", "Cruze", "Hatch", 2020, 4, "Green", 70.00, 10.00, 10.00, 10.00);
    vehicles[5] = new Vehicle("C006", "BMW", "X5", "SUV", 2018, 7, "White", 100.00, 25.00, 20.00, 10.00);
    vehicles[6] = new Vehicle("C007", "BMW", "320i", "Sedan", 2021, 5, "Grey", 75.00, 10.00, 15.00, 0.00);
    vehicles[7] = new Vehicle("C008", "Ford", "Focus", "Sedan", 2014, 5, "Red", 45.00, 10.00, 10.00, 0.00);
    vehicles[8] = new Vehicle("C009", "Ford", "Puma", "SUV", 2015, 5, "Black", 70.00, 20.00, 15.00, 20.00);
    
	System.out.println("     --------------------------------");
	System.out.println("     Welcome to MyCar Vehicle Rentals");
	System.out.println("     --------------------------------");
			
	while(menuChoice != 4) {
			
	  System.out.println("     1. Search cars by brand");
	  System.out.println("     2. Browse cars by vehicle type");
	  System.out.println("     3. Select vehicle by number of passengers");
	  System.out.println("     4. Exit");
	  System.out.println("\n");
	  System.out.println("     Please select a number from the menu");
	  System.out.println("\n");
		  
	  menuChoice = Integer.parseInt(input.nextLine());
				
	  switch(menuChoice) {	

	  case 1 :
		
		int jNum;
		int sNum = 0;
		int c = 0;
	
		//Search cars by brand
		System.out.println("What brand of car would you like to hire?");
		userInput = input.nextLine();
		int j = 1;
		for(i = 0; i < arrayCount; i++) {
		if(userInput.equalsIgnoreCase(vehicles[i].getBrand())) {
		  System.out.println(j+".   " + vehicles[i].getVehicleID() + " - " + vehicles[i].getModel() + " " + vehicles[i].getType()
				  + " " + "with "+ vehicles[i].getSeatsNum() + " seats");
		  carID=vehicles[i].getVehicleID();
		  qResults.put(carID, i);
		  j++;
		  sNum++;
		  }
		}
		System.out.println(j+".   Select a vehicle to hire");
		j++;
		System.out.println(j+".   Go to the main menu");
		jNum = j;
		System.out.println(" ");
		System.out.println("     Please select an item from the menu");
		userInput = input.nextLine();
		subMenuChoice = Integer.parseInt(input.nextLine());
		while(subMenuChoice != jNum) {
		  for(j = 1; j < jNum; j++) { 
			for(String n : qResults.keySet()) {
			  if(qResults.containsValue(i)){
		        Methods.printDetails(vehicles[i].getVehicleID(), vehicles[i].getBrand(), vehicles[i].getModel(), vehicles[i].getType(), 
		    	  vehicles[i].getYom(), vehicles[i].getSeatsNum(), vehicles[i].getColor());
		      }
		    }
		  }
		}
		System.out.println("Do you wish to book this vehicle? Yes/No");
		userInput = input.nextLine();
		if(userInput.equalsIgnoreCase("yes"){
	      
		}
		break;	
				
	  case 2 :
			//Browse cars by vehicle type
			 // List<List<String>> vehicles = new ArrayList<>();
			  System.out.println("What type of car would you like to hire?");
			  userInput = input.nextLine();
			  for(i = 0; i < arrayCount; i++) {
			  if(userInput.equalsIgnoreCase(vehicles[i].getType())) {
				  System.out.println("VehicleID is: " + vehicles[i].getVehicleID()); 
				  System.out.println(" ");
			  }
			  } 
		       
		    break;
		    
		  case 3 :
			//Select vehicle by number of seats
			System.out.println("How many passengers do you have?");
			
			
			break;
			
		  case 4 :
		    //Exit
			System.out.println("    ------------------------");
			System.out.println("    Have a nice day. Goodbye");
			System.out.println("    ------------------------"); 
			break;
			
		  case 5 : 
			  System.out.println(" ");
		    
		  default : 
			//None of the above options apply - an invalid choice was selected
			System.out.println("    ----------------------------------------");
			System.out.println("     Invalid Menu Choice");
			System.out.println("     Please select a number between 1 and 4.");
			System.out.println("    ----------------------------------------");				
		  }
		 // input.close();
		
}
  }	   
}	   

	

