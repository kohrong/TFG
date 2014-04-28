package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class StraightFlushCheckerTest {
    
    public StraightFlushCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        StraightFlushChecker straightFlushChecker = new StraightFlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.CLUB)});
        assertFalse(straightFlushChecker.check(pokerHand));
    }
    
    @Test
    public void testIsStraightFlush() throws Card.Exception{
        StraightFlushChecker straightFlushChecker = new StraightFlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.CLUB)});
        assertTrue(straightFlushChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFlushIsntStraight() throws Card.Exception{
        StraightFlushChecker straightFlushChecker = new StraightFlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(8, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.CLUB)});
        assertFalse(straightFlushChecker.check(pokerHand));
    }
    
    @Test
    public void testIsStraightIsntFlush() throws Card.Exception{
        StraightFlushChecker straightFlushChecker = new StraightFlushChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.DIAMOND)});
        assertFalse(straightFlushChecker.check(pokerHand));
    }
    
}
