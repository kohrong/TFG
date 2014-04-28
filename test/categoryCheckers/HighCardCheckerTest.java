package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class HighCardCheckerTest {
    
    public HighCardCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        HighCardChecker highCardChecker = new HighCardChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(highCardChecker.check(pokerHand));
    }
    
}
