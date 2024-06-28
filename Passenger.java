
package AirlineManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
	private String name;
	private String passportNumber;
	private List<Flight>bookedFlights;
	
	public Passenger(String name,String passportNumber) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.bookedFlights = new ArrayList<>();
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public List<Flight> getBookedFlights() {
		return bookedFlights;
	}

	public void setBookedFlights(List<Flight> bookedFlights) {
		this.bookedFlights = bookedFlights;
	}
	
	
	// Method to book a flight for passenger
	public void bookFlight(Flight flight) {
		if(flight.isAvailable()) {
			bookedFlights.add(flight);
			flight.bookFlight();    //the flight is booked
			System.out.println("Flight booked successfully : " + flight.getFlightNumber());
			
	  }else {
		  System.out.println("Fight is not available for booking");
	  }
		
	}
	
	public void cancelBooking(Flight flight) {
		if(bookedFlights.remove(flight)) {
			flight.cancelBooking();
			System.out.println("Booking canceled successfully: "+flight.getFlightNumber());
		}else {
			System.out.println("this flight is  not booked by the passenger");
		}
		
	}
    
		
	
	@Override
	public String toString() {
		return ("passenger"+",name : "+ name +",passportNumber : "+ passportNumber +",bookdedFlights : "+ bookedFlights);
	
	}

}
