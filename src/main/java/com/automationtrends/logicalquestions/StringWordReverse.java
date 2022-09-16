package com.automationtrends.logicalquestions;

import java.util.Scanner;

public class StringWordReverse {
    /**
     * It prints the words of the given string in reverse order. <br><br>
     * <b>Output:</b><br>
     * Enter a String:<br>
     * Will meet you tomorrow<br>
     * Words of 'Will meet you tomorrow' in reverse order:<br>
     * tomorrow you meet Will<br>
     * @author Sandeep, Nalla
     * @since April 16th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String output = "";
        for(int i = words.length - 1; i >= 0 ; i--) {
            output = output + words[i] + " "; 
        }
        System.out.println("Words of \'" + input + "\' in reverse order:\n" + output);
        scanner.close();
    }
}
