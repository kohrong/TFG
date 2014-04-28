package pokertrainer;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void testIterator() throws Card.Exception {
        Deck deck = new Deck();
        int index = 1;
        int suitIndex = 0;
        for (Card card : deck) {
            assertTrue(card.getNumber() == index++);
            assertTrue(card.getSuit() == CardSuit.SUITS[suitIndex]);
            if (index <= 13) continue;
            index = 1;
            suitIndex++;
        }
    }
    
    @Test
    public void testDeckSize() throws Card.Exception{
        Deck deck = new Deck();
        assertTrue(deck.getCardList().size() == 52);
    }
    
    @Test
    public void isCardInDeck() throws Card.Exception{
        Deck deck = new Deck();
        Card card = new Card(1, CardSuit.CLUB);
        assertTrue(deck.isInDeck(card));
    }
    
    @Test
    public void takeCard() throws Card.Exception{
        Deck deck = new Deck();
        
        assertTrue(deck.takeCard(1, CardSuit.CLUB).isSameCard(new Card(1, CardSuit.CLUB)));
        assertTrue(deck.getCardList().size() == 51);
        
        assertFalse(deck.isInDeck(new Card(1, CardSuit.CLUB)));
    }
    
    @Test
    public void takeRandomCard() throws Card.Exception{
        Deck deck = new Deck();
        
        Card card = deck.takeRandomCard();
        assertTrue(deck.getCardList().size() == 51);
        assertFalse(deck.isInDeck(card));
        
        Deck deck2 = new Deck();
        assertTrue(deck2.isInDeck(card));
    }
    
    @Test
    public void createPokerHand() throws Card.Exception{
        Deck deck = new Deck();
        PokerHand pokerHand = deck.createPokerHand();
        assertTrue(pokerHand.getSize() == 5);
    }
}
