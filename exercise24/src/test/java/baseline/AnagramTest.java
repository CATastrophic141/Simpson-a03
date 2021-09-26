package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void prepAnagramStringTest() {
        Anagram anagram = new Anagram();
        char[] expected = {'a','b','c'};
        //"Expected" must be made into a string with the same method as the tested string due to the processing of the strings
        //Due to this, direct comparison will lead to an error or faulty negative report, even if both strings are actually equal
        String expectedString = Arrays.toString(expected);
        String charTest = anagram.prepAnagramString("cab");
        assertEquals(expectedString, charTest);
    }

    @Test
    void anagramCompareTest1() {
        Anagram anagram = new Anagram();
        String string1 = "REGAL";
        String string2 = "LARGE";
        boolean test = anagram.isAnagram(string1, string2);
        assertTrue(test);
    }
    @Test
    void anagramCompareTest2() {
        Anagram anagram = new Anagram();
        String string1 = "POSITIVE";
        String string2 = "NEGATIVE";
        boolean test = anagram.isAnagram(string1, string2);
        assertFalse(test);
    }
}