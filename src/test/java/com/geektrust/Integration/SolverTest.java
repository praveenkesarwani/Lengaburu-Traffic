package com.geektrust.Integration;

import com.geektrust.Util.Init;
import com.geektrust.Util.Solver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SolverTest {

    @BeforeEach
    public void init(){
        Init.initializeVehicleDetails();
    }
    @Test
    public void shouldGiveCorrectOutput(){
        Solver solver = new Solver();
        String []input = {"RAINY","40","25"};
        String output = solver.solveAndGetResult(input);
        String expectedOutput = "CAR ORBIT2";
        assertEquals(expectedOutput,output);
    }

    @Test
    public void shouldGiveWrongOutput(){
        Solver solver = new Solver();
        String []input = {"RAINY","40","25"};
        String output = solver.solveAndGetResult(input);
        String wrongOutput = "TUKTUK ORBIT2";
        assertNotEquals(wrongOutput,output);
    }

}
