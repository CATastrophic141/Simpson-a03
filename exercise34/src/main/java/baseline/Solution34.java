/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Rylan Simpson
 */

/*Sometimes you have to locate and remove an entry from a list based on some criteria.
 You may have a deck of cards and need to discard one so it’s no longer in play,
  or you may need to remove values from a list of valid inputs once they’ve been used.
   Storing the values in an array makes this process easier. Depending on your language,
    you may find it safer and more efficient to create a new array instead of modifying the existing one.

        Create a small program that contains a list of employee names.
         Print out the list of names when the program runs the first time.
          Prompt for an employee name and remove that specific name from the list of names.
           Display the remaining employees, each on its own line.*/

package baseline;

class Employee {
    String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones",
                            "Amanda Cullen", "Jeremy Goodwin", "Cheese Burger"};

    void printEmployees(String[] employees){
        //For the size of the array
        for (){
            //Print the employee's name at the given index
            System.out.printf("%n");
        }
    }

    String[] setIndexToEmpty(String[] employees, int index){
        //Set the string at a selected index to ""
        return;
    }

    String[] createNewArraySize(String[] employees) {
        //for the length of the passed array
        for() {
            //if the element at the set index is not blank, increment counter
        }
        //Create new array of the given size (From counter)
        //Return new array
        return;
    }

    String copyNamesIntoNewArray(String[] employees, String[] newArray){
        //For the length of the passed array
        for() {
                //If the passed array element is blank, skip iteration
                if () ;
                //Copy the element of the passed array into next available element in new array
            }
            //Return newArray
        return;
    }

    int findIndexToRemove(String[] employees, String name){
        //For size of the passed array
        for() {
            //If the name is found return the index of which it was found
            if () {

            }
        }
    }

}


public class Solution34 {
    public static void main(String[] args){
        Employee emp = new Employee();
        //Call array printing method
        emp.printEmployees();
        //Prompt user for what name they would like to remove
        System.out.printf("%n");
        //Save user input to string variable
        String removedEmployee;
        //Call index finding method, pass user input
        int index = emp.findIndexToRemove();
        //Call new array creation method
        String[] newArray = emp.createNewArraySize();
        //Call array copying method
        emp.copyNamesIntoNewArray();
        //Call array printing method
    }
}
