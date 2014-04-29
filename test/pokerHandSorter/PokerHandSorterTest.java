package pokerHandSorter;

import org.junit.Test;
import static org.junit.Assert.*;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;


public class PokerHandSorterTest {
    
    public PokerHandSorterTest() {
    }

    @Test
    public void testSortHighCard() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(5, CardSuit.CLUB),
            new Card(7, CardSuit.DIAMOND), new Card(10, CardSuit.CLUB)});
        
        assertTrue(pokerHand.getCard(0).isSameNumber(new Card(1, CardSuit.CLUB)));
    }
    
    @Test
    public void testSortOnePair() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(5, CardSuit.CLUB),
            new Card(7, CardSuit.DIAMOND), new Card(1, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).isAce());
        assertTrue(pokerHand.getCard(2).getNumber() == 7);
        assertTrue(pokerHand.getCard(3).getNumber() == 5);
        assertTrue(pokerHand.getCard(4).getNumber() == 3);
    }
    
    @Test
    public void testSortTwoPair() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(7, CardSuit.CLUB),
            new Card(7, CardSuit.DIAMOND), new Card(1, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).isAce());
        assertTrue(pokerHand.getCard(2).getNumber() == 7);
        assertTrue(pokerHand.getCard(3).getNumber() == 7);
        assertTrue(pokerHand.getCard(4).getNumber() == 3);
    }
    
    @Test
    public void testSortThreeOfAKind() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(7, CardSuit.CLUB),
            new Card(1, CardSuit.HEART), new Card(1, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).isAce());
        assertTrue(pokerHand.getCard(2).isAce());
        assertTrue(pokerHand.getCard(3).getNumber() == 7);
        assertTrue(pokerHand.getCard(4).getNumber() == 3);
    }
    
    @Test
    public void testSortStraight() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(6, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(2, CardSuit.CLUB),
            new Card(4, CardSuit.DIAMOND), new Card(5, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(4).getNumber() == 2);
        assertTrue(pokerHand.getCard(3).getNumber() == 3);
        assertTrue(pokerHand.getCard(2).getNumber() == 4);
        assertTrue(pokerHand.getCard(1).getNumber() == 5);
        assertTrue(pokerHand.getCard(0).getNumber() == 6);       
    }
    
    @Test
    public void testSortFlush() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(7, CardSuit.CLUB),
            new Card(5, CardSuit.CLUB), new Card(8, CardSuit.CLUB)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).getNumber() == 8);
        assertTrue(pokerHand.getCard(2).getNumber() == 7);
        assertTrue(pokerHand.getCard(3).getNumber() == 5);
        assertTrue(pokerHand.getCard(4).getNumber() == 3);
    }
    
    @Test
    public void testSortFullHouse() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(7, CardSuit.SPADE), new Card(7, CardSuit.CLUB),
            new Card(1, CardSuit.HEART), new Card(1, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).isAce());
        assertTrue(pokerHand.getCard(2).isAce());
        assertTrue(pokerHand.getCard(3).getNumber() == 7);
        assertTrue(pokerHand.getCard(4).getNumber() == 7);
    }
    
    @Test
    public void testSortFourOfAKind() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(1, CardSuit.CLUB), new Card(1, CardSuit.SPADE), new Card(7, CardSuit.CLUB),
            new Card(1, CardSuit.HEART), new Card(1, CardSuit.DIAMOND)});
        
        assertTrue(pokerHand.getCard(0).isAce());
        assertTrue(pokerHand.getCard(1).isAce());
        assertTrue(pokerHand.getCard(2).isAce());
        assertTrue(pokerHand.getCard(3).isAce());
        assertTrue(pokerHand.getCard(4).getNumber() == 7);
    }
    
    @Test
    public void testSortStraightFlush() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(6, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(2, CardSuit.CLUB),
            new Card(4, CardSuit.CLUB), new Card(5, CardSuit.CLUB)});
        
        assertTrue(pokerHand.getCard(4).getNumber() == 2);
        assertTrue(pokerHand.getCard(3).getNumber() == 3);
        assertTrue(pokerHand.getCard(2).getNumber() == 4);
        assertTrue(pokerHand.getCard(1).getNumber() == 5);
        assertTrue(pokerHand.getCard(0).getNumber() == 6);
    }
    
    @Test
    public void testSortSpecialStraightFlush() throws Card.Exception {
        PokerHand pokerHand = new PokerHand(new Card[] {new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(1, CardSuit.CLUB),
            new Card(4, CardSuit.CLUB), new Card(5, CardSuit.CLUB)});
        
        assertTrue(pokerHand.getCard(4).isAce());
        assertTrue(pokerHand.getCard(3).getNumber() == 2);
        assertTrue(pokerHand.getCard(2).getNumber() == 3);
        assertTrue(pokerHand.getCard(1).getNumber() == 4);
        assertTrue(pokerHand.getCard(0).getNumber() == 5);
    }
}
