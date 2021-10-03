package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAdditionTest {

    NumberAddition sumTest = new NumberAddition();

    @Test
    void addNumbersTest1() {
        double expected = 15.0;
        double[] array = {2.0, 3.0, 5.0, 1.0 ,4.0};
        assertEquals(expected, sumTest.addNumbers(array));
    }
    @Test
    void addNumbersTest2() {
        double expected = 17.25;
        double[] array = {1.15, 6, 5.1, 2.0 ,3.0};
        assertEquals(expected, sumTest.addNumbers(array));
    }
}