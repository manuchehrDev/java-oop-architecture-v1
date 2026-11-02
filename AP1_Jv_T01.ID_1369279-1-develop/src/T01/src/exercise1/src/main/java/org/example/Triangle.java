package org.example;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {

    public void runTriangle(double x[], double y[]) {
        if (isTriangle(x, y)) {
            System.out.printf("Perimeter: %.3f\n", calculateTriangle(x, y));
        } else {
            System.out.println("It's not a triangle");
        }
    }


    private boolean isTriangle(double x[], double y[]) {
        return ((((x[1] - x[0]) * (y[2] - y[0])) - ((x[2] - x[0]) * (y[1] - y[0]))) != 0);
    }

    private double calculateTriangle(double x[], double y[]) {
        double ab = sqrt(pow(x[1] - x[0], 2) + pow(y[1] - y[0], 2));
        double bc = sqrt(pow(x[2] - x[1], 2) + pow(y[2] - y[1], 2));
        double ca = sqrt(pow(x[0] - x[2], 2) + pow(y[0] - y[2], 2));
        return ab + bc + ca;
    }

    public double getDouble(Scanner scanner) {
        while (true) {
            try {
                String line = scanner.nextLine();
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }
    }


}
