package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;

public class GoldPassengerTest {

    @Test
    public void testDeductBalanceWithDiscount() {
        GoldPassenger passenger = new GoldPassenger("David", 105, 200.0);
        assertTrue(passenger.deductBalance(100.0));
        assertEquals(90.0, passenger.getBalance(), 0.001);
    }

    @Test
    public void testDeductBalanceInsufficientFunds() {
        GoldPassenger passenger = new GoldPassenger("Eva", 106, 30.0);
        assertFalse(passenger.deductBalance(50.0));
        assertEquals(30.0, passenger.getBalance(), 0.001);
    }

}
