package pokerCategory;

import java.util.Arrays;
import pokertrainer.PokerHand;

public class HighCard extends HandCategory {
    private final String id;
    
    public HighCard(String id) {
        this.id = id;
    }
    
    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.HighCardChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
