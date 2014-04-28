package categoryCheckers;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class FullHouseCheckerTest {
    
    public FullHouseCheckerTest() {
    }

    @Test
    public void testCheck() throws Card.Exception {
        FullHouseChecker fullHouseChecker = new FullHouseChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertFalse(fullHouseChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFullHouse() throws Card.Exception{
        FullHouseChecker fullHouseChecker = new FullHouseChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(4, CardSuit.CLUB), 
            new Card(4, CardSuit.DIAMOND)});
        assertTrue(fullHouseChecker.check(pokerHand));
    }
    
    @Test
    public void testIsFourOfAKind() throws Card.Exception{
        FullHouseChecker fullHouseChecker = new FullHouseChecker();
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(1, CardSuit.HEART), new Card(1, CardSuit.CLUB), 
            new Card(4, CardSuit.DIAMOND)});
        assertFalse(fullHouseChecker.check(pokerHand));
    }
}
