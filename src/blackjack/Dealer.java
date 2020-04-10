package blackjack;

public class Dealer extends Participant {

    public Dealer() {
        super();
    }

    @Override
    // returns true if score less than 16
    public boolean willHit() {
        return (score < 18);
    }
}
