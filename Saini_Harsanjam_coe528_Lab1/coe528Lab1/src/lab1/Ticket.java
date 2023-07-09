/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author h8saini
 */
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int number = 0;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.number += 1;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public static int getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public static void setNumber(int number) {
        Ticket.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
        return(passenger.getName()+"Flight: "+flight.getFlightNumber()+", "+flight.getOrigin()+" to "+flight.getDestination()+", "+flight.getDepartureTime()+", "+"Original price: "+ flight.getOriginalPrice()+"$"+", "+"ticket price: "+"$"+price);
    }
    
}
