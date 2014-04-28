package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class StraightCheckerTest {
    
    public StraightCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        StraightChecker straightChecker = new StraightChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(straightChecker.check(pokerHand));
    }
    
    @Test
    public void testIsStraightWithAce() throws Card.Exception{
        StraightChecker straightChecker = new StraightChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.DIAMOND)});
        assertTrue(straightChecker.check(pokerHand));
    }
      
    @Test
    public void testIsRoyalStraight() throws Card.Exception{
        StraightChecker straightChecker = new StraightChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card('T', CardSuit.CLUB), 
            new Card('K', CardSuit.CLUB), new Card('Q', CardSuit.CLUB), new Card('J', CardSuit.CLUB), 
            new Card('A', CardSuit.DIAMOND)});
        assertTrue(straightChecker.check(pokerHand));
    }
    
    @Test
    public void testMinimumStraight() throws Card.Exception{
        StraightChecker straightChecker = new StraightChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(5, CardSuit.CLUB)});
        assertTrue(straightChecker.check(pokerHand));
    }
}
