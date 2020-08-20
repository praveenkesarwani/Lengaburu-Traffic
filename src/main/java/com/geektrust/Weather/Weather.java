package com.geektrust.Weather;

public class Weather {

    int craterChange;
    String weather;
    String[] possibleVehicles;

    /**
     * constructor to assign weather from the input.
     * @param weather
     */
    public Weather(String weather) {
        this.weather = weather;
    }

    /**
     * function to calculate the no of changes in craters
     * @return returns percentage changes.
     */
    public int getCraterChange() {
        switch (weather) {
            case "SUNNY":
                craterChange = -10;
                break;
            case "RAINY":
                craterChange = 20;
                break;
            case "WINDY":
                craterChange = 0;
        }
        return craterChange;
    }

    /**
     * function to find out possible vehicles that can be selected according to the weather condition
     * @return Array of all the possible vehicles
     */
    public String[] getPossibleVehicles() {
        switch (weather){
            case "SUNNY":
                possibleVehicles = "BIKE TUKTUK CAR".split(" ");
                break;
            case "RAINY":
                possibleVehicles = "TUKTUK CAR".split(" ");
                break;
            case "WINDY":
                possibleVehicles = "BIKE CAR".split(" ");
        }
        return possibleVehicles;
    }
}
