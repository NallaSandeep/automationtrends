package com.automationtrends.logicalquestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CommonCharactersBtwStrings {
    /**
     * It prints the reverse of the given string. <br><br><b>Output:</b><br>
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
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        int length1 = string1.length();
        int length2 = string2.length();
        for (int i = 0; i < length1; i++) {
            set1.add(string1.charAt(i));
        }
        for (int i = 0; i < length2; i++) {
            set2.add(string2.charAt(i));
        }
        System.out.println("Common Characters between \'" + string1 + "\' and \'" + string2 + "\':");
        Iterator<Character> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Iterator<Character> iterator2 = set2.iterator();
            Character temp1 = iterator1.next();
            while (iterator2.hasNext()) {
                if (temp1.equals(iterator2.next())) {
                    System.out.print("\'" + temp1 + "\' ");
                }
            }
        }
        scanner.close();
    }
}
