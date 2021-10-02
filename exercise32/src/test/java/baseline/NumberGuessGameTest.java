package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGuessGameTest {
    NumberGuessGame game = new NumberGuessGame();

    @Test
    void generateNumberGuessGameAnswerEasy() {
        //Test whether a number between 0 and 10 is generated
        int randNum = game.generateNumberGuessGameAnswer(1);
        assertTrue(randNum >= 0 && randNum <= 10);
    }

    @Test
    void generateNumberGuessGameAnswerMedium() {
        //Test whether a number between 0 and 100 is generated
        int randNum = game.generateNumberGuessGameAnswer(2);
        assertTrue(randNum >= 0 && randNum <= 100);
    }

    @Test
    void generateNumberGuessGameAnswerHard() {
        //Test whether a number between 0 and 1000 is generated
        int randNum = game.generateNumberGuessGameAnswer(3);
        assertTrue(randNum >= 0 && randNum <= 1000);
    }

}