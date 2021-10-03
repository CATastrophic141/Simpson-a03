/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {
    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    int numSpecial;
    int numNumbers;
    int minLength;

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> numbers = new ArrayList<>();
    ArrayList<Character> special = new ArrayList<>();
    ArrayList<Character> password = new ArrayList<>();

    void initializeGenerator() {
        //Prompt for minimum length
        System.out.printf("%n");
        //Prompt for number of special characters
        System.out.printf("%n");
        //Prompt for number of Numbers
        System.out.printf("%n");
        //Initialize lists of characters using loops

    }

    int generateRandomIndex(int size){
        //Return a random number from zero to the size of the respective entry (not including bound)
        return;
    }

    int findProperPasswordSize(){
        //If minimum length is greater than numNumbers plus numSpecial return minimumLength
        if(){
            return;
        }
        //Else return numNumbers plus numSpecial
        else{
            return;
        }
    }

    String generatePassword(){
        //Invalidate incorrect minimum length
        if () {
            return "";
        }
        //Create variables to track how many times numbers or special characters have been added
        int numberCount;
        int specialCount;
        //Save the minimum number of letters as the number of number and special characters added
        int minLetters;
        //Call actual length finding method, save to variable
        int passLength;
        //For the passwordLength
        for(){
            //Generate random number between 0 and 2 to determine if a letter, number, or special character is to be added
            int random;
            //If random number is 0 or if numberCount is less than numNumber
            if(){
                //Add a randomly chosen number character to password list;
            }
            //If random number is 1 or if specialCount is less than numSpecial
            if(){
                //Add a randomly chosen number character to password list;
            }
            //Else
            else {
                //Add a randomly chosen letter character
            }
        }
        //Return password converted into a string
        return;
    }

}

public class Solution37 {
    public static void main(String[] args){
        PasswordGenerator pass = new PasswordGenerator();
        //Call password generator initializer
        pass.initializeGenerator();
        //Call password generator, save result to string variable
        String password;
        //Print out password
        System.out.printf("Your randomly generated password is: %s", password);
    }
}
