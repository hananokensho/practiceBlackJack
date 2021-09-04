package blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck(); //山札
        Player player = new Player(); //プレイヤー
        Dealer dealer = new Dealer(); //ディーラー（相手）
        Scanner sc = new Scanner(System.in);
        System.out.println("ブラックジャックゲーム");
        System.out.print("名前を入力してください >");
        player.setName(sc.nextLine());
        //はじめの2枚ドロー
        player.Draw(deck);
        dealer.Draw(deck);
        player.Draw(deck);
        dealer.Draw(deck);

        //　ディーラーは合計点が17より上になるまで引く
        boolean dealerPoint = false;
        while(!dealerPoint){
            if(dealer.totalPoint() < 17){
                dealer.Draw(deck);
            }else{
                dealerPoint = true;
            }
        }

        // プレイヤーがもう一枚引くかの判断
        boolean decision = false;
        while(!decision){
            System.out.println("ディーラーのカード1枚:" + dealer.myCard.get(0).getNum());
            for(int i = 1 ; i < player.myCard.size()+1; i++){
                System.out.println(player.getName() + "のカード"+ i + ":" + player.myCard.get(i-1).getNum());
            }
            System.out.print("もう一枚引くなら[ドロー]：引かないなら[判定]と入力してください >");
            String stringDecision = sc.nextLine();
            if(stringDecision.equals("ドロー")){
                player.Draw(deck);
            }else if (stringDecision.equals("判定")){
                decision = true;
            }else{
                System.out.println("正しい入力をしてください");
            }
        }

        //勝敗判定
        Decision decisiton = new Decision(player.totalPoint(), dealer.totalPoint()); //判定クラス
        System.out.println(decisiton.decisiton(player.totalPoint() , dealer.totalPoint() , player.getName()));
        if(player.totalPoint() == 21){
            System.out.println("おめでとうございます！ブラックジャックです！");
        }
        System.out.println(player.getName() + "のポイントは" + decisiton.getPlayerPoint() + "でした");
        System.out.println("ディーラーのポイントは" + decisiton.getDealerPoint() + "でした");
        System.out.println("終了します");
    }
}
