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

    int numSpecial;
    int numNumbers;
    int minLength;

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> numbers = new ArrayList<>();
    ArrayList<Character> special = new ArrayList<>();
    ArrayList<Character> password = new ArrayList<>();

    void initializeGenerator(int minLen, int numNum, int numSpec) {
        //Initialize variables
        minLength = minLen;
        numNumbers = numNum;
        numSpecial = numSpec;
        //Initialize lists of characters using loops (Letters and numbers)
        for (char letter = 'A'; letter <= 'Z'; letter++){
            letters.add(letter);
        }
        for (char number = '0'; number <= '9'; number++){
            numbers.add(number);
        }
        //Selectively choose the special characters to use in the password
        special.add('!');
        special.add('?');
        special.add('@');
        special.add('#');
        special.add('$');
        special.add('%');
        special.add('&');
        special.add('*');
        special.add('+');
        special.add('-');
        special.add('=');
        special.add('>');
        special.add('<');
        special.add('~');
    }

    int generateRandomIndex(int size){
        //Return a random number from zero to the size of the respective entry (not including bound)
        return rand.nextInt(size);
    }

    int findProperPasswordSize(){
        //Return the greatest between minLength and (numNumbers+numSpecial) times two, for inclusion of required number of numbers, letters, and specials
        return Math.max(minLength, 2*(numNumbers+numSpecial));
    }

    String generatePassword(int min, int numNum, int numSpec){
        //Invalidate incorrect minimum length
        if (min <= 0) {
            return "<ERROR> Sorry, you did not enter a valid number for a password length. Please try again.";
        }
        //Create variables to track how many times numbers or special characters have been added
        int numberCount = 0;
        int specialCount = 0;
        //Call actual length finding method, save to variable
        int passLength = findProperPasswordSize();
        //For the passwordLength
        for(int i = 0; i < passLength; i++){
            //Generate random number between 0 and 2 to determine if a letter, number, or special character is to be added
            int random = rand.nextInt(3);
            //If random number is 0 and numberCount is less than numNumber
            if(random == 0 && numberCount < numNum){
                //Add a randomly chosen number character to password list
                password.add(numbers.get(generateRandomIndex(numbers.size())));
                //Increment numberCount
                numberCount++;
            }
            //If random number is 1 and specialCount is less than numSpecial
            else if(random == 1 && specialCount < numSpec){
                //Add a randomly chosen number character to password list
                password.add(special.get(generateRandomIndex(special.size())));
                specialCount++;
            }
            //Else
            else {
                //Add a randomly chosen letter character
                password.add(letters.get(generateRandomIndex(letters.size())));
            }
        }
        StringBuilder finalResult = new StringBuilder();
        //Use loop to properly convert list into string
        for(Character character : password){
            finalResult.append(character);
        }
        //Return password converted into a string
        return finalResult.toString();
    }

}

public class Solution37 {
    public static void main(String[] args){
        PasswordGenerator pass = new PasswordGenerator();
        Scanner input = new Scanner(System.in);
        //Prompt for minimum length
        System.out.printf("Enter the minimum length of the password:%n");
        //Scan user input
        int minLength = input.nextInt();
        //Prompt for number of special characters
        System.out.printf("Enter the number of special characters for the password:%n");
        //Scan user input
        int numSpecial = input.nextInt();
        //Prompt for number of Numbers
        System.out.printf("Enter the number of numbers for the password:%n");
        //Scan user input
        int numNumbers = input.nextInt();
        //Call password generator initializer
        pass.initializeGenerator(minLength, numNumbers, numSpecial);
        //Call password generator, save result to string variable
                //Class variables must be called as parameters as testing occasionally fails to gather the values
        String password = pass.generatePassword(pass.minLength, pass.numNumbers, pass.numSpecial);
        //Print out password
        System.out.printf("Your randomly generated password is: %s", password);
    }
}
