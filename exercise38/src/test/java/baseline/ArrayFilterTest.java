package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFilterTest {

    ArrayFilter filter = new ArrayFilter();

    String[] stringCovTester = {"1", "2", "3", "4"};

    @Test
    void generateIntArrayFromString() {
        int[] actual = filter.generateIntArrayFromStringArray(stringCovTester);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void checkNumberOfEvens() {
        int[] test = filter.generateIntArrayFromStringArray(stringCovTester);
        int actual = filter.checkNumberOfEvens(test);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers() {
        int[] test = filter.generateIntArrayFromStringArray(stringCovTester);
        int[] actual = filter.filterEvenNumbers(test);
        int[] expected = {2, 4};
        assertArrayEquals(expected, actual);
    }
}