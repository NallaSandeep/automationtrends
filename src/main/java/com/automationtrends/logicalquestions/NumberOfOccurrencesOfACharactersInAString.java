package com.automationtrends.logicalquestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NumberOfOccurrencesOfACharactersInAString {
    /**
     * It prints the number of occurrences of each character of a given string. <br><br><b>Output:</b><br>
     * Enter a String:<br>
     * INDIA <br>A = 1; D = 1; I = 2; N = 1; 
     * @author Sandeep, Nalla
     * @since April 17th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String string = scanner.nextLine();
        int length = string.length();
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < length; i++) {
            set.add(string.charAt(i));
        }
        Iterator<Character> iterator = set.iterator();
        while(iterator.hasNext()) {
            Character temp = iterator.next();
            int count = 0;
            for (int i = 0; i < length; i++) {
                if (temp.equals(string.charAt(i))) {
                    count++;
                }
            }
            System.out.print(temp + " = " + count + "; ");
        }
        scanner.close();
    }
}
