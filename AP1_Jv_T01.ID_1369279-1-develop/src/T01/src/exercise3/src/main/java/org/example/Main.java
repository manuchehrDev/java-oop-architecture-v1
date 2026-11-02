package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int num = fibonacci.getNumber(scanner);
        if(fibonacci.isCorrect(num)) {
            int result = fibonacci.countNumberFibonacci(num);
            fibonacci.outputNumberFibonacci(result);
        }else {
            System.out.println("Too large n");
        }

    }
}


