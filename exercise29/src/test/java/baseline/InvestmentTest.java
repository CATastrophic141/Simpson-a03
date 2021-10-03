package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentTest {
    Investment invest = new Investment();

    @Test
    void inputValidatorTest() {
        double expected = 72.0/12.5;
        double actual = invest.findYearsUntilDouble(12.5);
        assertEquals(expected, actual);
    }

    @Test
    void findYearsUntilDoubleTestIsNaNTest() {
        String userIn = "12.5";
        double expected = 12.5;
        double actual = invest.validateInput(userIn);
        assertEquals(expected, actual);
    }

}