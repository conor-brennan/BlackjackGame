package blackjack;

public class Card {
    private String suit;
    private String face;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue(String face) {
        switch (face) {
            case ("A"): return 1;
            case ("2"): return 2;
            case ("3"): return 3;
            case ("4"): return 4;
            case ("5"): return 5;
            case ("6"): return 6;
            case ("7"): return 7;
            case ("8"): return 8;
            case ("9"): return 9;
            case ("10"): return 10;
            default: return 11;
        }
    }

    public void displayCard() {
        System.out.println(getName());
    }

    public String getName() {
        return face + " of " + suit;
    }
}
