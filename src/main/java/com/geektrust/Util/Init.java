package com.geektrust.Util;

import java.util.HashMap;
import java.util.Map;

/**
 * Class is created to initializes all the vehicle details
 */
public class Init {
    public static final Map<String, Map<String,Integer>> vehicleDetails = new HashMap<>();

    public static void initializeVehicleDetails() {

        // Bike Details
        Map<String,Integer> bikeDetails = new HashMap<>();
        bikeDetails.put("speed",10);
        bikeDetails.put("craterCrossTime",2);
        vehicleDetails.put("BIKE",bikeDetails);

        // Tuktuk details
        Map<String,Integer> tuktukDetails = new HashMap<>();
        tuktukDetails.put("speed",12);
        tuktukDetails.put("craterCrossTime",1);
        vehicleDetails.put("TUKTUK",tuktukDetails);

        // Car Details
        Map<String,Integer> carDetails = new HashMap<>();
        carDetails.put("speed",20);
        carDetails.put("craterCrossTime",3);
        vehicleDetails.put("CAR",carDetails);

    }

}
