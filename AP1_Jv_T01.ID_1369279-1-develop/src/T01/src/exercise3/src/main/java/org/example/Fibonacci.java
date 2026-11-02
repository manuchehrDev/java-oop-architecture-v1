package org.example;

import java.util.Scanner;

public class Fibonacci {

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

    public int countNumberFibonacci(int num){
        if(num<=1){
            return num;
        }
        return countNumberFibonacci(num-1)+countNumberFibonacci(num-2);
    }

    public boolean isCorrect(int num){
        return (num<=45);
    }

    public void outputNumberFibonacci(int num){
        System.out.println(num);
    }
}
