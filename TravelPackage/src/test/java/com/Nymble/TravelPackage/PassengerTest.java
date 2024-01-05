package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerTest {

    @Test
    public void testPassengerCreation() {
        Passenger passenger = new Passenger("John", 101, 200.0);
        assertNotNull(passenger);
        assertEquals("John", passenger.getName());
        assertEquals(101, passenger.getNumber());
        assertEquals(200.0, passenger.getBalance(), 0.001);
        assertTrue(passenger.getEnrolledActivities().isEmpty());
    }

    @Test
    public void testEnrollInActivity() {
        Passenger passenger = new Passenger("Alice", 102, 300.0);
        Activity activity = new Activity("Sightseeing", 40.0, 30, "Explore the city");

        passenger.enrollInActivity(activity);

        assertEquals(1, passenger.getEnrolledActivities().size());
        assertTrue(passenger.getEnrolledActivities().contains(activity));
    }

}
