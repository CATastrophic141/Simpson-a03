package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void findIndexToRemove() {
        Employee emp = new Employee();
        int actual = emp.findIndexToRemove(emp.employees, "Cheese Burger");
        assertEquals(5, actual);
    }

    @Test
    void setIndexToEmpty() {
        Employee emp = new Employee();
        String[] actual = emp.setIndexToEmpty(emp.employees, 5);
        assertEquals("", actual[5]);
    }

    @Test
    void createNewArraySize() {
        Employee emp = new Employee();
        emp.employees[5] = "";
        String[] actual = emp.createNewArraySize(emp.employees);
        assertEquals(5, actual.length);
    }

    @Test
    void copyNamesIntoNewArray() {
        Employee emp = new Employee();
        emp.employees[5] = "";
        String[] reducedArray = new String[5];
        String[] actual = emp.copyNamesIntoNewArray(emp.employees, reducedArray);
        String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones",
                "Amanda Cullen", "Jeremy Goodwin"};
        assertArrayEquals(expected, actual);
    }

}