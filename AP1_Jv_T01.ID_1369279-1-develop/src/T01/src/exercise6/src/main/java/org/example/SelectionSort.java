package org.example;

import java.util.Scanner;

public class SelectionSort {
    private double[] srcArray;
    private int sizeArray = 0;


    public boolean setSize(int sizeArray) {
        this.sizeArray = sizeArray;
        if (this.sizeArray > 0) {
            srcArray = new double[this.sizeArray];
        }
        return (this.sizeArray > 0);
    }

    public void setSrcArray(Scanner scanner, int size) {
        for (int i = 0; i < size; i++) {
            srcArray[i] = getDouble(scanner);
        }
    }

    public void selectionSort() {
        for (int i = 0; i < sizeArray; i++) {
            int index = i;
            for (int j = i + 1; j < sizeArray; j++) {
                if (srcArray[j] < srcArray[index]) {
                    index = j;
                }
            }

            double temp = srcArray[index];
            srcArray[index] = srcArray[i];
            srcArray[i] = temp;
        }
    }

    public void outputResult() {
        for (int i = 0; i < sizeArray; i++) {
            if (i == sizeArray - 1) {
                System.out.println(srcArray[i]);
            } else {
                System.out.print(srcArray[i] + " ");
            }
        }
    }

    public int getNumber(Scanner scanner) {
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }
    }

    public double getNumberDouble(Scanner scanner) {
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Could not parse a number. Please, try again");
            }
        }
    }



    private double getDouble(Scanner scanner) {
        while (true) {
            try {
                if (scanner.hasNextDouble()) {
                    return scanner.nextDouble();
                }else {
                    System.out.println("Could not parse a number. Please, try again");
                    scanner.next();
                }
            } catch (NumberFormatException e) {

            }
        }
    }
}
