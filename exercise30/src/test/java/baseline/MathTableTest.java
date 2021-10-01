package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTableTest {
    MathTable table = new MathTable();
    StringBuilder test = new StringBuilder();

    @Test
    void printMultTable() {
        String expected = createExpectedTable();
        String actual = table.generateMultTableString(12, 12);
        assertEquals(expected, actual);
    }

    //A different style of a more rigorous string building (without nested loops)
    // is being used to test the validity
    // of the string build with nested loops
    String createExpectedTable() {
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 2*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 3*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 4*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 5*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 6*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 7*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 8*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 9*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 10*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 11*i));
        }
        test.append(String.format("%n"));
        for (int i = 1; i<=12; i++) {
            test.append(String.format("%5d", 12*i));
        }
        test.append(String.format("%n"));
    return test.toString();
    }
}