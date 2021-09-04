package blackjack;

import java.util.ArrayList;
import java.util.List;

public abstract class Human {
    List<Card> myCard = new ArrayList<>();

    public void Draw(Deck deck) {
        this.myCard.add(deck.Draw());
        deck.deletion();
    }

    public int totalPoint() {
        int totalPoint = 0;
        for (Card card : myCard) {
            totalPoint += card.getNum();
        }
        return totalPoint;
    }
}
