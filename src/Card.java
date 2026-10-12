import java.util.Objects;

public class Card {

    private final Suit suit;
    private final int value;

    public Card(Suit suit, int value) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("valueは1〜13: " + value);
        }
        if (suit == null) {
            throw new IllegalArgumentException("suitがnull");
        }
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String rank;

        if (value == 1) {
            rank = "A";
        } else if (value == 11) {
            rank = "J";
        } else if (value == 12) {
            rank = "Q";
        } else if (value == 13) {
            rank = "K";
        } else {
            rank = String.valueOf(value);
        }

        return rank + suit.getSymbol();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Card)) {
            return false;
        }
        Card other = (Card) o;
        return suit == other.suit && value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
}
