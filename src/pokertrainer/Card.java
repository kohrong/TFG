package pokertrainer;

public class Card implements Comparable<Card>{
    private final char[] NAMES = new char[] {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    
    private final byte number;
    private final CardSuit suit;

    public Card(char name, CardSuit suit) throws Exception {
        this.number = findName(name);
        this.suit = suit;
    }
    
    public Card(int number, CardSuit suit) throws Exception {
        this.number = checkNumber(number);
        this.suit = suit;
    }
    
    public int getNumber() {
        return number;
    }
    
    public int getValue() {
        if (isAce()) return NAMES.length + 1;
        return number;
    }
    
    public char getChar() {
        return NAMES[number-1];
    }

    public CardSuit getSuit() {
        return suit;
    }
    
    public boolean isAce() {
        return number == 1;
    }
    
    public boolean isSameSuit(Card card) {
        return card.suit == suit;
    }
    
    public boolean isConnected(Card card) {
        if (card.number == number) return false;
        if (card.isAce() && card.isConnectedAsOne(this)) return true;
        if (this.isAce() && this.isConnectedAsOne(card)) return true;
        return Math.abs(getValue() - card.getValue()) < 5;
    }
    
    private byte findName(char name) throws Exception {
        for (int i = 0; i < NAMES.length; i++)
            if (NAMES[i] == name) return (byte) (i + 1);
        throw new Exception();
    }
    
    private byte checkNumber(int number) throws Exception {
        if ((number > 0) && (number <= NAMES.length)) return (byte) number;
        throw new Exception();        
    }

    private boolean isConnectedAsOne(Card card) {
        return card.getValue() < 6;
    }

    public boolean isSameNumber(Card deckCard) {
        return deckCard.getNumber() == number;
    }

    public boolean isSameCard(Card deckCard) {
        return (this.isSameNumber(deckCard) && this.isSameSuit(deckCard));
    }

    @Override
    public int compareTo(Card o) {
        if(this.getValue() > o.getValue())  return -1;
        if(this.getValue() == o.getValue()) return 0;
        return 1;
    }

    public class Exception extends java.lang.Exception {

        public Exception() {
            
        }
    }
    
    
}
