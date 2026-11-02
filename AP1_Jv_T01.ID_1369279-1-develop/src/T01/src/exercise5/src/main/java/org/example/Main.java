package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SameNumbers sameNumbers = new SameNumbers();
        Scanner scanner = new Scanner(System.in);
        int number = sameNumbers.getNumber(scanner);
        if(sameNumbers.isCorrectSize(number)){
            sameNumbers.setValuesArray(number,scanner);
            sameNumbers.handlerNumbers(number);
            sameNumbers.outputResult();
        }
    }
}
