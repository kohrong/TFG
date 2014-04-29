package pokerHandSorter;

import java.util.ArrayList;
import pokertrainer.Card;

public class PokerHandSorter {
    ArrayList<Integer> valueOfCards;
    ArrayList<Integer> countOfEachCard;
    private Card[] cards = new Card[5];

    public PokerHandSorter() {
        valueOfCards = new ArrayList();
        countOfEachCard = new ArrayList<>();
    }

    public Card[] getCards() {
        return cards;
    }
        
    public void sort(Card[] cards) {
        makeTheCountOfEachValue(cards);
        sortListsByOcurrences();
        sortCardsByOcurrences(cards);
    }

    private void makeTheCountOfEachValue(Card[] cards) {
        boolean countingValue;
        
        for (Card card : cards) {
            countingValue = false;
            for (int j = 0; j < valueOfCards.size(); j++) {
                if(valueOfCards.get(j) == card.getValue()){
                    countOfEachCard.set(j, countOfEachCard.get(j)+1);
                    countingValue = true;
                }               
            }
            if(!countingValue){
                valueOfCards.add(card.getValue());
                countOfEachCard.add(1);
            }
        }
    }

    private void sortListsByOcurrences() {
        int maxCountIndex;    
        for (int i = 0; i < countOfEachCard.size(); i++){
            maxCountIndex = i;
            for (int j = i+1; j < countOfEachCard.size(); j++) {
                    if(countOfEachCard.get(maxCountIndex) < countOfEachCard.get(j))
                    maxCountIndex = j;
                    else if(countOfEachCard.get(maxCountIndex) == countOfEachCard.get(j)){
                        if(valueOfCards.get(maxCountIndex) < valueOfCards.get(j))
                            maxCountIndex = j;
                    }
            }
            exchangeIndexes(maxCountIndex, i);       
        }
    }

    private void exchangeIndexes(int maxCountIndex, int i) {
        int countOfACard;
        int valueOfACard;
        countOfACard = countOfEachCard.get(i);
        countOfEachCard.set(i, countOfEachCard.get(maxCountIndex));
        countOfEachCard.set(maxCountIndex, countOfACard);

        valueOfACard = valueOfCards.get(i);
        valueOfCards.set(i, valueOfCards.get(maxCountIndex));
        valueOfCards.set(maxCountIndex, valueOfACard);
    }

    private void sortCardsByOcurrences(Card[] cards) {
        ArrayList<Card> cardsSorted = new ArrayList<>();
        for (int i = 0; i < valueOfCards.size(); i++) {
            for (Card card : cards) {
                if(valueOfCards.get(i) == card.getValue())
                    cardsSorted.add(card);
            }  
        }
        Card[] cardsSortedAtArray = cardsSorted.toArray(new Card[cardsSorted.size()]);
        this.cards = cardsSortedAtArray.clone();
    }
    
}
