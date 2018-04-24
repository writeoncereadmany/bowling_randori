package co.unruly.bowlingkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    @Test
    public void shouldReturnZeroAsScoreForNewGame() {
        Bowling game = new Bowling();

        assertEquals(0, game.getScore());
    }
}
