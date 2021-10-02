/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Lottery {

    //Generate arraylist to store the names of the candidates
    ArrayList<String> names = new ArrayList<>();

    Random rand = new Random();

    void makeListOfWinners() {
        Scanner input = new Scanner(System.in);
        //Do while loop
        String entry;
        do {
            //Prompt user for candidate
            System.out.printf("Enter winner candidate:%n");
            //Save user entry
            entry = input.nextLine();
            //Add entry to arraylist
            names.add(entry);
            //End scanning if blank entry is entered
        } while(!entry.isBlank());
    }

    int generateWinnerIndex(ArrayList<String> nameList) {
        //Generate random number between 0 and arraylist size-1
        return rand.nextInt(nameList.size());
    }

    String generateWinnerString(ArrayList<String> nameList, int index) {
        //Print element of arraylist at randomly chosen index
        return nameList.get(index);
    }
}

public class Solution35 {
    public static void main(String[] args) {
        Lottery raffle = new Lottery();
        //Print functionality of the program
        System.out.printf("Please enter the candidates for the prize%n");
        //Call arraylist initialization method
        raffle.makeListOfWinners();
        //Call random number generation
        int winnerIndex = raffle.generateWinnerIndex(raffle.names);
        //Call winner string method
        String winner = raffle.generateWinnerString(raffle.names, winnerIndex);
        //print winner
        System.out.printf("The winner is %s!", winner);
    }
}