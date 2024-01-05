package com.Nymble.TravelPackage;

class GoldPassenger extends Passenger {
    public GoldPassenger(String name, int number, double balance) {
        super(name, number, balance);
    }

    public boolean deductBalance(double cost) {
        if (getBalance() >= cost) {
            setBalance(getBalance() - cost);
            return true;
        }
        return false;
    }
}