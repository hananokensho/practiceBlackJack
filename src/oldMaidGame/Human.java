package oldMaidGame;

import java.util.ArrayList;
import java.util.List;

public abstract class Human {
    private List <Card> myCardList = new ArrayList<>();

    public List<Card> getMyCardList() {
        return myCardList;
    }

    public void setMyCardList(Card myCardList) {
        this.myCardList.add(myCardList);
    }
}

