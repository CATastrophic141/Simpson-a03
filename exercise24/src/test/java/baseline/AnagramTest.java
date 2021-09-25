package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void prepAnagramStringTest() {
        Anagram anagram = new Anagram();
        char[] expected = {'a','b','c'};
        String expectedString = Arrays.toString(expected);
        String charTest = anagram.prepAnagramString("cab");
        assertEquals(expectedString, charTest);
    }

    @Test
    void anagramCompareTest1() {
        Anagram anagram = new Anagram();
        String string1 = "REGAL";
        String string2 = "LARGE";
        boolean test = anagram.anagramCompare(string1, string2);
        assertTrue(test);
    }
    @Test
    void anagramCompareTest2() {
        Anagram anagram = new Anagram();
        String string1 = "POSITIVE";
        String string2 = "NEGATIVE";
        boolean test = anagram.anagramCompare(string1, string2);
        assertFalse(test);
    }
}