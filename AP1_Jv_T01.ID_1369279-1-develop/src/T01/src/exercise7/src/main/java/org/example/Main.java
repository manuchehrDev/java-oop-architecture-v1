package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FindMaxMin findMaxMin = new FindMaxMin();
        Scanner scanner = new Scanner(System.in);
        String path = findMaxMin.getPath(scanner);
        findMaxMin.outputFile("src/main/resources/" + path);
    }
}