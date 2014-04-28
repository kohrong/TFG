package pokerCategory;

import pokertrainer.PokerHand;

public class StraightFlush extends HandCategory {
    private String id;
    
    public StraightFlush(String straightFlush) {
        this.id = straightFlush;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.StraightFlushChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
