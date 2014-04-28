package pokerCategory;

import pokertrainer.PokerHand;

public class Straight extends HandCategory {
    private String id;
    
    public Straight(String straight) {
        this.id = straight;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.StraightChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
