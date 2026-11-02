package org.example;

import java.util.Scanner;

public class ConverterToTime {
    int[] result = new int[3];


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


    public int[] convertTime(int sec) {
        int hours = sec / 3600;
        int min = (sec % 3600) / 60;
        int seconds = sec % 60;
        result[0] = hours;
        result[1] = min;
        result[2] = seconds;
        return result;
    }

    private boolean isCorrect(int seconds) {
        return (seconds >= 0);
    }

    public void outputResult(int sec, int res[]) {
        if (isCorrect(sec)) {
            System.out.printf("%02d:%02d:%02d\n", res[0], res[1], res[2]);
        } else {
            System.out.println("Incorrect time");
        }
    }
}
