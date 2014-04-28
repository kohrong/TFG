package pokertrainer;

import java.util.ArrayList;
import java.util.Iterator;

public class Deck implements Iterable<Card> {

    private ArrayList<Card> cardList;

    public Deck() throws Card.Exception {
        cardList = new ArrayList<>();
        int index = 1;
        int cardIndex = 1;
        int suitIndex = 0;
        while(index <= 52){
            cardList.add(new Card(cardIndex++, CardSuit.SUITS[suitIndex]));
            index++;
            if(cardIndex <= 13) continue;
            cardIndex = 1;
            suitIndex++;
        }
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    @Override
    public Iterator<Card> iterator() {
        
        return new Iterator<Card>() {

            
            int index = 1;
            @Override
            public boolean hasNext() {
                return index <= cardList.size();
            }

            @Override
            public Card next() {
                return cardList.get(index++-1);
            }

            @Override
            public void remove() {
            }
        };
    }

    public boolean isInDeck(Card card) {
        for (Card deckCard : this){
            if(card.isSameCard(deckCard))
                return true;
        }    
        return false;
    }

    public Card takeCard(int number, CardSuit suit) throws Card.Exception {
        Card card = new Card(number,suit);
        if(isInDeck(card)){
            for (int i = 0; i < cardList.size(); i++) {
                if(card.isSameCard(cardList.get(i))){
                    cardList.remove(i);
                    return card;
                }
                
            }
        } 
        System.out.println("La carta no está en la baraja::Deck,takeCard()");
        return null;
    }
    
    public Card takeRandomCard(){
        int index = (new Double(Math.random() * 100).intValue()) % cardList.size();
        Card card = cardList.get(index);
        cardList.remove(index);
        return card;
    }
    
    public PokerHand createPokerHand(){
        Card[] cards = new Card[5];
        for (int i = 0; i < 5; i++) cards[i] = takeRandomCard();
        return new PokerHand(cards);
    }
}
