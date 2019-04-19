package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class RectangularPattern {
    /**
     * It prints the rectangular pattern for the given rows & columns count. <br><br>
     * <b>Output:</b><br>
     * Number of Rows:<br>
     * 4<br>
     * Number of Columns:<br>
     * 4<br>
     * <pre>
     * ****
     * *  *
     * *  *
     * ****
     * </pre>
     * @author Sandeep, Nalla
     * @since April 19th, 2019
     */
    public static void main(String[] args) {
        System.out.println("Number of Rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Number of Columns:");
        int columns = scanner.nextInt();
        for(int i=1; i <= rows; i++) {
            for (int j=1; j <= columns; j++) {
                if((i == 1) || (i == rows) || (j == 1) || (j == columns)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
