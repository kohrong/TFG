package table;

import pokertrainer.Card;

public class Board {
   private Card[] flop = new Card[3];
   private Card turn;
   private Card river;

    public Board(Card[] flop, Card turn, Card river) {
        this.flop = flop;
        this.turn = turn;
        this.river = river;
    }

    public Board(Card[] flop, Card turn) {
        this.flop = flop;
        this.turn = turn;
    }

    public Board(Card[] flop) {
        this.flop = flop;
    }

    public Card[] getFlop() {
        return flop;
    }

    public Card getTurn() {
        return turn;
    }

    public Card getRiver() {
        return river;
    }
    
}
