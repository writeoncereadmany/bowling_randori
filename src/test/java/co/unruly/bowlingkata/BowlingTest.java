package co.unruly.bowlingkata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BowlingTest {

    @Test
    public void startGameResultsTest() {
        Bowling game = new Bowling();
        assertEqual(game.getScore(), 0);
    }
}
