package pokertrainer;

import pokerCategory.HandCategory;
import pokerHandSorter.PokerHandSorter;

public final class PokerHand implements Hand, Comparable<PokerHand>{
    
    private Card[] cards = new Card[5];
    private final HandCategory handCategory;

    public PokerHand(Card[] cards) {    
        this.cards = cards;
        handCategory = getHandCategory();
        PokerHandSorter pokerHandSorter = new PokerHandSorter();
        pokerHandSorter.sort(cards);  
        this.cards = pokerHandSorter.getCards();
        checkSpecialStraigth();
    }

    public int getSize(){
        return cards.length;
    }

    public Card getCard(int i) {
        return cards[i];
    }

    public Card[] getCards() {
        return cards;
    }

    public HandCategory getHandCategory() {
        for (HandCategory handCategoryKind : HandCategory.HandCategories)
            if (handCategoryKind.check(this)) return handCategoryKind;
        return null;
    }
    
    public int getCategoryRank(){
        return handCategory.categoryRank(this);
    }

    public void setCards(Card[] cardsInOrder) {
        this.cards = cardsInOrder;
    }

    @Override
    public int compareTo(PokerHand o) {
        return 0;
    }

    private void checkSpecialStraigth() {
        if(handCategory == HandCategory.Straight || handCategory == HandCategory.StraightFlush){
            if(cards[0].isAce() && cards[1].getNumber() == 5){
                Card card = cards[0];
                for (int i = 0; i < cards.length-1; i++) {
                    cards[i] = cards[i+1];
                }
                cards[4] = card;
            }
        }
    }
}
