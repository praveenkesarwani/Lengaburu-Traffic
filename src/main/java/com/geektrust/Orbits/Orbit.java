package com.geektrust.Orbits;

public class Orbit {
    private final int distance;
    private final int noOfCraters;
    private final int trafficSpeed;

    public Orbit(int distance, int noOfCraters, int trafficSpeed) {
        this.distance = distance;
        this.noOfCraters = noOfCraters;
        this.trafficSpeed = trafficSpeed;
    }

    public int getDistance() {
        return distance;
    }

    public int getNoOfCraters() {
        return noOfCraters;
    }

    public int getTrafficSpeed() {
        return trafficSpeed;
    }
}
