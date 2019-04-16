package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class PatternStarsUpperLowerRightAngleTriangles {
    /**
     * It prints the below pattern.
     *<pre>
     **
     ***
     ****
     *****
     *****
     ****
     ***
     **
     *</pre>
     * @author Sandeep, Nalla
     * @since April 14th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows for upper/lower triangle:");
        int rowCount = scanner.nextInt();
        System.out.println("Output:");
        for (int i = 1; i <= rowCount; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rowCount; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
