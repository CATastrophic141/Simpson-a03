package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    ArrayList<Double> test = new ArrayList<>();
    Statistics s = new Statistics();

    @BeforeEach
    void setUp() {
        test.add(10.0);
        test.add(11.0);
        test.add(12.0);
        test.add(13.0);
        test.add(14.0);
        test.add(15.0);
        test.add(16.0);
    }

    @Test
    void average() {
        double avg = s.average(test);
        assertEquals(13, avg);
    }

    @Test
    void min() {
        double avg = s.min(test);
        assertEquals(10, avg);
    }

    @Test
    void max() {
        double avg = s.max(test);
        assertEquals(16, avg);
    }

    @Test
    void std() {
        //Round received standard deviation down, as the printed value is truncated to the second digit
        double avg = Math.floor(s.std(test)*100)/100;
        assertEquals(2.00, avg);
    }
}