package com.geektrust;

import com.geektrust.Util.Init;
import com.geektrust.Util.Solver;
import com.geektrust.Util.Utility;

import java.io.IOException;
/**
 * Main source class which will get input file as argument and will print the result.
 */
public class Geektrust {
    Solver solver;
    public static void main(String[] args) throws IOException {

        // Taking path from first argument.
        String path = args[0];

        // Creating object to get relevant data, since main context is static.
        Geektrust geektrust = new Geektrust();

        // Getting input file's data as array of Strings.
        String[] inputLine = Utility.getInputLinesAsArrayOfString(path);

        // Solving problem, getting result.
        geektrust.solver = new Solver();
        Init.initializeVehicleDetails();
        String output = geektrust.solver.solveAndGetResult(inputLine);

        // Printing result.
        System.out.print(output);
    }
}
