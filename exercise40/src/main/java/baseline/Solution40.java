/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Create a class for data storage
class Person {
    //Create data variables
    String firstName;
    String position;
    String separationDate;

    //Create constructors
    Person(String first, String job, String separation){
        //Initialize values using arguments

    }

    Person(String first, String job){
        //Initialize values based on arguments

    }
}

class Records {

    String searchInput;

    //Create a list to store versions of hashmaps
    ArrayList<TreeMap<String, Person>> mapList = new ArrayList<>();
    //Create a hashmap to store the data of a given person, using their last name as a key
    TreeMap<String, Person> emp = new TreeMap<>();

    void initializeListMapExampleFourty() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        Person p6 = new Person();
        //Add each person into the hashmap
        emp.put();
        emp.put();
        emp.put();
        emp.put(;
        emp.put();
        emp.put();
        //Add map to list
        mapList.add(emp);
    }

    void setSearchInput(String keyword) {
        //Set the search input variable to the passed string
        searchInput;
    }

    void printDataWithKeyword(ArrayList<TreeMap<String, Person>> mapList, String keyword) {
        //For each mapList item
        //Set map list to access its stored map
        for () {
            //Print head of table
            System.out.printf("%n");
            System.out.printf("%n");
            //For each entry in the tree map
                    //Tree maps should automatically sort based on key
            for () {
                //Get each value
                String last;
                Person temp;
                String first;
                String job;
                String separation;
                String fullName;
                //If the first name or last name contains the keyword
                if() {
                    //Print out the entry, set in tabular format
                    System.out.printf("%n");
                }
            }
        }
    }

}

public class Solution40 {
    public static void main(String[] args){
        Records employees = new Records();
        Scanner input = new Scanner(System.in);
        //Prompt user for the keyword they would like to search for
        System.out.printf("%n");
        //Save user input into string
        String key;
        //Call record initialization method
        employees.initializeListMapExampleFourty();
        //Call filtered record printing method
        employees.printDataWithKeyword();
    }
}
