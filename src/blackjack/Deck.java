package blackjack;

import sun.nio.cs.ext.MacThai;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        createDeck();
        //displayCards();
        shuffle();
        //displayCards();
    }

    private void createDeck() {
        cards.add(new Card("A", "SPADE"));
        cards.add(new Card("2", "SPADE"));
        cards.add(new Card("3", "SPADE"));
        cards.add(new Card("4", "SPADE"));
        cards.add(new Card("5", "SPADE"));
        cards.add(new Card("6", "SPADE"));
        cards.add(new Card("7", "SPADE"));
        cards.add(new Card("8", "SPADE"));
        cards.add(new Card("9", "SPADE"));
        cards.add(new Card("10", "SPADE"));
        cards.add(new Card("J", "SPADE"));
        cards.add(new Card("Q", "SPADE"));
        cards.add(new Card("K", "SPADE"));
        cards.add(new Card("A", "HEART"));
        cards.add(new Card("2", "HEART"));
        cards.add(new Card("3", "HEART"));
        cards.add(new Card("4", "HEART"));
        cards.add(new Card("5", "HEART"));
        cards.add(new Card("6", "HEART"));
        cards.add(new Card("7", "HEART"));
        cards.add(new Card("8", "HEART"));
        cards.add(new Card("9", "HEART"));
        cards.add(new Card("10", "HEART"));
        cards.add(new Card("J", "HEART"));
        cards.add(new Card("Q", "HEART"));
        cards.add(new Card("K", "HEART"));
        cards.add(new Card("A", "CLUB"));
        cards.add(new Card("2", "CLUB"));
        cards.add(new Card("3", "CLUB"));
        cards.add(new Card("4", "CLUB"));
        cards.add(new Card("5", "CLUB"));
        cards.add(new Card("6", "CLUB"));
        cards.add(new Card("7", "CLUB"));
        cards.add(new Card("8", "CLUB"));
        cards.add(new Card("9", "CLUB"));
        cards.add(new Card("10", "CLUB"));
        cards.add(new Card("J", "CLUB"));
        cards.add(new Card("Q", "CLUB"));
        cards.add(new Card("K", "CLUB"));
        cards.add(new Card("A", "DIAMOND"));
        cards.add(new Card("2", "DIAMOND"));
        cards.add(new Card("3", "DIAMOND"));
        cards.add(new Card("4", "DIAMOND"));
        cards.add(new Card("5", "DIAMOND"));
        cards.add(new Card("6", "DIAMOND"));
        cards.add(new Card("7", "DIAMOND"));
        cards.add(new Card("8", "DIAMOND"));
        cards.add(new Card("9", "DIAMOND"));
        cards.add(new Card("10", "DIAMOND"));
        cards.add(new Card("J", "DIAMOND"));
        cards.add(new Card("Q", "DIAMOND"));
        cards.add(new Card("K", "DIAMOND"));
    }

    public void displayCards() {
        for (Card card : cards) {
            card.displayCard();
        }
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void shuffle() {
        List<Card> newCards = new ArrayList<>();
        while (0 < cards.size()) {
            int rand = (int) (Math.random() * (cards.size() - 1));
            Card card = cards.get(rand);
            cards.remove(card);
            newCards.add(card);
        }
        this.cards = newCards;
    }

    public Card draw() {
        Card drawnCard = cards.get(0);
        cards.remove(drawnCard);

        drawnCard.displayCard();

        return drawnCard;
    }

}
