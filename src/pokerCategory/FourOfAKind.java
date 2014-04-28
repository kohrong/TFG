package pokerCategory;

import pokertrainer.PokerHand;

public class FourOfAKind extends HandCategory {
    private String id;
    public FourOfAKind(String fourOfAKind) {
        this.id = fourOfAKind;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.FourOfAKindChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }
}
