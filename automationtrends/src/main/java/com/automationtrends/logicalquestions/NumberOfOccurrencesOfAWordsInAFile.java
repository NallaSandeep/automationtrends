package com.automationtrends.logicalquestions;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberOfOccurrencesOfAWorkInAFile {
    /**
     * It prints the number of occurrences of each word in a given file. <br><br>
     * <b>Output:</b><br>
     * File content:<br>
     * Text1 text2 text3 text4 <br>
     * Text1 text2 text3 <br>
     * Text1 text2 <br>
     * Text1<br>
     * <br>
     * Number of Occurrences of each word in the file:<br>
     * text3 = 2; text4 = 1; text2 = 3; Text1 = 4; 
     * @author Sandeep, Nalla
     * @since April 18th, 2019
     */
    public static void main(String[] args) {
        String fileContent = "";
        try {
            fileContent = readFile("./src/main/resources/WordOccurrences.txt", StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File content:\n" + fileContent + "\n");
        String[] words = fileContent.split("\\s");
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < words.length; i++) {
            String temp = words[i];
            if(!temp.isEmpty()) {
                set.add(temp);
            }
        }
        System.out.println("Number of Occurrences of each word in the file:");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String temp = iterator.next();
            int count = 0;
            for(int i = 0; i < words.length; i++) {
                if(temp.equals(words[i])) {
                    count++;
                }
            }
            System.out.print(temp + " = " + count + "; ");
        }
    }
    
    static String readFile(String path, Charset encoding) 
            throws IOException 
          {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, encoding);
          }
}
