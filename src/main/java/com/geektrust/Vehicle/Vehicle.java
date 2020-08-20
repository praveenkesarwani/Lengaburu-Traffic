package com.geektrust.Vehicle;

import com.geektrust.Orbits.Orbit;

public class Vehicle {

    private final int speed;
    private final int craterCrossTime;
    private final String vehicleType;
    public float totalTimeTaken;
    public String orbitName;
    Orbit orbit;

    /**
     * Constructor to assign values to the the instance variables
     * @param speed default speed of particular vehicle.
     * @param craterCrossTime time taken to cross one crater.
     * @param chosenOrbit the orbit that is chosen
     * @param orbitName name of the orbit
     * @param vehicleType type of vehicle
     */
    public Vehicle(int speed, int craterCrossTime, Orbit chosenOrbit, String orbitName, String vehicleType) {
        this.speed = speed;
        this.craterCrossTime = craterCrossTime;
        this.orbit = chosenOrbit;
        this.orbitName = orbitName;
        this.vehicleType = vehicleType;
    }

    /**
     * this function calculates time taken by a particular vehicle to reach the destination
     * @return total time
     */
    public float getTimeTakenToCross() {
        // time = distance / speed
        float timeTakenToCoverDistance = orbit.getDistance() / (float) Math.min( speed, orbit.getTrafficSpeed()) * 60;
        float timeTakenToCrossCrater = craterCrossTime * orbit.getNoOfCraters();
        totalTimeTaken = timeTakenToCoverDistance + timeTakenToCrossCrater;
        return totalTimeTaken;
    }

    /**
     * function returns the type of vehicle
     * @return
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * function returns the name of orbit
     * @return
     */
    public String getOrbitName() {
        return orbitName;
    }
}
