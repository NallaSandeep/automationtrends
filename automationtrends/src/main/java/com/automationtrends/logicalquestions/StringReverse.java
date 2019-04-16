package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        String output = "";
        for(int i = input.length() - 1; i >= 0 ; i--) {
            output += input.charAt(i); 
        }
        System.out.println("Reverse of \'" + input + ":\n" + output);
        scanner.close();
    }
}
