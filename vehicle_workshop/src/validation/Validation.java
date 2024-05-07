package validation;


import customexception.CustomEx.InvalidColorException;
import customexception.CustomEx.PollutionLevelExceededException;
	
	import vehicle.Color;

	public class Validation {
	    public static Color validateColor(String colorStr) throws InvalidColorException {
	        if (colorStr == null) {
	            throw new InvalidColorException("Color string is null.");
	        }

	        Color color;
	        try {
	            color = Color.valueOf(colorStr.toUpperCase());
	        } catch (IllegalArgumentException e) {
	            throw new InvalidColorException("Invalid color: " + colorStr);
	        }

	        if (!isValidColor(color)) {
	            throw new InvalidColorException("Unsupported color: " + colorStr);
	        }

	        return color;
	    }

	    private static boolean isValidColor(Color color) {
	        return color == Color.WHITE || color == Color.SILVER || color == Color.BLACK ||
	                color == Color.RED || color == Color.BLUE;
	    }

	    public static void validatePollutionLevel(double pollutionLevel) throws PollutionLevelExceededException {
	        if (pollutionLevel > 20.0) {
	            throw new PollutionLevelExceededException("Pollution level exceeds permissible limit.");
	        }
	    }
	}


