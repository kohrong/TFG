package pokerCategory;

import pokertrainer.PokerHand;

public class FullHouse extends HandCategory {
    private String id;
    
    public FullHouse(String fullHouse) {
        this.id = fullHouse;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.FullHouseChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }  
}
