/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Scanner;
import java.util.Random;

class NumberGuessGame {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int setupNumberGuessGame() {
        //Print game greeting
        System.out.printf("Welcome to the number guessing game!%n");
        //Prompt user for difficulty number
        System.out.printf("Please input a game difficulty:%n(1 for easy, 2 for medium, 3 for difficult)%n");
        //While input does not match 1-3
        int difficulty = input.nextInt();
        //While loop to capture bad input
        while(difficulty < 1 || difficulty > 3) {
            //Print invalid input and then re-prompt
            System.out.printf("Invalid input. Please enter 1, 2, or 3%n");
            difficulty = input.nextInt();
        }
        //Return user input
        return difficulty;
    }

    int generateNumberGuessGameAnswer(int difficulty) {
        int randAnswer = 0;
        //If difficulty is 1
        if (difficulty == 1) {
            //Generate random number between 1 and 10
            randAnswer = rand.nextInt(11);
        }
        //If difficulty is 2
        else if (difficulty == 2) {
            //Generate random number between 1 and 100
            randAnswer = rand.nextInt(101);
        }
        //If difficulty is 3
        else if (difficulty == 3) {
            //Generate random number between 1 and 1000
            randAnswer = rand.nextInt(1001);
        }
        //Return randomly generated answer
        return randAnswer;
    }

    void checkGuess(int guess, int answer) {
        //If user guess is correct
        if (guess == answer) {
            //Print guess is correct
            System.out.printf("%n");
        }
        //If user guess is too low
        else if (guess < answer) {
            //Print hint
            System.out.printf("Your guess is too low%n");
        }
        //If user guess is too high
        else {
            //Print hint
            System.out.printf("Your guess is too high%n");
        }
    }

    char checkForReplay() {
        //Buffer input
        input.nextLine();
        //Prompt user if they would like to replay
        System.out.printf("Would you like to play again? enter Y to continue or N to stop%n");
        String contGame = input.nextLine();
        //While loop to capture bad input
        while (true) {
            //If user enters valid input
            if ("Y".equalsIgnoreCase(contGame) || "N".equalsIgnoreCase(contGame)) {
                //Update game state
                return contGame.charAt(0);
            }
            //Else
            else {
                //Re-prompt in loop
                System.out.printf("Not a valid input%nWould you like to play again? enter Y to continue or N to stop%n");
                contGame = input.nextLine();
            }
        }
    }

}

public class Solution32 {
    public static void main(String[] args) {

        //Initialize variables
        char gameState = 'Y';
        int answer;
        int difficulty;
        int counter;

        NumberGuessGame game = new NumberGuessGame();
        Scanner input = new Scanner (System.in);

        //While user would like to play the game ('y' or 'Y')
        while (Character.toUpperCase(gameState) == 'Y') {
            //Initialize counter to zero for each game played
            counter = 0;
            //Initialize number guess game
            difficulty = game.setupNumberGuessGame();
            //Generate random answer given difficulty choice
            answer = game.generateNumberGuessGameAnswer(difficulty);
            int guess = -1;
            //While user guess is incorrect
            while (guess != answer) {
                //Prompt user for guess
                System.out.printf("Please input your guess%n");
                while (true){
                    //If user input has in int
                    if (input.hasNextInt()) {
                        //Save int input
                        guess = input.nextInt();
                        break;
                    }
                    //Else
                    else {
                        //Next input, print error message
                        input.next();
                        System.out.printf("Please input a number%n");
                        counter = counter + 1;
                    }
                }
                //Call guess checking method
                game.checkGuess(guess, answer);
                //Increment counter
                counter = counter + 1;
            }
            //Print user wins and counter count
            System.out.printf("Congratulations! you guessed the number. You did so in %d guesses%n", counter);
            gameState = game.checkForReplay();
        }
        //Print thank you to user and good-bye
        System.out.print("Thank you for playing! Good-bye");
    }
}
