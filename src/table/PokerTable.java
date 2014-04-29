package table;

import java.util.ArrayList;
import pokertrainer.Deck;

public class PokerTable {
    private ArrayList<PokerPlayer> playerList;
    private int pot;
    private int street; //ENUM
    private Board board;
    private Deck deck;
    private int SB;
    private int BB;

    public PokerTable() {
    }
}
