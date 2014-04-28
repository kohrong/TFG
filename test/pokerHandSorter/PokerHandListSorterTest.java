package pokerHandSorter;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import pokerCategory.HandCategory;
import pokertrainer.Card;
import pokertrainer.CardSuit;
import pokertrainer.PokerHand;

public class PokerHandListSorterTest {
    
    public PokerHandListSorterTest() {
    }

    @Test
    public void testSortByCategory() throws Card.Exception {
        ArrayList<PokerHand> pokerHandList = new ArrayList<>();
        PokerHandListSorter pokerHandListSorter = new PokerHandListSorter();
        
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(2, CardSuit.CLUB), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        pokerHandList.add(new PokerHand(new Card[]{new Card(1, CardSuit.CLUB), 
            new Card(1, CardSuit.DIAMOND), new Card(3, CardSuit.CLUB), new Card(4, CardSuit.CLUB), 
            new Card(7, CardSuit.DIAMOND)}));
        
        pokerHandListSorter.sort(pokerHandList);
        assertTrue(pokerHandList.get(0).getHandCategory() == HandCategory.OnePair);
        assertTrue(pokerHandList.get(1).getHandCategory() == HandCategory.HighCard);
        assertTrue(pokerHandList.size() == 2);
    }
}
