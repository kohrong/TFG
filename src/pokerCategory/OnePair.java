package pokerCategory;

import java.util.Arrays;
import pokertrainer.Card;
import pokertrainer.PokerHand;

public class OnePair extends HandCategory {
    private String id;
    
    public OnePair(String onePair) {
        this.id = onePair;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.OnePairChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
