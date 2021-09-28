package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {
    HeartRate bpm = new HeartRate();

    //Tests are intended to verify if the use of an integer input will not disrupt the calculation of the user's heart rate
    @Test
    void calculateBPMTest1() {
        double intensity = 65.0/100;
        int intensityTest = 65;
        int age = 19;
        int rate = 70;
        bpm.setVariables(age, rate);
        double expected = (((220-age)-rate)*intensityTest/100.0)+rate;
        double actual = bpm.calculateBPM(intensity);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBPMTest2() {
        double intensity = 90.0 / 100;
        int intensityTest = 90;
        int age = 30;
        int rate = 90;
        bpm.setVariables(age, rate);
        double expected = (((220 - age) - rate) * intensityTest / 100.0) + rate;
        double actual = bpm.calculateBPM(intensity);
        assertEquals(expected, actual);
    }
}