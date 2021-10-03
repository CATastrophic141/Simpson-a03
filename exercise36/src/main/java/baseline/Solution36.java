/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

class Statistics{

    ArrayList<Double> numbers = new ArrayList<>();

    void getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter your numbers%n");
        //Until user enters "done"
        String entry;
        do {
            System.out.print("Enter a number: ");
            entry = input.nextLine();
            //Check if entry is a number
            try {
                double number = Double.parseDouble(entry);
                numbers.add(number);
            }
            catch (NumberFormatException e) {
                if(entry.equals("done") || entry.equals("Done")){
                    return;
                }
                else {
                    System.out.printf("Please enter a valid number or enter \"done\" to exit%n");
                }
            }
        } while (!entry.equals("done"));
    }

    void printNumbers(ArrayList<Double> numbers){
        System.out.print("Numbers: ");
        //Print out the array list using for loop
        for (Double number : numbers) {
            System.out.printf("%.2f ", number);
        }
        System.out.printf("%n");
    }

    double average(ArrayList<Double> numbers){
        double total = 0;
        //For each element in the array list, add number to a total
        for (Double number : numbers) {
            total = total + number;
        }
        //Divide by the total by the size of the arraylist
        return total / numbers.size();
    }

    double min(ArrayList<Double> numbers){
        double min = numbers.get(0);
        //For the size of the array
        for (Double number : numbers){
            //If array element is less than current min, update current min to the element (First min is first element)
            if (number < min){
                min = number;
            }
        }
        //Return min
        return min;
    }

    double max(ArrayList<Double> numbers){
        double max = numbers.get(0);
        //For the size of the array
        for (Double number : numbers){
            //If array element is less than current max, update current max to the element (First max is first element)
            if (number > max){
                max = number;
            }
        }
        //Return max
        return max;
    }

    double std(ArrayList<Double> numbers) {
        //Call average method and save to variable
        double avg = average(numbers);
        double total = 0;
        //For the size of the array
        for (Double number : numbers){
            //Add element value minus mean, squared, to a total
            total = total + (number - avg)*(number - avg);
        }
        //Divide total by the size of the arraylist
        double temp = total / numbers.size();
        //return square root of the last value
        return sqrt(temp);
    }

}

public class Solution36 {
    public static void main(String[] args){
        Statistics stats = new Statistics();
        //Call input gathering method
        stats.getNumbers();
        //Call number printing method
        stats.printNumbers(stats.numbers);
        //Call average method
        double avg = stats.average(stats.numbers);
        //Print method
        System.out.printf("Average: %.2f%n", avg);
        //Call minimum method
        double min = stats.min(stats.numbers);
        //Print minimum
        System.out.printf("Minimum: %.2f%n", min);
        //Call maximum method
        double max = stats.max(stats.numbers);
        //Print maximum
        System.out.printf("Maximum: %.2f%n", max);
        //Call standard deviation method
        double std = stats.std(stats.numbers);
        //Print std
        System.out.printf("Standard Deviation: %.2f%n", std);
    }
}
