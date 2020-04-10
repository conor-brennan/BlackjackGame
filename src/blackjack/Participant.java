package blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Participant {
    protected List<Card> hand;
    protected int score;
    protected boolean isBust;

    private final int MAX_SCORE = 21;

    public Participant() {
        this.hand = new ArrayList<>();
        this.isBust = false;
        score = 0;
    }

    // returns score
    public int getScore() {
        return score;
    }

    // determines whether participant will hit or stay
    public abstract boolean willHit();

    // gives the player a card, adds value to score, checks for bust
    public void takeCard(Card card) {
        hand.add(card);
        score += card.getValue(card.getFace());
        updateBust();
    }

    // updates bust according to whether or not participant is over max score
    protected void updateBust() {
        if (score > MAX_SCORE) {
            isBust = true;
        }
    }

    public boolean getIsBust() {
        return isBust;
    }

    public void clear() {
        hand = new ArrayList<>();
        score = 0;
        isBust = false;
    }
}
