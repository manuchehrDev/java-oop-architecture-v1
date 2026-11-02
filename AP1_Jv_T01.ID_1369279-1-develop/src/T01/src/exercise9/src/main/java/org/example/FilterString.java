package org.example;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FilterString {
    boolean isCorrectSize = true;
    int sizeArray = 0;
    String filterString;

    List<String> stringsList;
    List<String> resultList;

    public boolean firstLineHandler(Scanner scanner) {
        boolean isCorrect = true;
        if (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                this.sizeArray = scanner.nextInt();
            } else {
                isCorrect = false;
            }
        } else {
            isCorrect = false;
        }
        return isCorrect;
    }


    public void getString(Scanner scanner) {
        for (int i = 0; i <= sizeArray; i++) {
            stringsList.add(scanner.nextLine());
        }
    }

    public void getFilterString(Scanner scanner) {
        if (scanner.hasNext()) {
            filterString = scanner.nextLine();
        }
    }

    public void simpleSearch() {
        for (int i = 0; i < stringsList.size(); i++) {
            String str = stringsList.get(i);
            if (searchFilter(str, filterString)) {
                resultList.add(str);
            }
        }
    }

    private boolean searchFilter(String string, String filter) {
        boolean find = true;

        if (string.length() < filter.length()) {
            find = false;
        }

        for (int i = 0; i < (string.length() - filter.length()); i++) {
            boolean findFilter = true;
            for (int j = 0; j < filter.length(); j++) {
                if (string.charAt(i + j) != filter.charAt(j)) {
                    findFilter = false;
                    break;
                }
            }
            if (findFilter) {
                find = true;
            } else {
                find = false;
            }
        }
        return find;
    }


    public void handleStringList(Scanner scanner) {
        stringsList = new LinkedList<>();
        resultList = new LinkedList<>();
        while (true) {
            boolean isCor = firstLineHandler(scanner);
            if (isCor && this.sizeArray > 0) {
                getString(scanner);
                getFilterString(scanner);
                simpleSearch();
                outputResult();
                break;
            } else if (this.sizeArray <= 0 && isCor) {
//            System.out.println("Input error. Size <= 0");
//                scanner.next();
                break;
            } else {
//                System.out.println("Could not parse a number. Please, try again");
                scanner.next();
                break;
            }
        }
    }

    public void outputResult() {
        if (!resultList.isEmpty()) {
            for (String s : resultList) {
                System.out.println(s);
            }
        }

    }

}
