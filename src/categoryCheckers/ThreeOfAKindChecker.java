package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class ThreeOfAKindChecker implements CategoryChecker{

    @Override
    public boolean check(PokerHand pokerHand) {
        for (int i = 0; i < pokerHand.getSize() - 2; i++) {
            int sameNumber = 0;
            Card card = pokerHand.getCard(i);
            for (int j = i + 1; j < pokerHand.getSize(); j++) {
                if (card.isSameNumber(pokerHand.getCard(j))) sameNumber++;
                if (sameNumber == 2) return true;
            }
        }
        return false;
    }
    
}
