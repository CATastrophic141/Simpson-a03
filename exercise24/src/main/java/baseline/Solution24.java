/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

class Anagram{
    Scanner input = new Scanner(System.in);

    String promptAnagramString(int stringNum){
        //Prompt user for string using stringNum to validate string number
        System.out.printf("Please input a string %d%n", stringNum);
        //Save user input
        String userString = input.nextLine();
        //return input set to uppercase cor case insensitivity
        return userString.toUpperCase();
    }

    String prepAnagramString(String str){
        //Convert string into a char array
        char[] charArray = str.toCharArray();
        //Sort char array
        Arrays.sort(charArray);
        //return string made from sorted char array
        return Arrays.toString(charArray);
    }

    boolean isAnagram(String string1, String string2){
        //Save sorted version of string1
        String sortedString1 = prepAnagramString(string1);
        //Save sorted version of string2
        String sortedString2 = prepAnagramString(string2);
        //Return true or false if the strings are equivalent
        return sortedString1.equals(sortedString2);
    }

    void anagramResult(boolean isAnagram){
        //If strings are anagrams print positive confirmation
        if(isAnagram){
            System.out.printf("The two strings are anagrams%n");
        }
        //If strings are not anagrams print negative confirmation
        else{
            System.out.printf("The two strings are not anagrams%n");
        }
    }
}

public class Solution24 {
    public static void main(String[] args){
        Anagram anagram = new Anagram();

        System.out.printf("Enter two strings to check if they are anagrams%n");
        //Save first string in variable with call to prompt method
        String string1 = anagram.promptAnagramString(1);
        //Save second string in variable with call too prompt method
        String string2 = anagram.promptAnagramString(2);
        //Save true or false result to a boolean variable with call to comparison method
        boolean result = anagram.isAnagram(string1, string2);
        //Call result printing method
        anagram.anagramResult(result);
    }
}
