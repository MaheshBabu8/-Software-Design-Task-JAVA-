package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;

public class PremiumPassengerTest {

    @Test
    public void testPremiumPassengerCreation() {
        PremiumPassenger passenger = new PremiumPassenger("Frank", 107, 500.0);
        assertNotNull(passenger);
        assertEquals("Frank", passenger.getName());
        assertEquals(107, passenger.getNumber());
        assertEquals(500.0, passenger.getBalance(), 0.001);
    }

}
