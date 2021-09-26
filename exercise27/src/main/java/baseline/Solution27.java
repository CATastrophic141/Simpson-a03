/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

        Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

        The first name must be filled in.
        The last name must be filled in.
        The first and last names must be at least two characters long.
        An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
        The ZIP code must be a number.
        Display appropriate error messages on incorrect data.*/

package baseline;

import java.util.Scanner;

class EmployeeEntry {
    public String validateInput(String firstName, String lastName, String zip, String code){
        //Call on validation functions for first name, last name, zip code, and employee code
        //Concatenate all validation function results
        String errorMessages;
        //If string is empty
        if (errorMessages.isBlank()) {
            //Return "There were no detected errors
            return;
        }
        //Return errorMessages in the case that the if statement fails
        return;
    }
    String validateFirstName(String firstName){
        //If string is less than two characters in length
        if (firstName.length()<2) {
                //If string is empty
                if (firstName.length()==0) {
                    //Return "First name must be filled in \n"
                    return;
                }
            //Return "First name must be more than 2 characters\n"
            return;
        }
        //Else return "" (empty string)
        return;
    }

    String validateLastName(String lastName){
        //If string is less than two characters in length
        if (lastName.length()<2) {
            //If string is empty
            if (lastName.length()==0) {
                //Return "last name must be filled in \n"
                return;
            }
            //Return "last name must be more than 2 characters\n"
            return;
        }
        //Else return "" (empty string)
        return;
    }

    String validateZipCode(String zip) {
        //For the length of the string
        for (int i = 0; i < zip.length(); i++) {
            //Check if each character is a number (Equal to number in ASCII)
            if (){
                //If a non-number is found
                //Return "Zip code must be a number\n"
                return;
            }
        }
            //Return "" (empty string) if loop is successfully passed
        return;
    }

    String validateEmployeeCode(String code){
    //For the length of the string
        for (int i = 0; i < zip.length(); i++) {
        //Check if each character is a valid (Equal to number in ASCII)
                //Check if first two characters are letters, check if third character is a dash, check if remaining are numbers
            if (){
            //If character is invalid at index
            //Return "Employee code must be in format AB-1234\n"
            return;
        }
    }
    //Return "" (empty string) if loop is successfully passed
        return;
    }
}

public class Solution27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for first name
        System.out.printf("%n");
        //Save first name to string variable
        String firstName = input.nextLine();
        //Prompt user for last name
        System.out.printf("%n");
        //Save last name to string variable
        String lastName = input.nextLine();
        //Prompt user for zip code
        System.out.printf("%n");
        //Save zip code to string variable
        String zipCode = input.nextLine();
        //Prompt user for employee code
        System.out.printf("%n");
        //Save code to string variable
        String employeeCode = input.nextLine();
        //Call on validateInput method
        //Print error list
        System.out.printf("");
    }
}
