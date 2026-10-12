public class Player {

    private final String name;
    private final Hand hand;

    public Player(String name, Hand hand) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullです");
        }
        if (hand == null) {
            throw new IllegalArgumentException("handがnullです");
        }
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
}
