package oldMaidGame;

public class Main {
    public static void main(String[] args) {
        // 判定クラス
        Decision decision = new Decision();
        Player player = new Player();
        Pair pair = new Pair();
        // Deckのフィールドにplayerとpairを初期化
        Deck deck = new Deck(player,pair);
        // 山札生成
        deck.cardGeneration();
        // playerとpairにカードを配る
        deck.dealCard();
        player.show();
        decision.firstDecision(player.getMyCardList());
//        decision.firstDecision(pair.getMyCardList());
        player.show();
//        pair.show();


    }
}
