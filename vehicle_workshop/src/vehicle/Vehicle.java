package vehicle;




	import customexception.CustomEx;
	import customexception.CustomEx.InvalidColorException;
	import customexception.CustomEx.PollutionLevelExceededException;
	import validation.Validation;

	import java.util.Date;

	public class Vehicle {
	    private String chassisNo;
	    private Color color;
	    private double price;
	  
	    private double pollutionLevel;

	    public Vehicle(String chassisNo, Color color, double price, double pollutionLevel) {
	        this.chassisNo = chassisNo;
	        this.color = color;
	        this.price = price;
	        this.pollutionLevel = pollutionLevel;
	    }

	    public void addVehicle() {
	        try {
	            validation.Validation.validateColor(color.toString()); // Assuming color.toString() provides the color name
	            System.out.println("Vehicle added successfully.");
	        } catch (customexception.CustomEx.InvalidColorException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    public void driveVehicle(double kilometers) {
	        try {
	            pollutionLevel += kilometers * 0.01;
	            validation.Validation.validatePollutionLevel(pollutionLevel);
	            System.out.println("Vehicle driven successfully.");
	        } catch (customexception.CustomEx.PollutionLevelExceededException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    @Override
	    public String toString() {
	        return "Vehicle [chassisNo=" + chassisNo + ", color=" + color + ", price=" + price +
	               
	                ", pollutionLevel=" + pollutionLevel + "]";
	    }
	}


