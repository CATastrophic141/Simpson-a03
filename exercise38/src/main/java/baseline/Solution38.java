/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;

class ArrayFilter {

    int[] generateIntArrayFromStringArray(String[] numString) {
        //Take in a string array of integers that has been set up to be separated by " " (numbers.split(" ") in the main method)
        //Create an integer array for the size of the string array of numbers
        int[] intArray = new int[numString.length];
        //For the length of the string array
        for (int i = 0; i<numString.length; i++){
            //Parse the number in the string array into an int, saved into the in array
            intArray[i] = Integer.parseInt(numString[i]);
        }
        //Return int array
        return intArray;
    }

    int checkNumberOfEvens(int[] intArray) {
        //Create variable to track number of even numbers
        int numEven = 0;
        //for every number in the int array
        for (int j : intArray) {
            //If the number is divisible by 2
            if (j % 2 == 0) {
                //Increment even number counter
                numEven++;
            }
        }
        //Return even number counter
        return numEven;
    }

    int[] filterEvenNumbers(int[] intArray) {
        //Save number of even numbers using even number checking method
        int numberEvens = checkNumberOfEvens(intArray);
        //Create new int array to save even values
        int[] evenValues = new int[numberEvens];
        //for the size of the int array
        //Initialize variable for even array index
        int j = 0;
        for (int k : intArray) {
            //If the value in the int array is divisible by 2
            if (k % 2 == 0) {
                //Save value into next available element in the even value array
                evenValues[j] = k;
                //Increment value of even array index
                j++;
            }
        }
        //return even value array
        return evenValues;
    }

    void printArray(int[] intArray, String numType){
        //Print the type of numbers shown
        System.out.printf("The %s numbers are: ", numType);
        //for the length of the int array
        for (int j : intArray) {
            //Print the value at the given index
            System.out.printf("%d ", j);
        }
    }
}

public class Solution38 {
    public static void main(String[] args){
        ArrayFilter filter = new ArrayFilter();
        Scanner input = new Scanner(System.in);
        //Save string for what type of number is to be filtered for
        String type = "even";
        //Prompt user for numbers, separated by spaces
        System.out.printf("Please enter your integers, separated by spaces:%n");
        //Save input to string array
        String numbers = input.nextLine();
        //Created a string array with each number string separated by " "
        String[] listOfNums = numbers.split(" ");
        //Call int array generation method
        int[] numberArray = filter.generateIntArrayFromStringArray(listOfNums);
        //Call even value filter
        int[] evenNums = filter.filterEvenNumbers(numberArray);
        //Call array printing method
        filter.printArray(evenNums, type);
    }
}
