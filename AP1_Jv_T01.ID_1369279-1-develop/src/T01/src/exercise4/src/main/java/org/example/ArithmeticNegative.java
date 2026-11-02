package org.example;

import java.util.Scanner;

public class ArithmeticNegative {
    private int[] array;
    private int sizeArray = 0;
    private int counterNegativeNumber = 0;

    private boolean isCorrectSize(int size) {
        return size > 0;
    }

    public boolean sizeHandler(int size) {
        boolean flag = true;
        if (isCorrectSize(size)) {
            array = new int[size];
            sizeArray = size;
        } else {
            System.out.println("Input error. Size <= 0");
            flag = false;
        }
        return flag;
    }

    public boolean setValuesArray(int sizeArray, Scanner scanner) {
        boolean flag = true;
        if (sizeHandler(sizeArray)) {
            for (int i = 0; i < this.sizeArray; i++) {
                int num = getValues(scanner);
                this.array[i] = num;
                if (num < 0) {
                    counterNegativeNumber++;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public double calculateArithmeticNegative() {
        int result = 0;
        if (this.sizeArray > 0) {
            for (int i = 0; i < this.sizeArray; i++) {
                if (this.array[i] < 0) {
                    result += this.array[i];
                }
            }
        }
        return (double) result / counterNegativeNumber;
    }

    public void outputResult() {
        if (canCalculate()) {
            System.out.println((int)calculateArithmeticNegative());
        } else {
            System.out.println("There are no negative elements");
        }
    }


    public boolean canCalculate() {
        return this.counterNegativeNumber != 0;
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

    private int getValues(Scanner scanner) {
        while (true) {
            try {
                if (scanner.hasNextInt()) {
                    return scanner.nextInt();
                }else {
                    System.out.println("Could not parse a number. Please, try again");
                    scanner.next();
                }
            } catch (NumberFormatException e) {

            }
        }
    }
}
