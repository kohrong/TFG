package categoryCheckers;

import pokertrainer.Card;
import pokertrainer.PokerHand;

public class FullHouseChecker implements CategoryChecker {

    @Override
    public boolean check(PokerHand pokerHand) {
        if (!findSameNumbers(pokerHand, 2)) return false;
        return findSameNumbers(pokerHand, 3);
    }

    private boolean findSameNumbers(PokerHand pokerHand, int number) {
        int sameNumber = 0;
        for (int i = 0; i < pokerHand.getSize() - 1; i++) {
            Card card = pokerHand.getCard(i);
            sameNumber = 0;
            for (int j = 0; j < pokerHand.getSize(); j++)
                if (card.isSameNumber(pokerHand.getCard(j))) sameNumber++;
            if (sameNumber == number) return true;
        }
        return false;
    }
}
