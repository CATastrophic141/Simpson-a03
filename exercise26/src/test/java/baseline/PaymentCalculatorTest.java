package baseline;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorCaseOneTest {
    double balance = 5000;
    double aprPercent = 12;
    double dailyRate = 12.0/(100.0*365.0);
    double monthlyPayment= 100;

    PaymentCalculator test = new PaymentCalculator();

    @Test
    void calculatePowerArgumentTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = (1 + dailyRate);
        double actual = test.calculatePowerArgument();
        assertEquals(expected, actual);
    }

    @Test
    void calculateRatePowerTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = Math.pow(1 + dailyRate, 30);
        double actual = test.calculateRatePower();
        assertEquals(expected, actual);
    }

    @Test
    void calculateFirstLogArgumentTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = (1 + (Math.ceil(balance*100)/100)/(Math.ceil(monthlyPayment*100)/100) * (1 - test.calculateRatePower()));
        double actual = test.calculateFirstLogArgument();
        assertEquals(expected, actual);
    }

    @Test
    void calculatePaymentLogarithmTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = Math.log10(test.calculateFirstLogArgument()) / Math.log10(1+dailyRate);
        double actual = test.calculatePaymentLogarithm();
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOffTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = -(1.0/30.0) * test.calculatePaymentLogarithm();
        double actual = test.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual);
    }
}

class PaymentCalculatorCase2Test {
    double balance = 7500.5125;
    double aprPercent = 11.75;
    double dailyRate = 11.75/(100.0*365.0);
    double monthlyPayment= 175.87525;

    PaymentCalculator test = new PaymentCalculator();

    @Test
    void calculatePowerArgumentTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = (1 + dailyRate);
        double actual = test.calculatePowerArgument();
        assertEquals(expected, actual);
    }

    @Test
    void calculateRatePowerTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = Math.pow(1 + dailyRate, 30);
        double actual = test.calculateRatePower();
        assertEquals(expected, actual);
    }

    @Test
    void calculateFirstLogArgumentTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = (1 + (Math.ceil(balance*100)/100)/(Math.ceil(monthlyPayment*100)/100) * (1 - test.calculateRatePower()));
        double actual = test.calculateFirstLogArgument();
        assertEquals(expected, actual);
    }

    @Test
    void calculatePaymentLogarithmTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = Math.log10(test.calculateFirstLogArgument()) / Math.log10(1+dailyRate);
        double actual = test.calculatePaymentLogarithm();
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsUntilPaidOffTest() {
        test.constructPaymentCalc(balance, aprPercent, monthlyPayment);
        double expected = -(1.0/30.0) * test.calculatePaymentLogarithm();
        double actual = test.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual);
    }
}