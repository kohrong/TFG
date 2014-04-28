package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokerCategory.Flush;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class FlushCheckerTest {
    
    public FlushCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        FlushChecker flushChecker = new FlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(flushChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFlush() throws Card.Exception{
        FlushChecker flushChecker = new FlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.CLUB)});
        assertTrue(flushChecker.check(pokerHand));
    }
}
