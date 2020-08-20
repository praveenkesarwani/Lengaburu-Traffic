package com.geektrust;

import com.geektrust.Weather.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherTest {

    @Test
    public void craterChangeTest(){
        assertEquals(new Weather("RAINY").getCraterChange(),20);
        assertEquals(new Weather("SUNNY").getCraterChange(),-10);
        assertEquals(new Weather("WINDY").getCraterChange(),0);
    }

    @Test
    public void getPossibleVehiclesTest(){
        String[] rainyVehicles = {"TUKTUK","CAR"};
        String[] sunnyVehicles = {"BIKE", "TUKTUK", "CAR"};
        String[] windyVehicles = {"BIKE","CAR"};
        assertArrayEquals(new Weather("RAINY").getPossibleVehicles(),rainyVehicles);
        assertArrayEquals(new Weather("SUNNY").getPossibleVehicles(),sunnyVehicles);
        assertArrayEquals(new Weather("WINDY").getPossibleVehicles(),windyVehicles);

    }
}
