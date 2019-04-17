package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class Palindrome {
    /**
     * It says if the given string is palindrome or not. <br><br>
     * <b>Output:</b><br>
     * Enter a String:<br>
     * 12321<br>
     * '12321' is a Palindrome
     * @author Sandeep, Nalla
     * @since April 17th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (input.equals(reverse)) {
            System.out.println("\'" + input + "\' is a Palindrome");
        } else {
            System.out.println("\'" + input + "\' is not a Palindrome");
        }
        scanner.close();
    }

}
