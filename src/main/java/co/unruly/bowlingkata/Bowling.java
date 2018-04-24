package co.unruly.bowlingkata;

public class Bowling {

    private int score = 0;

    public Bowling(int... scores) {
        for(int score: scores) {
            this.score += score;
        }
    }

    public int getScore() {
        return score;
    }
}
