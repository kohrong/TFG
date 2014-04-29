package pokertrainer;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;
import pokerCategory.HandCategory;


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

    @Test
    public void pokerHandListSort() throws Card.Exception {
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        final PokerHand pokerHand1 = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(7, CardSuit.CLUB), new Card(4, CardSuit.CLUB),
            new Card(7, CardSuit.DIAMOND)});
        final PokerHand pokerHand2 = new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB),
            new Card(7, CardSuit.DIAMOND)});
        pokerHandList.add(pokerHand1);
        pokerHandList.add(pokerHand2);
        Collections.sort(pokerHandList);
        assertTrue(pokerHandList.get(0).equals(pokerHand2));
    }
    
    @Test
    public void testSortByCategory() throws Card.Exception {
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        
        Collections.sort(pokerHandList);
        
        assertTrue(pokerHandList.get(0).getHandCategory() == HandCategory.OnePair);
        assertTrue(pokerHandList.get(1).getHandCategory() == HandCategory.HighCard);
        assertTrue(pokerHandList.size() == 2);
    }
    
    @Test
    public void testSortByCardRank() throws Card.Exception {
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(7, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        
        Collections.sort(pokerHandList);
        assertTrue(pokerHandList.get(0).getCard(0).isAce());
        assertTrue(pokerHandList.get(1).getCard(0).getNumber() == 7);
        assertTrue(pokerHandList.get(0).getHandCategory() == HandCategory.OnePair);
        assertTrue(pokerHandList.get(1).getHandCategory() == HandCategory.OnePair);
    }
}
