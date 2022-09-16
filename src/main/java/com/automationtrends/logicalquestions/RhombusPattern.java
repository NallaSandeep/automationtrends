package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class RhombusPattern {

    public static void main(String[] args) {
        System.out.println("Rhombus size:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rhombusSize = 2 * size + 1;
        int temp = size + 1;
        for (int i = 1; i <= temp; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rhombusSize; k++) {
                if (k ==1 || k == (2 * (i - 1) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
