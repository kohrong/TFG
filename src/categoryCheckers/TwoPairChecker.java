package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class TwoPairChecker implements CategoryChecker{

    @Override
    public boolean check(PokerHand pokerHand) {
       int onePair = 0;
       for (int i = 0; i < pokerHand.getSize()-1; i++) {
            Card card = pokerHand.getCard(i);
            for (int j = i+1; j < pokerHand.getSize(); j++) {
                if(onePair == 0 && card.isSameNumber(pokerHand.getCard(j)))
                    onePair = card.getNumber();
                if(card.isSameNumber(pokerHand.getCard(j)) && card.getNumber() != onePair)
                    return true;
            }
        }
        return false;
    }
    
}
