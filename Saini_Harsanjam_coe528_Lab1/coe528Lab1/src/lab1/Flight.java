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
public class Flight {

    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    /**
     *
     * @param flightNumber
     * @param origin
     * @param destination
     * @param departureTime
     * @param capacity
     * @param originalPrice
     */
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice) {
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and destination cannot be the same.");
        }
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.destination = destination;
        this.numberOfSeatsLeft = capacity;
    }

    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft -= 1;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", Departure Time: " + departureTime + ", "
                + "Original Price: " + originalPrice + "$";
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}