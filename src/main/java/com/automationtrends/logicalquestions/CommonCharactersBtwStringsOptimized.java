package com.automationtrends.logicalquestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonCharactersBtwStringsOptimized {
    /**
     * It prints the reverse of the given string (Optimized Solution). <br><br><b>Output:</b><br>
     * Enter a String1:<br>
     * Roses <br>Enter a String2: <br>Florist <br>Common Characters between 'ROSES' and
     * 'FLORIST': <br>'R' 'S' 'O'
     * @author Sandeep, Nalla
     * @since April 17th, 2019
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String1:");
        String string1 = scanner.nextLine().toUpperCase();
        System.out.println("Enter a String2:");
        String string2 = scanner.nextLine().toUpperCase();
        Set<String> set = new HashSet<String>();
        int length = string1.length();
        for(int i=0; i < length; i++) {
            String temp = "" + string1.charAt(i);
            if (string2.contains(temp)) {
                set.add(temp);
            }
        }
        System.out.println(set);
        scanner.close();
    }
}
