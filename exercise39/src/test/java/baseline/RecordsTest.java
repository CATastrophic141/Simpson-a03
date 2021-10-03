package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class RecordsTest {

    Records test = new Records();

    @BeforeEach
    void initializeMapExampleThirtyNine() {
        //Initialize each entry of the hashmap for each person
        Person p1 = new Person("John", "Manager", "2016-12-31");
        Person p2 = new Person("Tou", "Software Engineer", "2016-10-05");
        Person p3 = new Person("Michaela", "District Manager", "2015-12-19");
        Person p4 = new Person("Jake", "Programmer");
        Person p5 = new Person("Jacquelyn", "DBA");
        Person p6 = new Person("Sally", "Web Developer", "2015-12-18");
        //Add each person into the hashmap
        test.emp.put("Johnson", p1);
        test.emp.put("Xiong", p2);
        test.emp.put("Michaelson", p3);
        test.emp.put("Jacobson", p4);
        test.emp.put("Jackson", p5);
        test.emp.put("Webber", p6);
        test.mapList.add(test.emp);
    }

    @Test
    void accessLastNameKeyTest() {
        //This method tests the printing method's functional abilities to retrieve the key from the sorted tree map
        String actual = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                actual = entry.getKey();
            }
        }
        //actual string should be final retrieved key
        assertEquals("Xiong", actual);
    }

    @Test
    void accessFirstNameTest() {
        //This method tests the printing method's functional abilities to get the first name from the sorted tree map
        String actual = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                Person temp = entry.getValue();
                actual = temp.firstName;
            }
        }
        //actual string should be final retrieved first name
        assertEquals("Tou", actual);
    }

    @Test
    void accessPositionTest() {
        //This method tests the printing method's functional abilities to get the position from the sorted tree map
        String actual = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                Person temp = entry.getValue();
                actual = temp.position;
            }
        }
        //actual string should be final retrieved position
        assertEquals("Software Engineer", actual);
    }

    @Test
    void accessSeparationDateTest() {
        //This method tests the printing method's functional abilities to get the Separation date from the sorted tree map
        String actual = "";
        for (TreeMap<String, Person> tMap : test.mapList) {
            for (Map.Entry<String, Person> entry : tMap.entrySet()) {
                Person temp = entry.getValue();
                actual = temp.separationDate;
            }
        }
        //actual string should be final retrieved separation date
        assertEquals("2016-10-05", actual);
    }

}