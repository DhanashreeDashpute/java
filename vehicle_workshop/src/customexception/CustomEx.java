package customexception;

public class CustomEx extends Exception{
	

	

	    public CustomEx(String message) {
	        super(message);
	    }

	    public static class InvalidColorException extends CustomEx {
	        public InvalidColorException(String message) {
	            super(message);
	        }
	    }

	    public static class PollutionLevelExceededException extends CustomEx {
	        public PollutionLevelExceededException(String message) {
	            super(message);
	        }
	    }
	}


