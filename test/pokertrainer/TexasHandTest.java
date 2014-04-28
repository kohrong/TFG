package pokertrainer;

import org.junit.Test;
import static org.junit.Assert.*;

public class TexasHandTest {
    
    @Test
    public void testValues() throws Card.Exception{
        Card card = new Card(13, CardSuit.HEART);
        assertTrue(card.getValue()== 13);
        
        card = new Card('A', CardSuit.CLUB);
        assertTrue(card.getValue()== 14);
    }
    
    @Test
    public void testIsSuited() throws Card.Exception {
        assertTrue(new TexasHand(new Card(1, CardSuit.CLUB), new Card(2, CardSuit.CLUB)).isSuited());
        assertFalse(new TexasHand(new Card('J', CardSuit.SPADE), new Card('4', CardSuit.CLUB)).isSuited());
    }
    
    @Test
    public void testIsConnected() throws Card.Exception {
        assertTrue(new TexasHand(new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB)).isConnected());
        assertFalse(new TexasHand(new Card(4, CardSuit.CLUB), new Card('K', CardSuit.CLUB)).isConnected());
        assertTrue(new TexasHand(new Card('A', CardSuit.CLUB), new Card(5, CardSuit.HEART)).isConnected());
        assertTrue(new TexasHand(new Card('A', CardSuit.CLUB), new Card('T', CardSuit.HEART)).isConnected());        
    }
    
    @Test
    public void testIsPocketPair() throws Card.Exception {
        assertTrue(new TexasHand(new Card(5, CardSuit.CLUB), new Card('5', CardSuit.CLUB)).isPocketPair());
        assertFalse(new TexasHand(new Card(5, CardSuit.CLUB), new Card('K', CardSuit.CLUB)).isPocketPair());
    }
    
    public void testIsBroadway() throws Card.Exception {
        assertTrue(new TexasHand(new Card('A', CardSuit.CLUB), new Card('K', CardSuit.CLUB)).isPocketPair());
        assertFalse(new TexasHand(new Card(5, CardSuit.CLUB), new Card('5', CardSuit.CLUB)).isPocketPair());
    }
}
