/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;
import static java.lang.Character.isUpperCase;

class EmployeeEntry {
    String validateInput(String firstName, String lastName, String zip, String code){
        //Call on validation functions for first name, last name, zip code, and employee code
        //Concatenate all validation function results
        String errorMessages = validateFirstName(firstName) + validateLastName(lastName) + validateZipCode(zip) + validateEmployeeCode(code);
        //If string is empty
        if (errorMessages.isBlank()) {
            //Return "There were no detected errors\n"
            return "There were no detected errors\n";
        }
        //Return errorMessages in the case that the if statement fails
        return errorMessages;
    }

    String validateFirstName(String firstName){
        //If string is less than two characters in length
        if (firstName.length()<2) {
                //If string is empty
                if (firstName.length()==0) {
                    //Return "First name must be filled in \n"
                    return "First name must be filled in\nFirst name must be at least 2 characters\n";
                }
            //Return "First name must be at least 2 characters\n"
            return "First name must be at least 2 characters\n";
        }
        //Else return "" (empty string)
        return "";
    }

    String validateLastName(String lastName){
        //If string is less than two characters in length
        if (lastName.length()<2) {
            //If string is empty
            if (lastName.length()==0) {
                //Return "Last name must be filled in\n"
                return "Last name must be filled in\nLast name must be at least 2 characters\n";
            }
            //Return "Last name must be at least 2 characters\n"
            return "Last name must be at least 2 characters\n";
        }
        //Else return "" (empty string)
        return "";
    }

    String validateZipCode(String zip) {
        //For the length of the string
        for (int i = 0; i < zip.length(); i++) {
            //Check if each character is a number (Equal to number in ASCII)
            //If a non-number is found
            if (zip.charAt(i)<48 || zip.charAt(i)>57){
                //Return "Zip code must be a number\n"
                return "Zip code must be a 5 digit number\n";
            }
        }
            //Return "" (empty string) if loop is successfully passed
        return "";
    }

    String validateEmployeeCode(String code){
    //For the length of the string
        String resultChar;
        String resultLength;
        //Call on code character validation method, save result to result string
        resultChar = validateEmployeeCodeString(code);
        //Call on code length validation method, save result to result string
        resultLength = validateEmployeeCodeLength(code);
        //Return "" (empty string) if loop is successfully passed
        return resultChar + resultLength;
    }

    private String validateEmployeeCodeString(String code){
        //Save characters at each valid index
        char character0 = validateCharacterUpperCase(code, 0);
        char character1 = validateCharacterUpperCase(code, 1);
        char character2 = code.charAt(2);
        char character3 = code.charAt(3);
        char character4 = code.charAt(4);
        char character5 = code.charAt(5);
        char character6 = code.charAt(6);
        //For the length of the string
        for (int i = 0; i < code.length(); i++) {
            //Check if each character is a valid (Equal to number in ASCII)
                    //Check if first two characters are letters, if third character is a dash, and if remaining 4 characters are numbers
            if ((character0>=65 && character0<=90) && (character1>=65 && character1<=90) && (character2==45) && (character3>=48 && character3<=57) && (character4>=48 && character4<=57) && (character5>=48 && character5<=57) && (character6>=48 && character6<=57)){
                //If character is valid
                //Return "" (empty string)
                return "";
            }
        }
        //If any characters are invalid return "Employee code must be in format AB-1234\n"
        return "Employee code must be in format AB-1234\n";
    }

    private char validateCharacterUpperCase(String code, int index){
        //If character at chosen index is not in uppercase form
        if (!isUpperCase(code.charAt(index))) {
            //Return uppercase form of character
            return Character.toUpperCase(code.charAt(index));
        }
        //Else return normal character
        return code.charAt(index);
    }

    private String validateEmployeeCodeLength(String code){
        //If the employee code string is longer than 7 characters
        if (code.length()>7){
            for (int j = 7; j<code.length(); j++){
                //If the ASCII value of the character is not null return "Employee code must be in format AB-1234\n"
                if(code.charAt(j) > 0){
                    return "Employee code must be less than 8 characters long (AB-1234)\n";
                }
            }
        }
        return "";
    }
}

public class Solution27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeEntry entry = new EmployeeEntry();
        //Prompt user for first name
        System.out.printf("Enter first name%n");
        //Save first name to string variable
        String firstName = input.nextLine();
        //Prompt user for last name
        System.out.printf("Enter last name%n");
        //Save last name to string variable
        String lastName = input.nextLine();
        //Prompt user for zip code
        System.out.printf("Enter zip code%n");
        //Save zip code to string variable
        String zipCode = input.nextLine();
        //Prompt user for employee code
        System.out.printf("Enter employee code%n");
        //Save code to string variable
        String employeeCode = input.nextLine();
        //Call on validateInput method
        String errorResults = entry.validateInput(firstName, lastName, zipCode, employeeCode);
        //Print error list
        System.out.printf("%s",errorResults);
    }
}
