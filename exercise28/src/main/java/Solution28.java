/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*In previous programs, you asked the user for repeated input by writing the input statements multiple times.
But it’s more efficient to use loops to deal with repeated input.
Write a program that prompts the user for five numbers and computes the total of the numbers.*/

import java.util.Scanner;

class NumberAddition {
    double[] gatherNumbers(int numNumbers){
        Scanner input = new Scanner(System.in);
        //Create a double array for a specific size
        double[] numArray = new double[numNumbers];
        //For the number of intended numbers
        for (int i = 0; i<numNumbers; i++) {
            //Prompt the user for a number
            System.out.printf("%n");
            //Save input to an element in the array

        }
        //Return the array of entered values
       return numArray;
    }

    double addNumbers(double[] numArray){
        double total = 0;
        //Calculate length of passed array
        int length;
        //For the length of the array add each
        for (int i = 0; i<length; i++){
            //Add ith element to total
        }
        //Return total
        return total;
    }
}

public class Solution28 {
    public static void main(String[] args){
        NumberAddition sum = new NumberAddition();
        //Create array to store the numbers
        double[] numbers = new double[5];
        //Call gatherNumbers to develop number array

        //Call addNumbers and save the result to total
        double total;
        //Print total
        System.out.printf("The sum of the numbers is %.3f", total);
    }
}
