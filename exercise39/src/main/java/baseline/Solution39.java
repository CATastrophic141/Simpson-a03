/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.ArrayList;
import java.util.Map;
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

    /*Using a map that can store a set of employees can allow for simple access of all necessary data at once.
    * Further, implementing this map set into a list can allow for further addition of records/groups of employees.*/
        //Create a list to store versions of hashmaps
    ArrayList<TreeMap<String, Person>> mapList = new ArrayList<>();
        //Create a hashmap to store the data of a given person, using their last name as a key
    TreeMap<String, Person> emp = new TreeMap<>();

    void initializeListMapExampleThirtyNine() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person("John", "Manager", "2016-12-31");
        Person p2 = new Person("Tou", "Software Engineer", "2016-10-05");
        Person p3 = new Person("Michaela", "District Manager", "2015-12-19");
        Person p4 = new Person("Jake", "Programmer");
        Person p5 = new Person("Jacquelyn", "DBA");
        Person p6 = new Person("Sally", "Web Developer", "2015-12-18");
        //Add each person into the treemap
                //The last name will be used as the key as tree maps automatically sort by key
        emp.put("Johnson", p1);
        emp.put("Xiong", p2);
        emp.put("Michaelson", p3);
        emp.put("Jacobson", p4);
        emp.put("Jackson", p5);
        emp.put("Webber", p6);
        //Add map to list
        mapList.add(emp);
    }

    void printData(ArrayList<TreeMap<String, Person>> mapList) {
        //For each mapList item
                //Set map list to access its stored map
        for (TreeMap<String, Person> tMap : mapList) {
            //Print head of table
            System.out.printf("Name\t\t\t\t | Position \t\t\t| Separation Date%n");
            System.out.printf("---------------------|----------------------|-----------------------%n");
            //For each entry in the tree map
                    //Set the map entry to access its items
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                //Get each value
                String last = entry.getKey();
                Person temp = entry.getValue();
                String first = temp.firstName;
                String job = temp.position;
                String separation = temp.separationDate;
                String fullName = first + " " + last;
                //Print out each entry, set in tabular format
                System.out.printf("%20s | %20s | %s %n", fullName, job, separation);
            }
        }
    }

}

public class Solution39 {
    public static void main(String[] args) {
        Records employees = new Records();
        //Call record initialization method
        employees.initializeListMapExampleThirtyNine();
        //Call record printing method
        employees.printData(employees.mapList);
    }
}
