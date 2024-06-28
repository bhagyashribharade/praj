package AirlineManagementSystem;

public class Main {

	public static void main(String[] args) {
	
		Airline airline = new Airline();
		//create  flights
		Flight flight1 =  new Flight("FL123", "New York", "Mumbai", "10:00", "13:00");
		Flight flight2 = new Flight("FL456", "Pune", "Delhi", "6:00", "9:00");
	
	    //System.out.println(flight1.toString());
	   // System.out.println(flight2.toString());
	    airline.addFlight(flight1);
	    airline.addFlight(flight2);
	 
	    
	   // Passengers
	    Passenger passenger1 = new Passenger("SAM","P1234");
	   // System.out.println(passenger1.toString());
	    airline.registerPassenger(passenger1);
	    
	    passenger1.bookFlight(flight1);
	    passenger1.bookFlight(flight2);
	    // Display passenger details after booking flights
        System.out.println(passenger1);
      
           
        // Cancel a booked flight
        passenger1.cancelBooking(flight1);
        

        // Display passenger details after canceling a flight
        System.out.println(passenger1);

        // String Utility Tests
        System.out.println("\nString Utilities:");
        System.out.println("Count Occurrences: " + StringUtil.countOccurrences("Hello World", 'o'));
        System.out.println("Reverse String: " + StringUtil.reverseString("Hello"));
        System.out.println("Is Palindrome: " + StringUtil.isPalindrome("madam"));
        System.out.println("Capitalize Words: " + StringUtil.capitalizeWords("hello world"));

        // Wrapper Utility Tests
        Integer[] intArray = {1,9,7,6,5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("\nWrapper Utilities:");
        System.out.println("Find Max: " + WrapperUtil.findMax(intArray));
        System.out.println("Calculate Average: " + WrapperUtil.calculateAverage(doubleArray));
        System.out.println("Convert to Boolean Array: " + java.util.Arrays.toString(WrapperUtil.convertToBooleanArray("1101")));
        Boolean[] boolArray = {true, false, true, false};
        System.out.println("Convert to Binary String: " + WrapperUtil.convertToBinaryString(boolArray));


	  
	}

}
