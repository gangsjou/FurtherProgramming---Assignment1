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

public class Main {

  public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	int menuChoice = 0;
	String userInput;
	String delimiter = ",";
	String line;
	int i;
	int j;
	int sNum = 0;
	int jNum;
	String vehicleID;
	HashMap <String, Integer> qResults = new HashMap<String, Integer>(); 
	Vehicle[] vehicles = new Vehicle[20];
	int arrayCount = 9;
	int subMenuChoice = 0;
	String carID;
	int userInt;
	Customers[] customer = new Customers[20];
	HashMap <String, String> booking = new HashMap<String, String>();
	Booking[] bookings = new Booking[20];
		       
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
		//Search cars by brand		
	    
	  
	    System.out.println("What brand of car would you like to hire?");
	    userInput = input.nextLine();
	    j = 1;
	    int carIndex = 0;
	    for(i = 0; i < arrayCount; i++) {
		  if(userInput.equalsIgnoreCase(vehicles[i].getBrand())) {
		    System.out.println(j+".   " + vehicles[i].getVehicleID() + " - " + vehicles[i].getModel() + " " + vehicles[i].getType()
			  + " " + "with "+ vehicles[i].getSeatsNum() + " seats");
		    carID=vehicles[i].getVehicleID();
		    carIndex = j;
		    int bookingNum = sNum;
		    System.out.println(carID + " and " + vehicles[j].getVehicleID() + j);
		    
		    sNum++;
		    bookings[i]=new Booking(carID, carIndex, j);
		    System.out.println(bookings[i].carID);
		    j++;
		    i++;
		    }
		  }
		  System.out.println(j+".   Go to the main menu");
		  jNum = j;
		  System.out.println(" ");
		  System.out.println("     Please select an item from the menu");
		  userInput = input.nextLine();
		  subMenuChoice = Integer.parseInt(input.nextLine());
		  while(subMenuChoice != jNum) {
		    for(j = 1; j < jNum; j++) { 
			  if((vehicles[j]).getVehicleID().equals(vehicles[i].getVehicleID())) {
				  System.out.println(vehicles[j].getVehicleID() + "and" + vehicles[i].getVehicleID());
				Methods.printDetails(vehicles[i].getVehicleID(), vehicles[i].getBrand(), vehicles[i].getModel(), vehicles[i].getType(), 
				  vehicles[i].getYom(), vehicles[i].getSeatsNum(), vehicles[i].getColor());
			    }
			  }
		    }
		  
		  System.out.println("Do you wish to book this vehicle? Yes/No");
		  userInput = input.nextLine();
		  if(userInput.equalsIgnoreCase("yes")){
		  //booking method
		  System.out.println("What is your pickup date? Format: DDMMYYYY");
		  userInt = Integer.parseInt(input.nextLine());
		  //check date > 8 integers or unrealistic date
		  System.out.println("What is your drop off date? Format: DDMMYY");
		  userInt = Integer.parseInt(input.nextLine());
		  //check date > 8 integers or unrealistic date
		  //Print all vehicle details including prices
		  System.out.println("Do you wish to proceed? Yes/No");
		  userInput = input.nextLine();
		  if(userInput.equalsIgnoreCase("no")) {
		    break;
		  }
		  else if(userInput.equalsIgnoreCase("yes")){
		    System.out.println("Please enter your given name");
		    userInput = input.nextLine();
		    String givenName = userInput;
		    System.out.println("Please enter your surname");
		    userInput = input.nextLine();
		    String surName = userInput;
		    System.out.println("Please enter your email address");
		    userInput = input.nextLine();
		    String Email = userInput;
		    System.out.println("Please provide the number of passengers");
		    userInt = Integer.parseInt(input.nextLine());
		    int passengerNum = userInt;
		    //check to make sure that passengerNum + 1 <= seatsNum
		    System.out.println("Please Confirm and Pay. Yes/No");
		    userInput = input.nextLine();
		    if(userInput.equalsIgnoreCase("no")) {
			  break;
			}
		    else if(userInput.equalsIgnoreCase("yes")){
			  System.out.println("Congratulations! Your vehicle is booked");
			  System.out.println("A receipt has been sent to your email.");
			  System.out.println("We will soon be in touch before your pick-up date");
		    }
		  }
		  } else if(userInput.equalsIgnoreCase("no")){
		    break;
		  } else {
			  System.out.println("Unexpected input."); 
			  System.out.println("Please enter Yes to proceed with booking this vehicle");
			  System.out.println("Please enter No to return to the main menu");
		  }
		  userInput = input.nextLine();
		  if(userInput.equalsIgnoreCase("yes")){
		  //booking method	      
		  } else if(userInput.equalsIgnoreCase("no")){
		  break;
		  }
	
		  //remove items from the HashMap after booking is complete or after return to main menu to clear previous choices
		case 2 :
		//Browse cars by vehicle type
		j = 0;
		sNum = 0;
		System.out.println("What type of car would you like to hire?");
		userInput = input.nextLine();
		for(i = 0; i < arrayCount; i++) {
		  if(userInput.equalsIgnoreCase(vehicles[i].getType())) {		  
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
		if(userInput.equalsIgnoreCase("yes")){
		//booking method	      
		} else if(userInput.equalsIgnoreCase("no")){
		  break;
		} else {
			System.out.println("Unexpected input."); 
			System.out.println("Please enter Yes to proceed with booking this vehicle");
			System.out.println("Please enter No to return to the main menu");
		}
		//remove items from the HashMap after booking is complete or after return to main menu to clear previous choices
		
				       
		break;
				    
		case 3 :
		//Select vehicle by number of seats
		j = 0;
		sNum = 0;
		System.out.println("How many passengers do you have?");
		userInt = Integer.parseInt(input.nextLine());
		for(i = 0; i < arrayCount; i++) {
		  if(userInt == (vehicles[i].getSeatsNum())) {		  
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
		userInt = Integer.parseInt(input.nextLine());
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
		if(userInput.equalsIgnoreCase("yes")){
		//booking method	      
		} else if(userInput.equalsIgnoreCase("no")){
		  break;
		} else {
			System.out.println("Unexpected input."); 
			System.out.println("Please enter Yes to proceed with booking this vehicle");
			System.out.println("Please enter No to return to the main menu");
		}
		//remove items from the HashMap after booking is complete or after return to main menu to clear previous choices
		break;
				
		case 4 :
		//Exit
		System.out.println("    ------------------------");
		System.out.println("    Have a nice day. Goodbye");
		System.out.println("    ------------------------"); 
		break;
				    
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


