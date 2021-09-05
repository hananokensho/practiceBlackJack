package oldMaidGame;

public class Card {
    private String simbol;
    private int num;

    public Card(String simbol , int num){
        this.simbol = simbol;
        this.num = num;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public Card(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
