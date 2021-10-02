/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

class Statistics{

    ArrayList<Integer> numbers = new ArrayList<>();

    ArrayList<Integer> getNumbers() {
        Scanner input = new Scanner(System.in);
        //Until user enters "done"
        while() {
            //If user enters a number
            if() {
                //Enter number into the numbers arraylist
            }
            //Else if user enters "done" or "Done"
            else if () {
                //return the arraylist
            }
            //Else if bad input is entered
            else {
                //Next input, print error message
                System.out.printf("%n");
            }
        }
    }

    String printNumbers(ArrayList<Integer> numbers){
        //Print out the array list using for loop
        for (){
            System.out.printf("%n");
        }
    }

    double average(ArrayList<Integer> numbers){
        double total;
        //For each element in the array list, add number to a total
        for () {

        }
        //Divide by the total by the size of the arraylist
    }

    double min(ArrayList<Integer> numbers){
        //For the size of the array
        double min;
        for (){
            //If array element is less than current min, update current min to the element (First min is first element)
        }
    }

    double max(ArrayList<Integer> numbers){
        //For the size of the array
        double max;
        for (){
            //If array element is less than current max, update current max to the element (First max is first element)
        }
    }

    double std(ArrayList<Integer> numbers) {
        //Call average method and save to variable
        double avg = average();
        double total;
        //For the size of the array
        for (){
            //Add element value minus mean, squared to a total
        }
        //Divide total by the size of the arraylist
        //return square root of the last value
        return;
    }

}

public class Solution36 {
    public static void main(String[] args){
        Statistics stats = new Statistics();
        //Call input gathering method
        stats.getNumbers();
        //Call number printing method
        stats.printNumbers();
        //Call average method
        double avg = stats.average();
        //Print method
        System.out.printf("%n");
        //Call minimum method
        double min = stats.min();
        //Print minimum
        System.out.printf("%n");
        //Call maximum method
        double max = stats.max();
        //Print maximum
        System.out.printf("%n");
        //Call standard deviation method
        double std = stats.std();
        //Print std
        System.out.printf("%n");
    }
}
