package AirlineManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Airline {
	private List<Flight>flights;
	private List<Passenger>passengers;
	
	public Airline() {
		
		this.flights = new ArrayList<>();
		this.passengers = new ArrayList<>();
    
}
	public void addFlight(Flight flight) {
		flights.add(flight);
		}
	
	 public void removeFlight(String flightNumber) {
            flights.removeIf(flight ->flight.getFlightNumber().equals(flightNumber));
			
	 }
	
	public void registerPassenger(Passenger passenger) {
		passengers.add(passenger);
		}
	
	public void unregisterPassenger(String passportNumber) {
		passengers.removeIf(passenger ->passenger.getPassportNumber().equals(passportNumber));
		
	}
	
	public void bookflight(String passportNumber,String flightNumber) {
		 Passenger passenger = findPassenger(passportNumber);
	        if (passenger != null) {
	            Flight flight = findFlight(flightNumber);
	            if (flight != null) {
	                passenger.bookFlight(flight);
	                flight.bookFlight();
	            } else {
	                System.out.println("Flight " + flightNumber + " not found.");
	            }
	        } else {
	            System.out.println("Passenger with passport number " + passportNumber + " not found.");
	        }

	}
	
	public void cancelBooking(String passportNumber,String flightNumber) {
		  Passenger passenger = findPassenger(passportNumber);
	        if (passenger != null) {
	            Flight flight = findFlight(flightNumber);
	            if (flight != null) {
	                passenger.cancelBooking(flight);
	                flight.cancelBooking();
	            } else {
	                System.out.println("Flight " + flightNumber + " not found.");
	            }
	        } else {
	            System.out.println("Passenger with passport number " + passportNumber + " not found.");
	        }
		
	}
	public void listAvailableFlights() {
		for(Flight flight : flights) {
			if(flight.isAvailable()) {
				System.out.println(flight);
			}
		}
	}
	public void listBookedFlights() {
		for(Flight flight : flights) {
			if(! flight.isAvailable()) {
				System.out.println(flight);
			}
			
		}
	}
    // method to find a passenger by passport number
    private Passenger findPassenger(String passportNumber) {
        for (Passenger passenger : passengers) {
            if (passenger.getPassportNumber().equals(passportNumber)) {
                return passenger;
            }
        }
        return null;
    }

    //  method to find a flight by flight number
    private Flight findFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

	

}