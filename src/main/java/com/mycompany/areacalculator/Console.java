package com.mycompany.areacalculator;

import java.util.Scanner;

public class Console {
    
    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static double getDouble(String prompt) {
        double value = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextDouble()) {
                value = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }

            sc.nextLine(); // clear the rest of the line / newline
        }

        return value;
    }
}
