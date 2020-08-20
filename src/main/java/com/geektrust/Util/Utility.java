package com.geektrust.Util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A utility class which reads the input file and return a file content as string.
 */
public class Utility {


  public static String[] getInputLinesAsArrayOfString(String path) throws IOException {

    FileInputStream inputStream = new FileInputStream(path);
    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    String[] input = br.readLine().split(" ");
    inputStream.close();
    return input;
  }
}
