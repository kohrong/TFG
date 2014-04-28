package categoryCheckers;

import pokertrainer.PokerHand;

public class StraightFlushChecker implements CategoryChecker{

    @Override
    public boolean check(PokerHand pokerHand) {
        StraightChecker straightChecker = new StraightChecker();
        FlushChecker flushChecker = new FlushChecker();
        return (straightChecker.check(pokerHand) && flushChecker.check(pokerHand));
    }
    
}
