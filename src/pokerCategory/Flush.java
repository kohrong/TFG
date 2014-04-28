package pokerCategory;

import pokertrainer.PokerHand;

public class Flush extends HandCategory {
    private String id;
    
    public Flush(String flush) {
        this.id = flush;
    }

    @Override
    public boolean check(PokerHand pokerHand) {
        return new categoryCheckers.FlushChecker().check(pokerHand);
    }

    @Override
    public String toString() {
        return id;
    }    
}
