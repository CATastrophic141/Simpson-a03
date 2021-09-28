/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 *

/*When you loop, you can control how much you increment the counter; you don’t always have to increment by one.
      When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
       The Karvonen heart rate formula is one method you can use to determine your rate.
        Create a program that prompts for your age and your resting heart rate.
         Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
       Generate a table with the results as shown in the example output. The formula is
      TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR*/

import java.util.Scanner;

package baseline;

class HeartRate {
    int userAge;
    int restingRate;

    void setVariables(int age, int rate){
        //Set userAge to age
        //Set restingRate to rate
    }

    String validateInput(String userIn){
        Scanner input = new Scanner(System.in);
        //In continual loop
        while (true){
            //If user input has in int
            if () {
                //return int input
                return;
            }
            //Else
            else {
                //Next input, print error message

                System.out.printf("%n");
            }
        }
    }

    int calculateBPM(double intensity){
        //Return (((220 − age) − restingHR) × intensity) + restingHR
    }

    void printIntensityBPM(){
        //Print resting pulse
        System.out.printf("%n");
        //Print age
        System.out.printf("%n");
        //Print table labels
        System.out.printf("%n");
        //Print table bar
        System.out.printf("%n");
        //For (95-55)/5 + 2 (10)
        for () {
            //Print intensity int percent format, followed by a bar, and then the BPM rate
                    //Print using BPM calc method
            System.out.printf("%n");
        }
    }
}

public class Solution21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        HeartRate bpm = new HeartRate();
        //Prompt user for age
        System.out.printf("%n");
        //Validate input with validation method
        String userAge = bpm.validateInput(input.nextLine());
        //Save valid input to int variable
        int age;
        //Prompt user for base heart rate
        System.out.printf("%n");
        //Validate input with validation method
        String userBaseRate = bpm.validateInput(input.nextLine());
        //Save valid input to int variable
        int baseRate;
        //Call variable setting method for class instance
        bpm.setVariables();
        //Call bpm table printing method;
        bpm.printIntensityBPM();
    }
}
