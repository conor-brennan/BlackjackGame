package blackjack;

public class Player extends Participant {
    private boolean stay;

    public Player() {
        super();
        this.stay = false;
    }

    @Override
    public boolean willHit() {
        return (score < 19);
    }

    public boolean willStay() {
        return stay;
    }

    public void stay() {
        stay = true;
    }

    public void dontStay() {
        stay = false;
    }
}
