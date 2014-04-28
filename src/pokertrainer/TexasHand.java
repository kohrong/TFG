package pokertrainer;

import java.util.Comparator;

public class TexasHand implements Hand{

    private final Card[] cards = new Card[2];

    public TexasHand(Card card0, Card card1) {
        this.cards[0] = card0;
        this.cards[1] = card1;
    }

        public boolean isSuited() {
        return cards[0].isSameSuit(cards[1]);
    }

        public boolean isConnected() {
        return getLower().isConnected(getUpper());
    }

    public boolean isPocketPair() {
        Card card = cards[0];
        for (int i = 1; i < cards.length; i++)
            if (card.getValue() != cards[i].getValue()) return false;
        return true;
    }

        public boolean isBroadway() {
        for (Card card : cards)
            if ((card.getValue() < 10)) return false;
        return true;
    }

    public Card getLower() {
        return getCard(new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {
                return o1.getValue() - o2.getValue();
            }
        });
    }

    public Card getUpper() {
        return getCard(new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {
                return o2.getValue() - o1.getValue();
            }
        });
    }
    
    public Card getCard(Comparator<Card> comparator) {
        Card card = cards[0];
        for (int i = 1; i < cards.length; i++)
            if (comparator.compare(cards[i], card) < 0) card = cards[i];
        return card;
    }
}
