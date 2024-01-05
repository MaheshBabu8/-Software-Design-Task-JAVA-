package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TravelPackageTest {

    @Test
    public void testTravelPackageCreation() {
        TravelPackage travelPackage = new TravelPackage("Adventure Package", 3);
        assertNotNull(travelPackage);
        assertEquals("Adventure Package", travelPackage.getName());
        assertEquals(3, travelPackage.getPassengerCapacity());
        assertTrue(travelPackage.getItinerary().isEmpty());
        assertTrue(travelPackage.getPassengers().isEmpty());
    }

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Cruise Package", 2);
        Destination destination = new Destination("Tropical Islands");

        travelPackage.addDestination(destination);

        assertEquals(1, travelPackage.getItinerary().size());
        assertTrue(travelPackage.getItinerary().contains(destination));
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Safari Package", 1);
        Passenger passenger = new Passenger("Grace", 108, 300.0);

        travelPackage.addPassenger(passenger);

        assertEquals(1, travelPackage.getPassengers().size());
        assertTrue(travelPackage.getPassengers().contains(passenger));
    }

}
