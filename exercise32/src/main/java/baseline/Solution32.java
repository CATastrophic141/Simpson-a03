/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*Write a Guess the Number game that has three levels of difficulty.
 The first level of difficulty would be a number between 1 and 10.
  The second difficulty set would be between 1 and 100.
   The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game.
 The computer picks a random number in that range and prompts the player to guess that number.
  Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low.
   The computer should also keep track of the number of guesses.
    Once the player guesses the correct number,
     the computer should present the number of guesses and ask if the player would like to play again.*/

package baseline;

import java.util.Scanner;

class NumberGuessGame {

    int setupNumberGuessGame() {
        Scanner input = new Scanner(System.in);
        //Print game greeting
        System.out.printf("%n");
        //Prompt user for difficulty number
        System.out.printf("%n");
        //While input does not match 1-3
        while() {
            //Print invalid input and then re-prompt
            System.out.printf("%n");
        }
        //Return user input
        return;
    }

    int generateNumberGuessGameAnswer(int difficulty) {
        //If difficulty is 1
        if () {
            //Generate random number between 1 and 10
            int randAnswer;
        }
        //If difficulty is 2
        else if () {
            //Generate random number between 1 and 100
            int randAnswer;
        }
        //If difficulty is 3
        else if () {
            //Generate random number between 1 and 1000
            int randAnswer;
        }
        //Return randomly generated answer
        return;
    }

    String updateUserGuess (String userGuess) {
        //Prompt user for number guess
        System.out.printf("%n");
        //Return user input
        return;
    }

}

public class Solution32 {
    public static void main(String[] args) {

        /*Note to self: Consider moving groups of loops into their own functions if return types permit*/

        NumberGuessGame game = new NumberGuessGame();
        Scanner input = new Scanner (System.in);
        char gameState;
        int answer;
        int difficulty;
        int counter = 0;
        //While user would like to play the game ("y")
        while () {
            //Initialize number guess game
            difficulty = game.setupNumberGuessGame();
            //Generate random answer given difficulty choice
            answer = game.generateNumberGuessGameAnswer(difficulty);
            //While user guess is incorrect
            while () {
                //Parse user input to integer
                while (){
                    //If user input has in int
                    if (input.hasNextInt()) {
                        //Save int input

                    }
                    //Else
                    else {
                        //Next input, print error message
                        input.next();
                        System.out.printf("Please input a number%nPlease enter your %s%n");

                    }
                }
                //If user guess correct
                if () {
                    //Print guess is correct
                    System.out.printf("%n");
                    //Exit loop
                    break;
                }
                //If user guess is too low
                if () {
                    //Print hint
                    System.out.printf("%n");
                    //Call guess update method
                }
                //If user guess is too high
                if () {
                    //Print hint
                    System.out.printf("%n");
                    //Call guess update method
                }
                //If entry is not a number
                if () {
                    //Print warning
                    System.out.printf("%n");
                    //Call guess update method
                }
                //Increment counter
                counter;
            }
            //Print user wins and counter count
            System.out.printf("%n");
            //While loop to capture bad input
            while () {
                //Prompt user if they would like to play again
                System.out.printf("%n");
                //If user entry is a Y or N (Caps and lower caps)
                if () {
                    //Update game state
                }
                //Else
                else {
                    //Re-prompt in loop
                }
            }
        }
        //Print thank you to user and good-bye
    }
}
