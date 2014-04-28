package categoryCheckers;

import pokertrainer.PokerHand;

public class HighCardChecker implements CategoryChecker{
    
    @Override
    public boolean check(PokerHand pokerHand){
        return true;
    }
}
