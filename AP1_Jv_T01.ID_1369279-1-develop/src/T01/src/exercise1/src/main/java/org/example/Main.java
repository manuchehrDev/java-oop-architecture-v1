package org.example;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        double[] x = new double[3];
        double[] y = new double[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            x[i] = triangle.getDouble(scan);
            y[i] = triangle.getDouble(scan);
        }

        triangle.runTriangle(x,y);

    }







}

