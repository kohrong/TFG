package pokerCategory;

import java.util.Arrays;
import pokertrainer.Card;
import pokertrainer.PokerHand;

public class TwoPair extends HandCategory {
    private String id;
    
    public TwoPair(String twoPair) {
        this.id = twoPair;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.TwoPairChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
