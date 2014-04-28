package pokerCategory;

import pokertrainer.PokerHand;

public abstract class HandCategory {
    public static final HandCategory HighCard = new HighCard("High card");
    public static final HandCategory OnePair = new OnePair("One pair");
    public static final HandCategory TwoPair = new TwoPair("Two pair");
    public static final HandCategory ThreeOfAKind = new ThreeOfAKind("Three of a kind");
    public static final HandCategory Straight = new Straight("Straight");
    public static final HandCategory Flush = new Flush("Flush");
    public static final HandCategory FullHouse = new FullHouse("Full House");
    public static final HandCategory FourOfAKind = new FourOfAKind("Four of a kind");
    public static final HandCategory StraightFlush = new StraightFlush("Straight flush");
    public static final HandCategory[] HandCategories = new HandCategory[] {StraightFlush, FourOfAKind, FullHouse, 
        Flush, Straight, ThreeOfAKind, TwoPair, OnePair, HighCard}; 
     
    public abstract boolean check(PokerHand pokerHand);
    @Override
    public abstract String toString();
    public int categoryRank(PokerHand pokerHand){
        for (int i = 0; i < HandCategories.length; i++) {
            if(pokerHand.getHandCategory() == HandCategories[i])
                return i;
        }
        return 0;
    }
}
