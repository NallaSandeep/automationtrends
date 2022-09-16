package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class StringReverse {
    /**
     * It prints the reverse of the given string. <br><br>
     * <b>Output:</b><br>
     * Enter a String:<br>
     * Truth prevails<br>
     * Reverse of 'Truth prevails':<br>
     * sliaverp hturT<br>
     * @author Sandeep, Nalla
     * @since April 16th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        String output = "";
        for(int i = input.length() - 1; i >= 0 ; i--) {
            output += input.charAt(i); 
        }
        System.out.println("Reverse of \'" + input + "\':\n" + output);
        scanner.close();
    }
}
