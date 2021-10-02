package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void generateWinnerIndex() {
        Lottery test = new Lottery();
        ArrayList<String> arrayListTest = new ArrayList<>();
        arrayListTest.add("Test 1");
        arrayListTest.add("Test 2");
        arrayListTest.add("Test 3");
        int actual = test.generateWinnerIndex(arrayListTest);
        assertTrue(actual >=0 && actual <=2);
    }

    @Test
    void printWinner() {
        Lottery test = new Lottery();
        ArrayList<String> arrayListTest = new ArrayList<>();
        arrayListTest.add("Test 1");
        arrayListTest.add("Test 2");
        arrayListTest.add("Test 3");
        String actual = test.generateWinnerString(arrayListTest, 1);
        assertEquals("Test 2", actual);
    }
}