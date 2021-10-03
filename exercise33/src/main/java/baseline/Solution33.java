/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

class EightBall {

    Random rand = new Random();

    //Create string array of possible responses
    String[] responses = {"Yes", "No", "Maybe", "Ask again later"};

    void promptQuestion() {
        Scanner input = new Scanner(System.in);
        //Prompt user for question
        System.out.printf("Please enter your question%n");
        //Let user input. Scanning not required
        input.nextLine();
    }

    int generateRandNum() {
        //Return random number between 0 and 4000
            //Use 4000 and upper bound and then add 1 to get a rand num between 1 and 4000
        return rand.nextInt(4000)+1;
    }

    String selectResponse(int randNum){
            //If random number is between 1 and 1000
            if (randNum >= 1 && randNum <= 1000){
                //Return "Yes" / Array string 0
                return responses[0];
            }
            //If random number is between 1001 and 2000
            else if (randNum >=1001 && randNum <= 2000){
                //Return "No" / Array string 1
                return responses[1];
            }
            //If random number is between 2001 and 3000
            else if (randNum >=2001 && randNum <= 3000) {
                //Return "Maybe" / Array string 2
                return responses[2];
            }
            //If random number is between 3001 and 4000
            else {
            //Return "Ask again later" / Array string 3
                return responses[3];
            }
        }
    }


public class Solution33 {
    public static void main (String[] args) {
        EightBall ball = new EightBall();
        //Prompt user question
        ball.promptQuestion();
        //Generate random number
        int randNum = ball.generateRandNum();
        //Generate response using random number
        String response = ball.selectResponse(randNum);
        //Print out response
        System.out.printf("%s%n", response);
    }
}
