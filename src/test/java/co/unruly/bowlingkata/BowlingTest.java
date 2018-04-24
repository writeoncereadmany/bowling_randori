package co.unruly.bowlingkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    @Test
    public void shouldReturnZeroAsScoreForNewGame() {
        Bowling game = new Bowling();

        assertEquals(0, game.getScore());
    }

    @Test
    public void shouldReturnScoreForASingleNonScoringRoll() {
        Bowling game = new Bowling(0);
        assertEquals(0, game.getScore());
    }

    @Test
    public void shouldReturnScoreForASingleNonZeroRoll() {
        Bowling game = new Bowling(1);
        assertEquals(1, game.getScore());
    }

}
