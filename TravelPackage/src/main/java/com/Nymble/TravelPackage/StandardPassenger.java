package com.Nymble.TravelPackage;

class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int number, double balance) {
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
