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

    void constructPaymentCalc(double bal, double apr, double monthly){
        //Save bal to balance instance variable. Round to next cent
        balance = Math.ceil(bal*100)/100;
        //Save apr to aprPercent instance variable
        aprPercent = apr;
        //Calculate dailyRate from aprPercent divided by 100 and 365
        dailyRate = aprPercent/(100*365);
        //Save monthly to monthlyPayment instance variable. Round to next cent
        monthlyPayment = Math.ceil(monthly*100)/100;
    }

    double calculatePowerArgument(){
        //Separate (1 + dailyRate) from the power calculation
        //Return (1 + dailyRate), dailyRate is aprPercent/35000
        return (1 + dailyRate);
    }

    double calculateRatePower(){
        //Separate the power from the log argument
        //Return (1 - (1 + dailyRate)) to the power of 30
        return Math.pow(calculatePowerArgument(), 30);
    }

    double calculateFirstLogArgument(){
        //Separate the first logarithm argument from the log calculation
        //Return 1 + balance/monthlyPayment times calculateRatePower
        return (1 + balance/monthlyPayment * (1 - calculateRatePower()));
    }

    double calculatePaymentLogarithm(){
        //Separate the logarithm calculation from the main function
        //Return the log of calculateFirstLogArgument divided by the log of 1+dailyRate
        return Math.log10(calculateFirstLogArgument()) / Math.log10(1+dailyRate);
    }

    public double calculateMonthsUntilPaidOff(){
        //Return -(1/30) times calculatePaymentLogarithm
        return -(1.0/30.0) * calculatePaymentLogarithm();
    }

}

public class Solution26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt user for balance
        System.out.printf("What is your current balance?%n");
        //Save user input to balance instance variable
        double balance = input.nextDouble();
        //Prompt user for apr percent
        System.out.printf("What is the percent of your card's APR?%n");
        //Save user input to aprPercent instance variable
        double apr = input.nextDouble();
        //Prompt user for monthly payment
        System.out.printf("What is the amount of the monthly payments that you can make?%n");
        //Save user input to monthly payment
        double monthly = input.nextDouble();
        PaymentCalculator creditCard1 = new PaymentCalculator();
        creditCard1.constructPaymentCalc(balance, apr, monthly);
        //Call calculateMonthsUntilPaidOff and save result to numMonths variable
        double months = creditCard1.calculateMonthsUntilPaidOff();
        //Round up value to next month
        months = Math.ceil((months*100)/100);
        //Print out how many months the user has until the card is paid off
        System.out.printf("Your card will take %.0f months to pay off%n", months);
    }
}
