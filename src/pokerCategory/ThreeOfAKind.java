package pokerCategory;

import pokertrainer.PokerHand;

public class ThreeOfAKind extends HandCategory {
    private String id;
    
    public ThreeOfAKind(String threeOfAKind) {
        this.id = threeOfAKind;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.ThreeOfAKindChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
