package blackjack;

public class GameRecord {
    //a game record in the format W - D - L
    private int wins;
    private int ties;
    private int losses;

    public GameRecord() {
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public int getWins() {
        return wins;
    }

    public void win() {
        wins++;
    }

    public void tie() {
        ties++;
    }

    public void lose() {
        losses++;
    }

    public String getRecord() {
        return wins + " - " + ties + " - " + losses;
    }
}
