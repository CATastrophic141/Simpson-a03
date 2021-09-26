package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void passwordValidatorTestVery() {
        Password passTest = new Password();
        String password = "12345";
        int expected = 1;
        assertEquals (expected, passTest.passwordValidator(password));
    }
    @Test
    void passwordValidatorTestWeak() {
        Password passTest = new Password();
        String password = "abcdef";
        int expected = 2;
        assertEquals (expected, passTest.passwordValidator(password));
    }
    @Test
    void passwordValidatorTestModerate() {
        Password passTest = new Password();
        String password = "abc123";
        int expected = 3;
        assertEquals (expected, passTest.passwordValidator(password));
    }
    @Test
    void passwordValidatorTestStrong() {
        Password passTest = new Password();
        String password = "abcde12345";
        int expected = 4;
        assertEquals (expected, passTest.passwordValidator(password));
    }
    @Test
    void passwordValidatorTestVeryStrong() {
        Password passTest = new Password();
        String password = "L3gend@ry";
        int expected = 6;
        assertEquals (expected, passTest.passwordValidator(password));
    }
    @Test
    void resultStringGenerateTest(){
        Password passTest = new Password();
        int score = 5;
        String expected = "strong";
        assertEquals (expected, passTest.resultStringGenerate(score));
    }
}