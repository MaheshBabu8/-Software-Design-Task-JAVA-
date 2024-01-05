package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DestinationTest {

    @Test
    public void testDestinationCreation() {
        Destination destination = new Destination("Mountain Resort");
        assertNotNull(destination);
        assertEquals("Mountain Resort", destination.getName());
        assertTrue(destination.getActivities().isEmpty());
    }

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Beach Paradise");
        Activity activity = new Activity("Sunbathing", 0.0, 50, "Relax on the sandy beaches");

        destination.addActivity(activity);

        assertEquals(1, destination.getActivities().size());
        assertTrue(destination.getActivities().contains(activity));
    }

}
