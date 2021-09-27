/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*The rule of 72 is a quick method for estimating how long it will take to double your investment,
 by taking the number 72 and dividing it by the expected rate of return.
  It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you.
   It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero.
    And instead of exiting the program when the user enters invalid input,
     you can just keep prompting for inputs until you get one that’s valid.

        Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

        The formula is

        years = 72 / r
        where r is the stated rate of return.*/

/*The following format can be used to validate input:while (true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next();
            }
            System.out.println(ERROR_MSG);
        }
         */

package baseline;

import java.util.Scanner;

class Investment {

    double inputValidator(){
        Scanner input = new Scanner(System.in);
        //Prompt user for rate of return
        System.out.printf("%n");
        //Save user input to string
        String userIn;
        //If user input is not a number or is equal to or less than
        if () {
            //while the user input value is invalid
            while () {
                //Print error statement
                System.out.printf("%n");
                //Prompt user for rate of return
                System.out.printf("%n");
                //Get user input
                userIn;
            }
         else {
            //Return user input (Ensure it has been parsed into a double)
            return;
        }
    }

    double findYearsUntilDouble(double rate){
        //Return 72 divided by the rate
        return;
    }

}

public class Solution29 {
    public static void main(String[] args){
        //Call input validation method and save value
        //Call years until double method and save value
        //Print out how many years it will take until the investment is doubled
        System.out.printf("%n");
    }
}
