/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

class MathTable {
    //Direct printing to console cannot be reliably tested,
    // so using a string formatter with the aid of the append functionality
    // is required to generate a single string which is to be tested against another
    String generateMultTableString(){
        //Initialize table to concatenate strings to
        StringBuilder table = new StringBuilder();
        //For 12 repetitions (i; Row)
        for (int i = 1; i<=12; i++) {
            //For 12 Repetitions (j; Column)
            for (int j = 1; j<=12; j++) {
                //Print i*j, with space modifier of 5
                table.append(String.format("%5d", i*j));
                //End iteration
            }
            //Print new line
            table.append(String.format("%n"));
            //End iteration
        }
        //End loop
        return table.toString();
    }
}

public class Solution30 {
    public static void main(String[] args){
        MathTable table = new MathTable();
        //Call multiplication table method and save output to string variable
        String multTable = table.generateMultTableString();
        //Print string variable
        System.out.printf("%s", multTable);
    }
}
