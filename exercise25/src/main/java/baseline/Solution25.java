/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*Functions help you abstract away complex operations, but they also help you build reusable components.

        Create a program that determines the complexity of a given password based on these rules:

        A very weak password contains only numbers and is fewer than eight characters.
        A weak password contains only letters and is fewer than eight characters.
        A strong password contains letters and at least one number and is at least eight characters.
        A very strong password contains letters, numbers, and special characters and is at least eight characters.
        If a password does not meet any of these rules, then report it as a password of unknown strength.*/

package baseline;

import java.util.Scanner;

class Password{
    //Validate if the password string contains a number character
    int numberCheck(String password){
        int stringLength;
        int numScore;
        int tracer;
        //For the size of the string, check whether any of the characters is between the ASCII values of 48-57
        for (int i = 0; i<stringLength; i++){

        }
        //If password string contains a number character update numScore to 1
        if (tracer > 0){

        }
        //Return the score of the number-portion of the password
        return numScore;
    }
    //Validate if the password string contains a letter character
    int letterCheck(String password){
        int stringLength;
        int letterScore;
        int tracer;
        //For the size of the string, check whether any of the characters is between the ASCII values of 65-90 and 97-122
        for (int i = 0; i<stringLength; i++){
            //If a number character is found increment tracer
        }
        //If password string contains a letter character update letterScore to 2
        if (tracer > 0){

        }
        //Return the score of the letter-portion of the password
        return letterScore;
    }

    int symbolCheck(String password){
        int stringLength;
        int symbolScore;
        int tracer;
        //For the size of the string, check whether any of the characters is between the ASCII values of 32-47, 58-64, 91-96, and 123-125
        for (int i = 0; i<stringLength; i++){
            //If a symbol character is found increment tracer
        }
        //If password string contains a symbol character update symbolScore to 2
        if (tracer > 0){

        }
        //Return the score of the symbol-portion of the password
        return symbolScore;
    }

    int lengthCheck(String password){
        int lengthScore;
        //If password string is greater than 8 characters update lengthScore to 1
        if (password.length() >= 8){

        }
        //Return the score of length-portion of the password
    }

    int passwordValidator(String password){
        //Call lengthCheck, save value to lengthScore variable
        //Call numCheck, save value to numScore variable
        //Call letterCheck, save value to letterScore variable
        //Call SymbolCheck, save value to symbolScore variable
        //Add all variables and return total
        return;
    }
}

public class Solution25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Password passCheck = new Password();
        //Prompt user for password
        System.out.printf("%n");
        //Save password into string
        String password = input.nextLine();
        //Call password validator and save value to passwordScore variable
        int passwordScore = passCheck.passwordValidator(password);
        //Enter switch statement
        switch (passwordScore) {
            //If score = 0, print password strength is unknown
            case 0 -> System.out.printf("%n");

            //If score = 1, print password strength is very weak
            case 1 -> System.out.printf("%n");

            //If score = 2, print password strength is weak
            case 2 -> System.out.printf("%n");

            //If score = 3, print password strength is moderate
            case 3 -> System.out.printf("%n");

            //If score = 4, print password is strong
            case 4 -> System.out.printf("%n");

            //If score = 5 or greater (Default), print password is very strong
            default -> System.out.printf("%n");
        }
    }
}
