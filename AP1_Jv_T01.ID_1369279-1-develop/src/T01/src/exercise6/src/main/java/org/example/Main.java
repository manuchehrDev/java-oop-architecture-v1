package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        SelectionSort selectionSort = new SelectionSort();

        int sizeArray = selectionSort.getNumber(scanner);

        if(selectionSort.setSize(sizeArray)){
            selectionSort.setSrcArray(scanner,sizeArray);
            selectionSort.selectionSort();
            selectionSort.outputResult();
        }else{
            System.out.println("Input error. Size <= 0");
        }
    }


}