/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;

class Investment {

    private static boolean isNumeric(String string) {
        //If the string is empty return false
        if (string == null) {
            return false;
        }
        //If attempting to parse the string results in an error return false
        try {
            Double.parseDouble(string);
        } catch (NumberFormatException nfe) {
            return false;
        }
        //If parsing is successful return true
        return true;
    }

    double validateInput(String userIn){
        Scanner input = new Scanner(System.in);
        //while the user input value is not a number or is less than or equal to 0
        while (true) {
            //If the user input is not a number
            if (!isNumeric(userIn)){
                //Print error message
                System.out.printf("Please enter a number input%nEnter the rate of the return%n");
                //Take next user input
                userIn = input.nextLine();
            }
            //If the user input is less than or equal to zero
            else if(Double.parseDouble(userIn) <= 0) {
                //Print error message
                System.out.printf("Please enter a number greater than 0%nEnter the rate of the return%n");
                //Take next user input
                userIn = input.nextLine();
            }
            else if (Double.parseDouble(userIn) > 0){
                //Return user input (Ensure it has been parsed into a double)
                return Double.parseDouble(userIn);
            }
        }
    }

    double findYearsUntilDouble(double rate){
        //Return 72 divided by the rate
        return Math.ceil((72.0/rate)*100)/100;
    }

}

public class Solution29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Investment invest = new Investment();
        //Initial prompt for rate of return
        System.out.printf("Enter the rate of the return%n");
        //Save user input to string for testing
        String userIn = input.nextLine();
        //Call input validation method and save value
        double rate = invest.validateInput(userIn);
        //Call years until double method and save value
        double years = invest.findYearsUntilDouble(rate);
        //Print out how many years it will take until the investment is doubled
        System.out.printf("It will take %.2f years for your investment to double%n", years);
    }
}
