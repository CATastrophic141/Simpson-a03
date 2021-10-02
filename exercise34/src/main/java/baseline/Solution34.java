/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

package baseline;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Employee {
    String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones",
                            "Amanda Cullen", "Jeremy Goodwin", "Cheese Burger"};

    void printEmployees(String[] employees){
        //For the size of the array
        for (String employee : employees) {
            //Print the employee's name at the given index
            System.out.printf("%s%n", employee);
        }
    }

    String[] setIndexToEmpty(String[] employees, int index){
        //Set the string at a selected index to ""
        employees[index] = "";
        return employees;
    }

    String[] createNewArraySize(String[] employees) {
        int counter = 0;
        //for the length of the passed array
        for (String employee : employees) {
            //if the element at the set index is not blank, increment counter
            if (!Objects.equals(employee, "")) counter++;
        }
        //Create new array of the given size (From counter)
        String[] newSizeArray = new String[counter];
        //Set each element of newSizeArray to ""
        Arrays.fill(newSizeArray, "");
        //Return new array
        return newSizeArray;
    }

    String[] copyNamesIntoNewArray(String[] employees, String[] newSizeArray){
        int i = 0;
        for(String employee : employees) {
            employee = employee.trim();
            if(!employee.isEmpty()) {
                newSizeArray[i] = employee;
                i++;
            }
        }
        return newSizeArray;
    }


    int findIndexToRemove(String[] employees, String name){
        //For size of the passed array
        for(int i = 0; i<employees.length ; i++) {
            //If the name is found return the index of which it was found
            if (Objects.equals(employees[i], name)) {
                return i;
            }
        }
        return -1;
    }

}


public class Solution34 {
    public static void main(String[] args){
        Employee emp = new Employee();
        Scanner input = new Scanner(System.in);
        //Call array printing method
        emp.printEmployees(emp.employees);
        //Prompt user for what name they would like to remove
        System.out.printf("What employee would you like to remove?%n");
        //Save user input to string variable
        String removedEmployee = input.nextLine();
        //Buffer output
        System.out.printf("%n");
        //Call index finding method, pass user input
        int index = emp.findIndexToRemove(emp.employees, removedEmployee);
        //If index was modified
        if (index != -1) {
            //Call method that sets chosen element to empty
            String[] modifiedEmployees = emp.setIndexToEmpty(emp.employees, index);
            //Call new array creation method
            String[] newArray = emp.createNewArraySize(modifiedEmployees);
            //Call array copying method
            newArray = emp.copyNamesIntoNewArray(modifiedEmployees, newArray);
            //Call array printing method
            emp.printEmployees(newArray);
        }
        //Else if index was not set
        else {
            //Print that the employee was not found
            System.out.printf("Employee was not found%n");
        }
    }
}
