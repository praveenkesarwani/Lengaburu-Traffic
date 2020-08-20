package com.geektrust.Util;

import com.geektrust.Orbits.Orbit;
import com.geektrust.Vehicle.Vehicle;
import com.geektrust.Weather.Weather;

import java.util.Map;

public class Solver {

    private static Vehicle bestVehicle;
    private static float totalTimeTaken = Integer.MAX_VALUE;
    Map<String,Map<String,Integer>>vehicleDetails = Init.vehicleDetails;
    /**
     * This function does all the calculation part and returns the output.
     * @param input
     * @return
     */
    public String solveAndGetResult(String[] input) {

        String weatherName = input[0];
        Weather weather = new Weather(weatherName);
        int craterChange = weather.getCraterChange();
        int orbitOneCrater = 20 + (20 * craterChange) / 100;
        int orbitTwoCrater = 10 + (10 * craterChange) / 100;

        /**
         *  Create Orbit objects Based On Given Weather & Traffic Condition
         */
        int orbitOneTrafficSpeed = Integer.parseInt(input[1]);
        int orbitTwoTrafficSpeed = Integer.parseInt(input[2]);
        Orbit orbit1 = new Orbit(18, orbitOneCrater, orbitOneTrafficSpeed);
        Orbit orbit2 = new Orbit(20, orbitTwoCrater, orbitTwoTrafficSpeed);


        /**
         *  Calculation for Time Taken by the available vehicles to cross each Orbit
         */
        String[] possibleVehicles = weather.getPossibleVehicles();
        for (String vehicle : possibleVehicles) {
            int vehicleSpeed = vehicleDetails.get(vehicle).get("speed");
            int craterCrossTime = vehicleDetails.get(vehicle).get("craterCrossTime");

            /**
             *  Checking for Orbit1 if this vehicle gives the Fastest Route to cross, if yes then update
             */
            Vehicle vehicleOrbit1 = new Vehicle(vehicleSpeed, craterCrossTime, orbit1, "ORBIT1", vehicle);
            float currentTimeTaken = vehicleOrbit1.getTimeTakenToCross();

            if (currentTimeTaken < totalTimeTaken) {
                bestVehicle = vehicleOrbit1;
                totalTimeTaken = currentTimeTaken;
            }

            /**
             *  Checking for Orbit2 if this vehicle gives the Fastest Route to cross, if yes then update
             */
            Vehicle vehicleOrbit2 = new Vehicle(vehicleSpeed, craterCrossTime, orbit2, "ORBIT2", vehicle);
            currentTimeTaken = vehicleOrbit2.getTimeTakenToCross();

            if (currentTimeTaken < totalTimeTaken) {
                bestVehicle = vehicleOrbit2;
                totalTimeTaken = currentTimeTaken;
            }
        }

        return bestVehicle.getVehicleType() + " " + bestVehicle.getOrbitName();

    }
}
