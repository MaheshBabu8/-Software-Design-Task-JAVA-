package com.Nymble.TravelPackage;
import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private String name;
    private int number;
    private double balance;
    private List<Activity> enrolledActivities;

    // Constructors
    public Passenger(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.enrolledActivities = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Activity> getEnrolledActivities() {
        return enrolledActivities;
    }

    public void setEnrolledActivities(List<Activity> enrolledActivities) {
        this.enrolledActivities = enrolledActivities;
    }

    // Other methods
    public void enrollInActivity(Activity activity) {
        enrolledActivities.add(activity);
    }
}