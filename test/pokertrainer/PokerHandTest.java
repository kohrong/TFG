package pokertrainer;

import org.junit.Test;
import static org.junit.Assert.*;


public class PokerHandTest {
    
    public PokerHandTest() {
    }
    
    @Test
    public void pokerHandSize() throws Card.Exception{
        Deck deck = new Deck();
        PokerHand pokerHand = deck.createPokerHand();
        assertTrue(pokerHand.getSize() == 5);
    }
    
    @Test
    public void pokerHandCategoryIsHighCard() throws Card.Exception{
        PokerHand pokerHand = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)});
        assertTrue("High card".equals(pokerHand.getHandCategory().toString()));
    }
}
