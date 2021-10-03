package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    PasswordGenerator test = new PasswordGenerator();

    int numSpecial = 3;
    int numNumbers = 5;
    int minLength = 12;

    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> numbers = new ArrayList<>();
    ArrayList<Character> special = new ArrayList<>();

    @BeforeEach
    void setUp() {
        //Initialize the arraylists
        for (char letter = 'A'; letter <= 'Z'; letter++){
            letters.add(letter);
        }
        for (char number = '0'; number <= '9'; number++){
            numbers.add(number);
        }
        //Selectively choose the special characters to use in the password
        special.add('!');
        special.add('?');
        special.add('@');
        special.add('#');
        special.add('$');
        special.add('%');
        special.add('&');
        special.add('*');
        special.add('+');
        special.add('-');
        special.add('=');
        special.add('>');
        special.add('<');
        special.add('~');
    }

    @Test
    void generateRandomIndexNumber() {
        int randNumActual = test.generateRandomIndex(numbers.size());
        assertTrue(randNumActual >= 0 && randNumActual < numbers.size());
    }

    @Test
    void generateRandomIndexSpecial() {
        int randSpecActual = test.generateRandomIndex(special.size());
        assertTrue(randSpecActual >= 0 && randSpecActual < special.size());
    }

    @Test
    void findProperPasswordSize() {
        int randLetterActual = test.generateRandomIndex(letters.size());
        assertTrue(randLetterActual >= 0 && randLetterActual < letters.size());
    }

    @Test
    void generatePassword() {
        //This test verifies that the number of letters is equal to or greater than the number of special characters
        test.initializeGenerator(minLength, numNumbers, numSpecial);
        String passTest = test.generatePassword(test.minLength, test.numNumbers, test.numSpecial);
        //Use assertEquals to check if a string was generated
        char[] arrTest = passTest.toCharArray();
        int numLetters = 0;
        for (char c : arrTest) {
            if (c >= 65 && c <= 90) {
                numLetters = numLetters + 1;
            }
        }
        assertTrue(numLetters >= numNumbers+numSpecial);
    }
}