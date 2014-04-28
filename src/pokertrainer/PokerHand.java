package pokertrainer;

import pokerCategory.HandCategory;
import pokerHandSorter.PokerHandSorter;

public final class PokerHand implements Hand{
    
    private Card[] cards = new Card[5];
    private final HandCategory handCategory;

    public PokerHand(Card[] cards) {    
        this.cards = cards;
        handCategory = getHandCategory();
        PokerHandSorter pokerHandSorter = new PokerHandSorter();
        pokerHandSorter.sort(cards);
        this.cards = pokerHandSorter.getCards();
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
}
