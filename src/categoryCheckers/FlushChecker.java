package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class FlushChecker implements CategoryChecker{

    @Override
    public boolean check(PokerHand pokerHand) {
        return isSuited(pokerHand);
    }

    private boolean isSuited(PokerHand pokerHand) {
        for (int i = 0; i < pokerHand.getSize()-1; i++) {
            Card card = pokerHand.getCard(i);
            for (int j = i+1; j < pokerHand.getSize(); j++) {
                if(!card.isSameSuit(pokerHand.getCard(j)))  return false;
            }
        }
        return true;
    }
    
}
