/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.*/

package baseline;

import java.util.Scanner;

class PaymentCalculator {
    double balance;
    double aprPercent;
    double dailyRate;
    double monthlyPayment;

    void constructPrompt(){
        Scanner input = new Scanner(System.in);
        //Prompt user for balance
        System.out.printf("%n");
        //Save user input to balance instance variable
        //Round value up to the next cent

        //Prompt user for apr percent
        System.out.printf("%n");
        //Save user input to aprPercent instance variable

        //Save daily rate as aprPercent divided by (100*350) to get daily APR on the card

        //Prompt user for monthly payment
        System.out.printf("%n");
        //Save user input to monthly payment
        //Round value up to next cent
    }

    private double calculateRatePower(){
        //Separate the power from the main function
        //Return (1 - (1 + dailyRate)) to the power of 30
        
    }

    private double calculateFirstLogArgument(){
        //Separate the first logarithm argument from the previous
        //Return (1 + balance/monthlyPayment times calculateRatePower

    }

    private double calculatePaymentLogarithm(){
        //Separate the logarithm calculation from the main function
        //Return the log of calculateFirstLogArgument divided by the log of 1+dailyRate

    }

    public double calculateMonthsUntilPaidOff(){
        //Return -(1/30) times calculatePaymentLogarithm

    }

}

public class Solution26 {
    public static void main(String[] args){
        PaymentCalculator creditCard1 = new PaymentCalculator();
        //Call the payment constructor to complete instance of PaymentCalculator
        creditCard1.constructPrompt();
        //Call calculateMonthsUntilPaidOff and save result to numMonths variable
        double months = creditCard1.calculateMonthsUntilPaidOff();
        //Round up value to next month
        //Print out how many months the user has until the card is paid off
        System.out.printf("%n");
    }
}
