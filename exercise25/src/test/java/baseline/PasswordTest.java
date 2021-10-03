package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {
    static String testPassword = "P@ssw0rd";
    Password passTest = new Password();
    @Test
    void passwordValidatorTests() {
        String passwordNumbers = "12345";
        int expectedNumbers = 1;
        assertEquals (expectedNumbers, passTest.passwordValidator(passwordNumbers));
        String passwordLetters = "abcdef";
        int expectedLetters = 2;
        assertEquals (expectedLetters, passTest.passwordValidator(passwordLetters));
        String passwordBoth = "abc123";
        int expectedBoth = 3;
        assertEquals (expectedBoth, passTest.passwordValidator(passwordBoth));
        String passwordBothLong = "abcde12345";
        int expectedBothLong = 4;
        assertEquals (expectedBothLong, passTest.passwordValidator(passwordBothLong));
        String passwordFull = "L3gend@ry";
        int expectedFull = 6;
        assertEquals (expectedFull, passTest.passwordValidator(passwordFull));
    }

    @Test
    void resultStringGenerateTest(){
        int score = 5;
        String expected = "strong";
        assertEquals (expected, passTest.resultStringGenerate(score));
    }

    @Test
    void numberCheckTest(){
        int expected = 1;
        assertEquals(expected, passTest.checkNumbers(testPassword));
    }

    @Test
    void letterCheckTest(){
        int expected = 2;
        assertEquals(expected, passTest.checkLetters(testPassword));
    }

    @Test
    void symbolCheckTest(){
        int expected = 2;
        assertEquals(expected, passTest.checkSymbol(testPassword));
    }

    @Test
    void lengthCheckTest(){
        int expected = 1;
        assertEquals(expected, passTest.checkLength(testPassword));
    }
}