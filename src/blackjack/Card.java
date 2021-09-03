package blackjack;

public class Card {
    private String category;
    private int num;

    public Card(String category , int num){
        this.category = category;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
