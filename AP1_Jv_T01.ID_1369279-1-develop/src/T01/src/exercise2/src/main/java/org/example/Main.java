package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] res = new int[3];
        ConverterToTime converterToTime = new ConverterToTime();
        Scanner scanner = new Scanner(System.in);
        int second = converterToTime.getNumber(scanner);
        res = converterToTime.convertTime(second);
        converterToTime.outputResult(second,res);
    }
}