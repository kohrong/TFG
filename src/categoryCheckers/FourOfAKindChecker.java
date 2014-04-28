package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class FourOfAKindChecker implements CategoryChecker {

    @Override
    public boolean check(PokerHand pokerHand) {
        for (int i = 0; i < pokerHand.getSize() - 1; i++) {
            int sameNumber = 0;
            Card card = pokerHand.getCard(i);
            for (int j = i + 1; j < pokerHand.getSize(); j++) {
                if (card.isSameNumber(pokerHand.getCard(j))) sameNumber++;
                if (sameNumber == 3) return true;
            }
        }
        return false;
    }
}
