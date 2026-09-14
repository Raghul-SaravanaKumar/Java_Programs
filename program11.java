import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        // Handle null or empty input safely
        if (sentence == null || sentence.trim().isEmpty()) {
            System.out.println("string 0");
            System.out.println("integer 0");
            System.out.println("double 0");
            return;
        }

        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        // Split the string by one or more whitespace characters
        String[] tokens = sentence.trim().split("\\s+");

        for (String token : tokens) {
            if (isInteger(token)) {
                integerCount++;
            } else if (isDouble(token)) {
                doubleCount++;
            } else {
                stringCount++;
            }
        }

        // Print the result exactly in the requested order
        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }

    // Helper method to check if a token is a valid Integer
    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper method to check if a token is a valid Double
    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            // Ensure it actually contains a decimal point as per problem definition
            return s.contains(".");
        } catch (NumberFormatException e) {
            return false;
        }
    }
}  
