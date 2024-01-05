package com.Nymble.TravelPackage;
public class Main {
    public static void main(String[] args) {
        // Create Activities
        Activity activity1 = new Activity("Hiking", 50.0, 20, "Enjoy a hike in the mountains");
        Activity activity2 = new Activity("Scuba Diving", 120.0, 10, "Explore the underwater world");
        Activity activity3 = new Activity("City Tour", 30.0, 15, "Guided tour through the city");
        Activity activity4 = new Activity("Skydiving", 200.0, 5, "Experience the thrill of skydiving");
        Activity activity5 = new Activity("Wine Tasting", 40.0, 12, "Savor the finest wines in the region");
        Activity activity6 = new Activity("Cultural Workshop", 25.0, 18, "Participate in a cultural workshop");
        Activity activity7 = new Activity("Hot Air Balloon Ride", 150.0, 8, "Enjoy a scenic hot air balloon ride");
        Activity activity8 = new Activity("Gourmet Cooking Class", 60.0, 10, "Learn gourmet cooking from top chefs");
        Activity activity9 = new Activity("Wildlife Safari", 100.0, 15, "Embark on an exciting wildlife safari");
        Activity activity10 = new Activity("Rock Climbing", 70.0, 12, "Challenge yourself with rock climbing");

        // Create Destinations
        Destination destination1 = new Destination("Mumbai");
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination1.addActivity(activity4);
        destination1.addActivity(activity6);

        Destination destination2 = new Destination("Hyderabad");
        destination2.addActivity(activity2);
        destination2.addActivity(activity3);
        destination2.addActivity(activity5);
        destination2.addActivity(activity7);

        Destination destination3 = new Destination("Bangalore");
        destination3.addActivity(activity3);
        destination3.addActivity(activity5);
        destination3.addActivity(activity8);
        destination3.addActivity(activity10);

        // Create Passengers
        Passenger passenger1 = new StandardPassenger("John", 101, 200.0);
        Passenger passenger2 = new GoldPassenger("Alice", 102, 300.0);
        Passenger passenger3 = new PremiumPassenger("Bob", 103, 400.0);

        // Create Travel Package
        TravelPackage travelPackage = new TravelPackage("KanakaDurga Travel Package", 3);
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);
        travelPackage.addDestination(destination3);
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Print Itinerary
        travelPackage.printItinerary();
        System.out.println("=================================");
        System.out.println();

        // Print Passenger List
        travelPackage.printPassengerList();
        System.out.println("=================================");
        System.out.println();

        // Sign up passengers for activities
        travelPackage.signUpForActivity(passenger1, activity1);
        travelPackage.signUpForActivity(passenger2, activity2);
        travelPackage.signUpForActivity(passenger3, activity3);
        travelPackage.signUpForActivity(passenger1, activity4);
        travelPackage.signUpForActivity(passenger2, activity5);
        travelPackage.signUpForActivity(passenger3, activity6);
        System.out.println("=================================");
        System.out.println();

        // Print Available Activities
        travelPackage.printAvailableActivities();
        System.out.println("=================================");
        System.out.println();

        // Print Passenger Details
        travelPackage.printPassengerDetails(passenger1);
        travelPackage.printPassengerDetails(passenger2);
        travelPackage.printPassengerDetails(passenger3);
        System.out.println("=================================");
        System.out.println();
    }
}
