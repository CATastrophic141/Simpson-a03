/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;

class NumberAddition {
    double[] gatherNumbers(int numNumbers){
        Scanner input = new Scanner(System.in);
        //Create a double array for a specific size
        double[] numArray = new double[numNumbers];
        //For the number of intended numbers
        for (int i = 0; i<numNumbers; i++) {
            //Prompt the user for a number
            System.out.printf("Please enter a number%n");
            //Save input to an element in the array
            numArray[i] = input.nextDouble();
        }
        //Return the array of entered values
       return numArray;
    }

    double addNumbers(double[] numArray){
        double total = 0;
        //For the length of the array add each
        for (double v : numArray) {
            total = total + v;
        }
        //Return total
        return total;
    }
}

public class Solution28 {
    public static void main(String[] args){
        NumberAddition sum = new NumberAddition();
        //Define number of numbers to add
        int numNumbers = 5;
        //Create array to store the numbers
        double[] numbers;
        //Call gatherNumbers to develop number array
        numbers = sum.gatherNumbers(numNumbers);
        //Call addNumbers and save the result to total
        double total = sum.addNumbers(numbers);
        //Print total
        System.out.printf("The sum of the numbers is %.3f", total);
    }
}
