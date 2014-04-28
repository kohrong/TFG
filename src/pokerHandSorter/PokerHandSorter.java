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
        int maxValueIndex;    
        for (int i = 0; i < countOfEachCard.size(); i++){
            maxValueIndex = i;
            for (int j = i+1; j < countOfEachCard.size(); j++) {
                    if(countOfEachCard.get(maxValueIndex) < countOfEachCard.get(j))
                    maxValueIndex = j;
                    else if(countOfEachCard.get(maxValueIndex) == countOfEachCard.get(j)){
                        if(valueOfCards.get(maxValueIndex) < valueOfCards.get(j))
                            maxValueIndex = j;
                    }
            }
            exchangeIndexes(maxValueIndex, i);       
        }
    }

    private void exchangeIndexes(int maxValueIndex, int i) {
        int countOfACard;
        int valueOfACard;
        countOfACard = countOfEachCard.get(i);
        countOfEachCard.set(i, countOfEachCard.get(maxValueIndex));
        countOfEachCard.set(maxValueIndex, countOfACard);

        valueOfACard = valueOfCards.get(i);
        valueOfCards.set(i, valueOfCards.get(maxValueIndex));
        valueOfCards.set(maxValueIndex, valueOfACard);
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
