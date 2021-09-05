package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Deck {
    private List<Card> card = new ArrayList<>();
    public Deck(){
        for(int i = 1; i <= 4; i++){
            if(i == 1){
                for(int j = 1 ; j <= 13; j++){
                    this.card.add(new Card("ハート" , j));
                }
            }if(i == 2){
                for(int j = 1 ; j <= 13; j++){
                    this.card.add(new Card("ダイヤ" , j));
                }
            }if(i == 3){
                for(int j = 1 ; j <= 13; j++){
                    this.card.add(new Card("スペード" , j));
                }
            }if(i == 4){
                for(int j = 1 ; j <= 13; j++){
                    this.card.add(new Card("クローバー" , j));
                }
            }
        }
        for(Card c : card){
            if(c.getNum() > 10){
                c.setNum(10);
            }
        }
        Collections.shuffle(card);
    }

    public Card Draw(){
        return this.card.get(0);
    }

    public void deletion(){
        this.card.remove(0);
    }

}
