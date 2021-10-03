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
        firstName = first;
        position = job;
        separationDate = separation;
    }

    Person(String first, String job){
        //Initialize values based on arguments
        firstName = first;
        position = job;
        separationDate = "";
    }
}

class Records {

    //Create a list to store versions of hashmaps
    ArrayList<TreeMap<String, Person>> mapList = new ArrayList<>();
    //Create a hashmap to store the data of a given person, using their last name as a key
    TreeMap<String, Person> emp = new TreeMap<>();

    void initializeListMapExampleForty() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person("John", "Manager", "2016-12-31");
        Person p2 = new Person("Tou", "Software Engineer", "2016-10-05");
        Person p3 = new Person("Michaela", "District Manager", "2015-12-19");
        Person p4 = new Person("Jake", "Programmer");
        Person p5 = new Person("Jacquelyn", "DBA");
        Person p6 = new Person("Sally", "Web Developer", "2015-12-18");
        //Add each person into the tree map
        emp.put("Johnson", p1);
        emp.put("Xiong", p2);
        emp.put("Michaelson", p3);
        emp.put("Jacobson", p4);
        emp.put("Jackson", p5);
        emp.put("Webber", p6);
        //Add map to list
        mapList.add(emp);
    }

    void printDataWithKeyword(ArrayList<TreeMap<String, Person>> mapList, String keyword) {
        //For each mapList item
             //Set map list to access its stored map
        for (TreeMap<String, Person> tMap : mapList) {
            //Print head of table
            System.out.printf("Name\t\t\t\t | Position \t\t\t| Separation Date%n");
            System.out.printf("---------------------|----------------------|-----------------------%n");
            //For each entry in the tree map
                    //Tree maps should automatically sort based on key
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                //Get each value
                String last = entry.getKey();
                Person temp = entry.getValue();
                String first = temp.firstName;
                String job = temp.position;
                String separation = temp.separationDate;
                String fullName = first + " " + last;
                //If the first name or last name contains the keyword
                if(first.contains(keyword) || last.contains(keyword)) {
                    //Print out the entry, set in tabular format
                    System.out.printf("%20s | %20s | %s %n", fullName, job, separation);
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
        System.out.printf("Please enter the keyword to search for in the employee names:%n");
        //Save user input into string
        String key = input.nextLine();
        //Call record initialization method
        employees.initializeListMapExampleForty();
        //Call filtered record printing method
        employees.printDataWithKeyword(employees.mapList, key);
    }
}
