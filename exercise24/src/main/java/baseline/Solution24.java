/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

class Anagram{
    Scanner input = new Scanner(System.in);

    /*Prompt user for a string, using argument to validate the string identity
    * save user input to string variable
    * return string set to uppercase using .toUpperCase
    *         (Set to uppercase for case insensitivity) */
    String promptAnagramString(int stringNum){
        System.out.printf("Please input a string %d%n", stringNum);
        String userString = input.nextLine();
        return userString.toUpperCase();
    }

    /* Convert string input into a character array using .toCharArray()
    * Sort array using Arrays.sort()
    * Convert array back to string
    * Return sorted string*/
    private String anagramStringPrep(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }

    /* Call anagramStringPrep for sortedString1, save result to new sortedString1 variable
    * Call anagramStringPrep for sortedString2, save result to new sortedString2 variable
    * Compare two sorted strings
    * If the strings are equivalent return true
    * Else return false*/
    boolean anagramCompare(String string1, String string2){
        String sortedString1 = anagramStringPrep(string1);
        String sortedString2 = anagramStringPrep(string2);
        return sortedString1.equals(sortedString2);
    }

    /*If isAnagram is true
    *       Print that the strings are anagrams
    * Else
    *       Print that the strings are not anagrams*/
    void anagramResult(boolean isAnagram){
        if(isAnagram){
            System.out.printf("The two strings are anagrams%n");
        }
        else{
            System.out.printf("The two strings are not anagrams%n");
        }
    }
}

public class Solution24 {
    public static void main(String[] args){
        Anagram anagram = new Anagram();

        /*Print that two strings will be checked to see if they are anagrams
        * Call two iterations of promptAnagramString saved to two separate string Variables
        * Call anagramCompare, save result to boolean variable
        * Call anagramResult*/
        System.out.printf("Enter two strings to check if they are anagrams%n");
        String string1 = anagram.promptAnagramString(1);
        String string2 = anagram.promptAnagramString(2);
        boolean result = anagram.anagramCompare(string1, string2);
        anagram.anagramResult(result);
    }
}
