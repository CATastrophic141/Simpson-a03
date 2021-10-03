package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {

    Records test = new Records();

    @BeforeEach
    void initializeListMapExampleForty() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person("John", "Manager", "2016-12-31");
        Person p2 = new Person("Tou", "Software Engineer", "2016-10-05");
        Person p3 = new Person("Michaela", "District Manager", "2015-12-19");
        Person p4 = new Person("Jake", "Programmer");
        Person p5 = new Person("Jacquelyn", "DBA");
        Person p6 = new Person("Sally", "Web Developer", "2015-12-18");
        //Add each person into the tree map
        test.emp.put("Johnson", p1);
        test.emp.put("Xiong", p2);
        test.emp.put("Michaelson", p3);
        test.emp.put("Jacobson", p4);
        test.emp.put("Jackson", p5);
        test.emp.put("Webber", p6);
        //Add map to list
        test.mapList.add(test.emp);
    }

    @Test
    void checkIfLastNameContainsTestTrue() {
        //This method tests the printing method's functional abilities to check if a name and details should be printed
        String str = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                str = entry.getKey();
            }
        }
        //If the string is successfully accessed and the keyword is found the condition should return true
        boolean condition = str.contains("Xio");
        assertTrue(condition);
    }

    @Test
    void checkIfLastNameContainsTestFalse() {
        //This method tests the printing method's functional abilities to check if a name and details should be printed
        String str = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                str = entry.getKey();
            }
        }
        //If the string is successfully accessed and the keyword is not found the condition should return false
        boolean condition = str.contains("Jam");
        assertFalse(condition);
    }

    @Test
    void checkIfFirstNameContainsTestTrue() {
        //This method tests the printing method's functional abilities to check if a name and details should be printed
        String str = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                Person temp = entry.getValue();
                str = temp.firstName;
            }
        }
        //If the string is successfully accessed and the keyword is found the condition should return true
        boolean condition = str.contains("T");
        assertTrue(condition);
    }


    @Test
    void checkIfFirstNameContainsTestFalse() {
        //This method tests the printing method's functional abilities to check if a name and details should be printed
        String str = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                Person temp = entry.getValue();
                str = temp.firstName;
            }
        }
        //If the string is successfully accessed and the keyword is not found the condition should return false
        boolean condition = str.contains("R");
        assertFalse(condition);
    }
}