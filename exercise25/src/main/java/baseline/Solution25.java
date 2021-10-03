/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;

class Password{
    //Validate if the password string contains a number character
    int checkNumbers(String password){
        int stringLength = password.length();
        int numScore = 0;
        int tracer = 0;
        //Convert password to char array for element reading
        char[] passString = password.toCharArray();
        //For the size of the string, check whether any of the characters is between the ASCII values of 48-57
        for (int i = 0; i<stringLength; i++){
            //if letter character is found increment tracer
            if (passString[i]>=46 && passString[i]<=57){
                tracer++;
            }
        }
        //If password string contains a number character update numScore to 1
        if (tracer > 0){
            numScore = 1;
        }
        //Return the score of the number-portion of the password
        return numScore;
    }
    //Validate if the password string contains a letter character
    int checkLetters(String password){
        int stringLength = password.length();
        int letterScore = 0;
        int tracer = 0;
        //Convert password to char array for element reading
        char[] passString = password.toCharArray();
        //For the size of the string, check whether any of the characters is between the ASCII values of 65-90 and 97-122
        for (int i = 0; i<stringLength; i++){
            //If a letter character is found increment tracer
            if ( (passString[i]>=65 && passString[i]<=90) || (passString[i]>=97 && passString[i]<=122)){
                tracer++;
            }
        }
        //If password string contains a letter character update letterScore to 2
        if (tracer > 0){
            letterScore = 2;
        }
        //Return the score of the letter-portion of the password
        return letterScore;
    }

    int checkSymbol(String password){
        int stringLength = password.length();
        int symbolScore = 0;
        int tracer = 0;
        //Convert password to char array for element reading
        char[] passString = password.toCharArray();
        //For the size of the string, check whether any of the characters is between the ASCII values of 32-47, 58-64, 91-96, and 123-125
        for (int i = 0; i<stringLength; i++){
            //If a symbol character is found increment tracer
            if ( (passString[i]>=32 && passString[i]<=47) || (passString[i]>=58 && passString[i]<=64) || (passString[i]>=91 && passString[i]<=96) || (passString[i]>=123 && passString[i]<=125)){
                tracer++;
            }
        }
        //If password string contains a symbol character update symbolScore to 2
        if (tracer > 0){
            symbolScore = 2;
        }
        //Return the score of the symbol-portion of the password
        return symbolScore;
    }

    int checkLength(String password){
        int lengthScore = 0;
        //If password string is greater than 8 characters update lengthScore to 1
        if (password.length() >= 8){
            lengthScore = 1;
        }
        //Return the score of length-portion of the password
        return lengthScore;
    }

    int passwordValidator(String password){
        //Return lengthCheck, numberCheck, letterCheck, and symbolCheck added together
        return checkLength(password) + checkNumbers(password) + checkLetters(password) + checkSymbol(password);
    }

    String resultStringGenerate(int score){
        return switch (score) {
            //If score = 0, print password strength is unknown
            case 0 -> "unknown";
            //If score = 1, print password strength is very weak
            case 1 -> "very weak";
            //If score = 2, print password strength is weak
            case 2 -> "weak";
            //If score = 3, print password strength is moderate
            case 3 -> "moderate";
            //If score = 4 or 5, print password is strong
            case 4, 5 -> "strong";
            //If score = 6, print password is very strong
            case 6 -> "very strong";
            default -> "unknown, or an error has occurred";
        };
    }
}

public class Solution25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Password passCheck = new Password();
        //Prompt user for password
        System.out.printf("Please enter a password%n");
        //Save password into string
        String password = input.nextLine();
        //Call password validator and save value to passwordScore variable
        int passwordScore = passCheck.passwordValidator(password);
        //Generate a string describing the strength of the password
        String result = passCheck.resultStringGenerate(passwordScore);
        //Print out the result of how strong the password is
        System.out.printf("Your password '%s' strength is %s%n", password, result);
    }
}
