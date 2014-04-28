package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class StraightChecker implements CategoryChecker{

    @Override
    public boolean check(PokerHand pokerHand) {
        return isConnected(pokerHand);
    }

    private boolean isConnected(PokerHand pokerHand) {
        for (int i = 0; i < pokerHand.getSize()-1; i++) {
            Card card = pokerHand.getCard(i);
            for (int j = i+1; j < pokerHand.getSize(); j++) {
                if(!card.isConnected(pokerHand.getCard(j))) return false;
            }
        }
        return true;
    }
    
}
