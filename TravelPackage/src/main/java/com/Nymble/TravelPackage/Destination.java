package com.Nymble.TravelPackage;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    // Constructors
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    // Other methods
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}

