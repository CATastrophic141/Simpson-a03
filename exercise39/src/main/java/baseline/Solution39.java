/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Map;
import java.util.TreeMap;

//Create a class for data storage
class Person {
    //Create data variables
    String firstName;
    String position;
    String separationDate;

    //Create constructors
    void Person(String first, String job, String separation){
        //Initialize values using arguments
    }

    void Person(String first, String job){
        //Initialize values based on arguments
    }
}

class Records {

    //Create a hashmap to store the data of a given person, using their last name as a key
    TreeMap<String, Person> emp = new TreeMap<String, Person>();

    void initializeMapExample39() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person();
        p1.Person();
        Person p2 = new Person();
        p2.Person();
        Person p3 = new Person();
        p3.Person();
        Person p4 = new Person();
        p4.Person();
        Person p5 = new Person();
        p5.Person();
        Person p6 = new Person();
        p6.Person();
        //Add each person into the hashmap
        emp.put();
        emp.put();
        emp.put();
        emp.put();
        emp.put();
        emp.put();
    }

    void printData(TreeMap<String, Person>) {
        //Print head of table
        System.out.printf("%n");
        //For each entry in the tree map
                //Tree maps should automatically sort based on key
        for (Map.Entry<String,Person> entry : emp.entrySet()){
            //Get each value
            String last = entry.getKey();
            Person temp = entry.getValue();
            String first;
            String job;
            String separation;
            //Print out each entry, set in tabular format
            System.out.printf("%n");
        }
    }

}

public class Solution39 {
    public static void main(String[] args) {
        Records employees = new Records();
        //Call record initialization method
        //Call record printing method
    }
}
