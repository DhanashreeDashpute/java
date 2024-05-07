package tester;



	import java.util.Scanner;
	import vehicle.Color;
	import vehicle.Vehicle;
	import customexception.CustomEx.InvalidColorException;
	import customexception.CustomEx.PollutionLevelExceededException;

	public class Tester {
	    public static void main(String[] args) throws InvalidColorException, PollutionLevelExceededException {
	        Scanner scanner = new Scanner(System.in);
	        Vehicle[] vehicles = new Vehicle[10];
	        int vehicleIndex = 0; // Track the index of the next available slot for a vehicle
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add new vehicle");
	            System.out.println("2. Drive a vehicle");
	            System.out.println("3. Display all vehicles");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    // Add new vehicle
	                    if (vehicleIndex >= vehicles.length) {
	                        System.out.println("Error: Maximum number of vehicles reached.");
	                        break;
	                    }

	                    System.out.println("Enter chassis number:");
	                    String chassisNo = scanner.nextLine();
	                    System.out.println("Enter color (WHITE, SILVER, BLACK, RED, BLUE):");
	                    String colorStr = scanner.nextLine();
	                    System.out.println("Enter price:");
	                    double price = scanner.nextDouble();
	                    System.out.println("Enter pollution level:");
	                    double pollutionLevel = scanner.nextDouble();

	                    try {
	                        vehicles[vehicleIndex] = new Vehicle(chassisNo, Color.valueOf(colorStr.toUpperCase()), price, pollutionLevel);
	                        System.out.println("Vehicle added successfully.");
	                        vehicleIndex++;
	                    } catch (IllegalArgumentException e) {
	                        System.out.println("Error: Invalid color entered.");
	                    }

	                    break;

	                case 2:
	                    // Drive a vehicle
	                    if (vehicleIndex == 0) {
	                        System.out.println("Error: No vehicles available. Please add a vehicle first.");
	                        break;
	                    }

	                    System.out.println("Enter kilometers to drive:");
	                    double kilometers = scanner.nextDouble();
	                    for (int i = 0; i < vehicleIndex; i++) {
	                        vehicles[i].driveVehicle(kilometers);
	                    }
	                    break;

	                case 3:
	                    // Display all vehicles
	                    if (vehicleIndex == 0) {
	                        System.out.println("No vehicles added yet.");
	                        break;
	                    }

	                    System.out.println("Vehicle details:");
	                    for (int i = 0; i < vehicleIndex; i++) {
	                        System.out.println("Vehicle " + (i + 1) + ": " + vehicles[i]);
	                    }
	                    break;

	                case 4:
	                    exit = true;
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	                    break;
	            }
	        }
	        scanner.close();
	    }
	}


