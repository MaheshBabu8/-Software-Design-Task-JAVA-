package com.Nymble.TravelPackage;


import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void testActivityCreation() {
        Activity activity = new Activity("Hiking", 50.0, 20, "Enjoy a hike in the mountains");
        assertNotNull(activity);
        assertEquals("Hiking", activity.getName());
        assertEquals(50.0, activity.getCost(), 0.001);
        assertEquals(20, activity.getCapacity());
        assertEquals("Enjoy a hike in the mountains", activity.getDescription());
    }

    @Test
    public void testSettersAndGetters() {
        Activity activity = new Activity("Swimming", 25.0, 15, "Cool off in the pool");
        activity.setName("Diving");
        activity.setCost(30.0);
        activity.setCapacity(10);
        activity.setDescription("Explore the underwater world");

        assertEquals("Diving", activity.getName());
        assertEquals(30.0, activity.getCost(), 0.001);
        assertEquals(10, activity.getCapacity());
        assertEquals("Explore the underwater world", activity.getDescription());
    }

}

