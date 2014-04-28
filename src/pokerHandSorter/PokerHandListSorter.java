package pokerHandSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import pokertrainer.PokerHand;

public class PokerHandListSorter {

    public void sort(ArrayList<PokerHand> pokerHandList){
        sortByCategory(pokerHandList);
        sortByCardRank(pokerHandList);
    }

    private void sortByCategory(ArrayList<PokerHand> pokerHandList) {
            Collections.sort(pokerHandList, new Comparator<PokerHand>() {

            @Override
            public int compare(PokerHand o1, PokerHand o2) {
               if (o2.getCategoryRank() > o1.getCategoryRank())
                   return -1;
               else if (o2.getHandCategory() == o1.getHandCategory())
                   return 0;
               else
                   return 1;
            }
        });
    }

    private void sortByCardRank(ArrayList<PokerHand> pokerHandList) {
        //TO-DO, las pokerHands ya están ordenadas, hay que preguntar por los valores
    }
}
