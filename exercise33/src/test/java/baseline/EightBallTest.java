package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EightBallTest {
    EightBall ball = new EightBall();

    @Test
    void generateRandNumTest() {
        //Test is the random number is within expected bounds
        int actual = ball.generateRandNum();
        assertTrue(actual >= 1 && actual <= 4000);
    }

    @Test
    void selectResponseYes() {
        String yesExpected = "Yes";
        String actual = ball.selectResponse(500);
        assertEquals(yesExpected, actual);
    }

    @Test
    void selectResponseNo() {
        String noExpected = "No";
        String actual = ball.selectResponse(1500);
        assertEquals(noExpected, actual);
    }

    @Test
    void selectResponseMaybe() {
        String maybeExpected = "Maybe";
        String actual = ball.selectResponse(2500);
        assertEquals(maybeExpected, actual);
    }

    @Test
    void selectResponseAskAgainLater() {
        String aglExpected = "Ask again later";
        String actual = ball.selectResponse(3500);
        assertEquals(aglExpected, actual);
    }
}