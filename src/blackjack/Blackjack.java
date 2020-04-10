package blackjack;

public class Blackjack {
    public static final int WIDTH = 680;
    public static final int HEIGHT = 900;

    private Player player;
    private Dealer dealer;
    private Deck deck;
    private GameRecord record;  // record in the form of W/D/L
    private boolean over;

    private int count;

    public Blackjack() {
        this.player = new Player();
        this.dealer = new Dealer();
        this.deck = new Deck();
        record = new GameRecord();
        over = false;
        count = 0;
        start();
    }

    public boolean isOver() {
        return over;
    }

    public void start() {
        freshGame();
        while (count < 100000) {
            count++;
            freshGame();
        }
    }

    // sets up fresh hands and starts the game
    public void freshGame() {
        over = false;
        deck = new Deck();
        player.clear();
        dealer.clear();
        player.takeCard(deck.draw());
        player.takeCard(deck.draw());
        dealer.takeCard(deck.draw());
        dealer.takeCard(deck.draw());
        playersTurn();
        dealersTurn();
    }


    public void playersTurn() {
        if (!player.getIsBust()) {
            while (player.willHit()) {
                player.takeCard(deck.draw());
                System.out.println(player.getScore());
            }
        }
    }

    private void dealersTurn() {
        if (!player.getIsBust()) {
            while (dealer.willHit()) {
                dealer.takeCard(deck.draw());
                System.out.println(dealer.getScore());
            }
        }
        determineResult();
    }

    public void endGame() {
        over = true;
        System.out.println(record.getRecord());
    }

    public void determineResult() {
        int dealerScore = dealer.getScore();
        int playerScore = player.getScore();
        if (player.getIsBust() || (!dealer.getIsBust() && dealerScore > playerScore)) {
            record.lose();
        } else if (dealer.getIsBust() || playerScore > dealerScore) {
            record.win();
        } else {
            record.tie();
        }
        endGame();
    }
}
