import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards;

    public Hand(List<Card> cards) {
        if (cards.size() != 2) {
            throw new IllegalArgumentException("手札は2枚: " + cards.size());
        }
        this.cards = new ArrayList<>(cards);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}
