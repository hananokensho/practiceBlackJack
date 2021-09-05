package oldMaidGame;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Decision {

    public void firstDecision(List<Card> cardList) {
        boolean repeatFlag = false;
        while (!repeatFlag) {
            for (int i = 0; i < cardList.size(); i++) {
                for (int j = 0; j < cardList.size() ; j++) {
                    if (cardList.get(i).getNum() == cardList.get(j).getNum() &&
                        !cardList.get(i).getSimbol().equals(cardList.get(j).getSimbol())) {
                        cardList.remove(i);
                        cardList.remove(j);
                        continue;
                    }
                }
                continue;
            }
            Set<Card> list = new HashSet<>(cardList);
            if(list.size() == cardList.size()) {
                repeatFlag = true;
            }
        }
    }
}
