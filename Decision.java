package blackjack;

public class Decision {
    private int playerPoint;
    private int dealerPoint;

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }

    public int getDealerPoint() {
        return dealerPoint;
    }

    public void setDealerPoint(int dealerPoint) {
        this.dealerPoint = dealerPoint;
    }

    public Decision(int playerPoint, int dealerPoint) {
        this.playerPoint = playerPoint;
        this.dealerPoint = dealerPoint;
    }

    public String decisiton(int playerPoint , int dealerPoint , String playerName){
        if((playerPoint > 21 && dealerPoint > 21) || (playerPoint == dealerPoint)){
            return "引き分け";
        }else if((playerPoint <= 21 && playerPoint > dealerPoint) || (dealerPoint > 21 && playerPoint <= 21)){
            return playerName + "の勝利！";
        }else if((dealerPoint <= 21 && dealerPoint > playerPoint) || (playerPoint > 21 && dealerPoint <= 21)){
            return playerName + "の負けです！";
        }
        return "判定不能です";

    }

}
