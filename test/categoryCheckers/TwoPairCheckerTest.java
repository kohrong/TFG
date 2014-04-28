package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class TwoPairCheckerTest {
    
    public TwoPairCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        TwoPairChecker twoPairChecker = new TwoPairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(twoPairChecker.check(pokerHand));
    }
    
    @Test
    public void testIsTwoPair() throws Card.Exception{
        TwoPairChecker twoPairChecker = new TwoPairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(3, CardSuit.DIAMOND), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(twoPairChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFullHouse() throws Card.Exception{
        TwoPairChecker twoPairChecker = new TwoPairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(3, CardSuit.DIAMOND), 
            new Card(1, CardSuit.HEART)});
        assertTrue(twoPairChecker.check(pokerHand));
    }
    
    @Test
    public void testIsThreeOfAKind() throws Card.Exception{
        TwoPairChecker twoPairChecker = new TwoPairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(3, CardSuit.DIAMOND), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(twoPairChecker.check(pokerHand));
    }
    
}
