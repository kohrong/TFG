package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class ThreeOfAKindCheckerTest {
    
    public ThreeOfAKindCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        ThreeOfAKindChecker threeOfAKindChecker = new ThreeOfAKindChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(threeOfAKindChecker.check(pokerHand));
    }
    
    @Test
    public void testIsThreeOfAKind() throws Card.Exception{
        ThreeOfAKindChecker threeOfAKindChecker = new ThreeOfAKindChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(threeOfAKindChecker.check(pokerHand));
    }
    
    @Test
    public void testIsAFourOfAKind() throws Card.Exception{
        ThreeOfAKindChecker threeOfAKindChecker = new ThreeOfAKindChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(1, CardSuit.SPADE), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue(threeOfAKindChecker.check(pokerHand));
    }
    
}
