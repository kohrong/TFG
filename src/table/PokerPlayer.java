package table;

import pokertrainer.PokerHand;
import pokertrainer.TexasHand;

public class PokerPlayer {
   private String name;
   private Stack stack;
   private TablePosition position;
   private TexasHand texasHand;
   private PokerHand pokerHand;

    public PokerPlayer(String name, Stack stack, TablePosition position) {
        this.name = name;
        this.stack = stack;
        this.position = position;
    }
   
   
}
