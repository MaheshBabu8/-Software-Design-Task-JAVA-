package com.Nymble.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    // Constructors
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    // Other methods
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers. The package is full.");
        }
    }

    public void printItinerary() {
        System.out.println("Package Name: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("  Activity: " + activity.getName() +
                        ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() +
                        ", Description: " + activity.getDescription());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("  Passenger: " + passenger.getName() +
                    ", Passenger Number: " + passenger.getNumber());
        }
    }

    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details for " + passenger.getName());
        System.out.println("  Passenger Number: " + passenger.getNumber());
        System.out.println("  Balance: " + passenger.getBalance());
        System.out.println("  Enrolled Activities:");
        for (Activity activity : passenger.getEnrolledActivities()) {
            System.out.println("    Activity: " + activity.getName() +
                    ", Destination: " + findDestinationByActivity(activity).getName() +
                    ", Price: " + calculateActivityPrice(passenger, activity));
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getCapacity() - countEnrolledPassengers(activity);
                System.out.println("  Activity: " + activity.getName() +
                        ", Destination: " + destination.getName() +
                        ", Available Spaces: " + availableSpaces);
            }
        }
    }

    public void signUpForActivity(Passenger passenger, Activity activity) {
        if (passengers.contains(passenger) && activity.getCapacity() > countEnrolledPassengers(activity)) {
            if (passenger instanceof StandardPassenger) {
                double cost = calculateActivityPrice(passenger, activity);
                if (((StandardPassenger) passenger).deductBalance(cost)) {
                    passenger.enrollInActivity(activity);
                    System.out.println("Passenger " + passenger.getName() + " enrolled in " +
                            activity.getName() + " at " + findDestinationByActivity(activity).getName());
                } else {
                    System.out.println("Insufficient balance for " + passenger.getName());
                }
            } else if (passenger instanceof GoldPassenger) {
                double discountedCost = calculateActivityPrice(passenger, activity) * 0.9;
                if (((GoldPassenger) passenger).deductBalance(discountedCost)) {
                    passenger.enrollInActivity(activity);
                    System.out.println("Passenger " + passenger.getName() + " (Gold) enrolled in " +
                            activity.getName() + " at " + findDestinationByActivity(activity).getName());
                } else {
                    System.out.println("Insufficient balance for " + passenger.getName());
                }
            } else if (passenger instanceof PremiumPassenger) {
                passenger.enrollInActivity(activity);
                System.out.println("Passenger " + passenger.getName() + " (Premium) enrolled in " +
                        activity.getName() + " at " + findDestinationByActivity(activity).getName());
            }
        } else {
            System.out.println("Unable to sign up for activity.");
        }
    }

    private Destination findDestinationByActivity(Activity activity) {
        for (Destination destination : itinerary) {
            if (destination.getActivities().contains(activity)) {
                return destination;
            }
        }
        return null;
    }

    private double calculateActivityPrice(Passenger passenger, Activity activity) {
        return activity.getCost();
    }

    private int countEnrolledPassengers(Activity activity) {
        int count = 0;
        for (Passenger passenger : passengers) {
            if (passenger.getEnrolledActivities().contains(activity)) {
                count++;
            }
        }
        return count;
    }
}

