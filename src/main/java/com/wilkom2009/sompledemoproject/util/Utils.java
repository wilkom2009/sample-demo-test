package com.wilkom2009.sompledemoproject.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static double calculateAverage(double a, double b) {
        return (a + b) / 2;
    }
    
    public static double calculateTabAverage(double[] tab) {
        if (tab == null || tab.length == 0) {
            return 0;
        }
        double av = 0;
        for (int i = 0; i < tab.length; i++) {
            av += tab[i];
        }

        return av / tab.length;
    }

    /**
     * Find n occurence of char c in provided text
     * 
     * @param c
     * @param text
     * @return n occurences of char c in provided text
     */
    public static double findNumberOccurences(char c, String text) {
        if (text != null) {
            int lastIn = text.lastIndexOf(c);
            if (lastIn >= 0) {
                double nbOccurence = 0;

                char[] chars = text.toCharArray();
                for (int i = 0; i <= lastIn; i++) {
                    if (chars[i] == c) {
                        nbOccurence++;
                    }
                }

                return nbOccurence;
            }

        }
        return 0;
    }
    
    /**
     * Count a number of vowels in the provided text
     * 
     * @param text
     * @return number of vowels found in the provided text
     */
    public static double findVowelCounts(String text) {
        char[] vowelChars = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y' };
        if (text != null) {
            double nbOccurence = 0;

            char[] chars = text.toCharArray();
            for (int i = 0; i < text.toCharArray().length; i++) {
                for (int j = 0; j < vowelChars.length; j++) {
                    if (chars[i] == vowelChars[j]) {
                        nbOccurence++;
                        break;
                    }
                }
            }

            return nbOccurence;

        }
        return 0;
    }

    /**
     * Count number of vowels occurences in the provided text
     * 
     * @param text
     * @return Count number of vowels occurences in the provided text
     */
    public static double findVowelOccurences(String text) {
        List<String> vowelList = new ArrayList<>();
        vowelList.addAll(Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U", "y", "Y"));
        if (text != null) {
            double nbOccurence = 0;
            List<String> searchableList = vowelList;
            for (int i = 0; i < text.length(); i++) {
                for (int j = 0; j < searchableList.size(); j++) {
                    if (text.charAt(i) == searchableList.get(j).charAt(0)) {
                        nbOccurence++;
                        searchableList.remove(j);
                        break;
                    }
                }
            }

            return nbOccurence;

        }
        return 0;
    }

    /** 
     * Count number of occurences of provided word in the given text
     * 
     * @param word
     * @param text
     * @return number of occurences of provided word in the given text
     */
    public static double findWordCounts(String word, String text) {

        if (text != null && word != null) {
            double nbOccurence = 0;
            String[] searchableList = text.split(" ");
            for (int i = 0; i < searchableList.length; i++) {
                if (word.equals(searchableList[i])) {
                    nbOccurence++;
                }
            }

            return nbOccurence;

        }
        return 0;
    }
}
