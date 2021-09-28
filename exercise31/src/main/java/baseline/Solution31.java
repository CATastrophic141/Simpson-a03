/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;

class HeartRate {
    int userAge;
    int restingRate;

    void setVariables(int age, int rate){
        //Set userAge to age
        userAge = age;
        //Set restingRate to rate
        restingRate = rate;
    }

    int validateInput(String prompt){
        Scanner input = new Scanner(System.in);
        //Prompt uer for given value
        System.out.printf("Please enter your %s%n", prompt);
        //In continual loop
        while (true){
            //If user input has in int
            if (input.hasNextInt()) {
                //return int input
                return input.nextInt();
            }
            //Else
            else {
                //Next input, print error message
                input.next();
                System.out.printf("Please input a number%nPlease enter your %s%n", prompt);

            }
        }
    }

    double calculateBPM(double intensity){
        //Return (((220 − age) − restingHR) × intensity) + restingHR
        return (((220-userAge)-restingRate)*intensity)+restingRate;
    }

    void printIntensityBPM(){
        //Print resting pulse
        System.out.printf("Resting pulse rate: %d BPM%n", restingRate);
        //Print age
        System.out.printf("Age: %d%n", userAge);
        //Print table labels
        System.out.printf("Intensity\t\t| Rate%n");
        //Print table bar
        System.out.printf("--------------------------%n");
        //For (95-55)/5 + 2 (10)
        for (int i = 55; i<=95 ; i=i+5) {
            //Print intensity int percent format, followed by a bar, and then the BPM rate
                    //Print using BPM calc method
            System.out.printf("%d%%\t\t\t\t| %3.0f BPM%n", i, calculateBPM(i/100.0));
        }
    }
}

public class Solution31 {
    public static void main(String[] args){
        HeartRate bpm = new HeartRate();
        //Validate input with validation method, save to variable
        int userAge = bpm.validateInput("age");
        //Validate input with validation method, save to variable
        int userBaseRate = bpm.validateInput("resting heart rate");
        //Call variable setting method for class instance
        bpm.setVariables(userAge, userBaseRate);
        //Call method that prints bpm table
        bpm.printIntensityBPM();
    }
}
