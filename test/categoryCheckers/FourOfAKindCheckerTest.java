package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class FourOfAKindCheckerTest {
    
    public FourOfAKindCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        FourOfAKindChecker fourOfAKindChecker = new FourOfAKindChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(fourOfAKindChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFourOfAKind() throws Card.Exception{
        FourOfAKindChecker fourOfAKindChecker = new FourOfAKindChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(1, CardSuit.SPADE), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(fourOfAKindChecker.check(pokerHand));
    }
    
}
