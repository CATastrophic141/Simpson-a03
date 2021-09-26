package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeEntryTest {

    @Test
    void validateInputTest1() {
        EmployeeEntry entry = new EmployeeEntry();
        String expected = "There were no detected errors\n";
        String actual = entry.validateInput("John", "Doe", "12345", "JD-0420");
        assertEquals(expected, actual);
    }

    @Test
    void validateInputTest2() {
        EmployeeEntry entry = new EmployeeEntry();
        String expected = "Last name must be filled in\nLast name must be at least 2 characters\nZip code must be a 5 digit number\nEmployee code must be in format AB-1234\n";
        String actual = entry.validateInput("John", "", "Numbers", "3=-0420");
        assertEquals(expected, actual);
    }
}