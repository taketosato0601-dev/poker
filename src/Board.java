import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        if (cards.size() >= 5) {
            throw new IllegalStateException("ボードは最大5枚");
        }
        cards.add(card);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }
}
