package com.Nymble.TravelPackage;

public class Activity {
    private String name;
    private double cost;
    private int capacity;
    private String description;

    // Constructors
    public Activity(String name, double cost, int capacity, String description) {
        this.name = name;
        this.cost = cost;
        this.capacity = capacity;
        this.description = description;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
