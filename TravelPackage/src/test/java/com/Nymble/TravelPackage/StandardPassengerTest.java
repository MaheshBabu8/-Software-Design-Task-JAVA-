package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;

public class StandardPassengerTest {

    @Test
    public void testDeductBalanceSufficientFunds() {
        StandardPassenger passenger = new StandardPassenger("Bob", 103, 100.0);
        assertTrue(passenger.deductBalance(50.0));
        assertEquals(50.0, passenger.getBalance(), 0.001);
    }

    @Test
    public void testDeductBalanceInsufficientFunds() {
        StandardPassenger passenger = new StandardPassenger("Charlie", 104, 30.0);
        assertFalse(passenger.deductBalance(50.0));
        assertEquals(30.0, passenger.getBalance(), 0.001);
    }

}
