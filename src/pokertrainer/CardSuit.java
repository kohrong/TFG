package pokertrainer;

public class CardSuit {
    
    public static final CardSuit CLUB = new CardSuit("CLUB");
    public static final CardSuit DIAMOND = new CardSuit("DIAMOND");
    public static final CardSuit SPADE = new CardSuit("SPADE");
    public static final CardSuit HEART = new CardSuit("HEART");
    public static final CardSuit[] SUITS = new CardSuit[] {SPADE, HEART, DIAMOND, CLUB};
    
    private final String id;
    
    private CardSuit(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
    
    
    
}
