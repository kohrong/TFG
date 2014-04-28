package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class OnePairCheckerTest {
    
    public OnePairCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        OnePairChecker onePairChecker = new OnePairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(onePairChecker.check(pokerHand));
    }
    
    @Test
    public void testIsPair() throws Card.Exception{
        OnePairChecker onePairChecker = new OnePairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(onePairChecker.check(pokerHand));
    }
    
    @Test
    public void testIsThreeOfAKind() throws Card.Exception{
        OnePairChecker onePairChecker = new OnePairChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(onePairChecker.check(pokerHand));
    }
}
