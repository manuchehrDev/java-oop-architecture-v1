package org.example;

import java.util.Scanner;

public class SortedSubSequence {
    int prevNumber = 0;
    int currentNumber = 0;
    int index = 0;
    boolean isFirstLine = false;
    boolean isSorted = true;
    boolean isInteger = true;

    public void getNumbers(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                currentNumber = scanner.nextInt();
                if (currentNumber > prevNumber) {
                    prevNumber = currentNumber;
                } else {
                    isSorted = false;
                    break;
                }
                index++;
            } else {
                isInteger = false;
                return;
            }

        }
    }


    public boolean firstLineHandler(Scanner scanner, int num) {
        boolean isCorrect = true;
        if (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                isCorrect = false;
            }
        }else {
            isCorrect = false;
        }
        return isCorrect;
    }

    public void sortSequence(Scanner scanner) {
        int number = 0;
        isFirstLine = firstLineHandler(scanner, number);
        if (isFirstLine) {
            getNumbers(scanner);
            if (!isSorted) {
                System.out.println("The sequence is not ordered from the ordinal number of the number " + (index + 1) );
            } else if (isSorted && !isInteger) {
                System.out.println("The sequence is ordered in ascending order");
            }
        } else {
            System.out.println("Input error");
        }

    }

}
