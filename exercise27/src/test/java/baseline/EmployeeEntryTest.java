package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeEntryTest {
    EmployeeEntry entryParts = new EmployeeEntry();

    @Test
    void validateFirstNameTest(){
        String expected = "First name must be at least 2 characters\n";
        String firstName = "R";
        assertEquals(expected, entryParts.validateFirstName(firstName));
    }

    @Test
    void validateLastNameTest(){
        String expected = "Last name must be at least 2 characters\n";
        String lastName = "S";
        assertEquals(expected, entryParts.validateLastName(lastName));
    }

    @Test
    void validateZipCodeTest(){
        String expected = "Zip code must be a 5 digit number\n";
        String zip = "NaN";
        assertEquals(expected, entryParts.validateZipCode(zip));
    }

    @Test
    void validateEmployeeCodeCharacterTest(){
        String expected = "Employee code must be in format AB-1234\n";
        String code = "A0-12EB";
        assertEquals(expected, entryParts.validateEmployeeCode(code));
    }

    @Test
    void validateEmployeeCodeLengthTest(){
        String expected = "Employee code must be less than 8 characters long (AB-1234)\n";
        String code = "RS-1234567";
        assertEquals(expected, entryParts.validateEmployeeCode(code));
    }

    @Test
    void validateInputTest1() {
        EmployeeEntry entry1 = new EmployeeEntry();
        String expected = "There were no detected errors\n";
        String actual = entry1.validateInput("John", "Doe", "12345", "JD-0420");
        assertEquals(expected, actual);
    }

    @Test
    void validateInputTest2() {
        EmployeeEntry entry2 = new EmployeeEntry();
        String expected = "Last name must be filled in\nLast name must be at least 2 characters\nZip code must be a 5 digit number\nEmployee code must be in format AB-1234\n";
        String actual = entry2.validateInput("John", "", "Numbers", "3=-0420");
        assertEquals(expected, actual);
    }
}