/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author h8saini
 */
public class FlightTest {

    public FlightTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testConstructor() {
        Flight flight = new Flight(1030, "London", "Manchester", "7 pm", 600, 125);
        assertEquals("London", flight.getOrigin());
        assertEquals("Manchester", flight.getDestination());
        assertEquals("7 pm", flight.getDepartureTime());
        assertEquals(600, flight.getCapacity());
        assertEquals(600, flight.getNumberOfSeatsLeft());
        assertEquals(125, flight.getOriginalPrice(), 0.0);
        flight.bookASeat();
        assertEquals(599, flight.getNumberOfSeatsLeft());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Flight flight = new Flight(1, "Mumbai", "Mumbai", "7 pm", 600, 125);
        assertEquals("Mumbai", flight.getOrigin());
        assertEquals("Kolkata", flight.getDestination());
        assertEquals("7 pm", flight.getDepartureTime());
        assertEquals(600, flight.getCapacity());
        assertEquals(600, flight.getNumberOfSeatsLeft());
        assertEquals(125, flight.getOriginalPrice(), 0.0);
        flight.bookASeat();
        assertEquals(599, flight.getNumberOfSeatsLeft());
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        boolean expResult = true;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        String expResult = "Flight 1, London to Manchester, Departure Time: 7 pm, Original Price: 125.0$";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        String expResult = "Manchester";
        String result = instance.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        String expResult = "London";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        double expResult = 125;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        int expResult = 600;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        int expResult = 600;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        String expResult = "7 pm";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 125;
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setOriginalPrice(originalPrice);
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "London";
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setOrigin(origin);
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int numberOfSeatsLeft = 600;
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setNumberOfSeatsLeft(numberOfSeatsLeft);
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int flightNumber = 1;
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setFlightNumber(flightNumber);
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Manchester";
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setDestination(destination);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "7 pm";
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setDepartureTime(departureTime);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 600;
        Flight instance = new Flight(1, "London", "Manchester", "7 pm", 600, 125);
        instance.setCapacity(capacity);
    }

}