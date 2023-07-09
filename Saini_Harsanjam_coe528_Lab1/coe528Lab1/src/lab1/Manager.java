/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author h8saini
 */
public class Manager {
    
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public Manager() {
        createFlights();
    }

    public void createFlights() {
        flights.add(new Flight(1, "London", "Manchester", "7 pm", 600, 125));
        flights.add(new Flight(2, "Dubai", "Toronto", "3 pm", 200, 600));
        flights.add(new Flight(3, "Delhi", "Sydney", "10 pm", 500, 200));
        flights.add(new Flight(4, "Paris", "New York", "5 am", 600, 320));
        flights.add(new Flight(5, "Montreal", "Vancouver", "2 am", 1200, 90));
        flights.add(new Flight(6, "Rio De Janeiro", "Chicago", "12 pm", 400, 450));
        flights.add(new Flight(7, "Sydney", "Tokyo", "8 am", 800, 900));
        flights.add(new Flight(8, "London", "Italy", "3 pm", 660, 165));
        flights.add(new Flight(9, "Dubai", "Rome", "1 pm", 260, 675));
        flights.add(new Flight(10, "Los Angeles", "Sydney", "11 pm", 500, 210));
        flights.add(new Flight(11, "Paris", "Las Vegas", "7 am", 600, 720));
        flights.add(new Flight(12, "Montreal", "Hong Kong", "2 am", 1100, 950));
        flights.add(new Flight(13, "Rio De Janeiro", "Bangkok", "12 pm", 475, 850));
        flights.add(new Flight(14, "Sydney", "Barcelona", "8 am", 850, 920));
        flights.add(new Flight(15, "Kolkata", "Mumbai", "8 am", 0, 90));
   
    }

    public void displayAvailableFlights(String origin, String destination) {
        System.out.println("\nAvailable Flights: ");
        for (Flight flight : flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                if (flight.getNumberOfSeatsLeft() > 0) {
                    System.out.println(flight.toString());
                }
            }
        }
    }

    public Flight getFlight(int flightNumber) {
        System.out.println("\nAvailable Flights: ");
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void bookSeat(int flightNumber, Passenger p) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                if (flight.bookASeat()) {
                    Ticket ticket = new Ticket(p, flight, p.applyDiscount(flight.getOriginalPrice()));
                    tickets.add(ticket);
                }
            }
        }
        System.out.println("\nBooked Tickets: ");
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i));
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Member mem1 = new Member("Joshua", 27);
        Member mem2 = new Member("Ali", 22);
        Member mem3 = new Member("Hamad", 33);
        Member mem4 = new Member("Danny", 32);
        NonMember nom1 = new NonMember("Kris", 78);
        NonMember nom2 = new NonMember("Inayat", 29);
        NonMember nom3 = new NonMember("Chloe", 43);
        
        mem1.setYearsOfMembership(11);
        mem2.setYearsOfMembership(3);
        mem3.setYearsOfMembership(5);
        
        
        manager.displayAvailableFlights("Sydney", "Tokyo");
        manager.displayAvailableFlights("Dubai", "Rome");
        
        Flight flight = manager.getFlight(10);
        
        System.out.println(flight.toString());
        
        manager.bookSeat(12, mem1);
        manager.bookSeat(11, mem2);
        manager.bookSeat(15, nom3);
        /* Manager doesn't book a flight because Flight 15 does not have any available seats */
        manager.bookSeat(1, mem3);
        manager.bookSeat(14, mem4);
        /* no discount because m4 is a new member*/
        manager.bookSeat(14, nom1);
        manager.bookSeat(7, nom2);
        manager.bookSeat(8, nom3);

    }
    
}
