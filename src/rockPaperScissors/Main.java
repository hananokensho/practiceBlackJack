package rockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair();
        int totalCount = 0;
        System.out.println("[じゃんけんゲーム]");
        System.out.println("何回連続勝てるかな？");
        boolean continuous = false;
        while (!continuous) {
            System.out.println("1:[グー] 2:[チョキ] 3:[パー]のどれかの数字を入力してください。");
            System.out.print("最初はグー！じゃんけんっ > ");
            //　プレイヤーのシグナル
            Scanner sc = new Scanner(System.in);
//            String playerSignal = sc.nextLine();
            Player player = new Player(sc.nextLine());
            // 相手のシグナルをランダムで生成
            pair.setMySignal();
            // あいこ,勝ち,負けの判定
            Decision decision = new Decision(player.getMySignal(), pair.getMySignal());
            String decisionResult = decision.decisionResult();
            // あいこの場合は勝敗がつくまで繰り返す
            if(decision.winOrLoseDecision(decisionResult,pair)){
                totalCount++;
                System.out.println("勝ちました！");
                System.out.println("次の試合を始めます！");
            }else {
                System.out.println("負けました。残念。");
                continuous = true;
            }
        }
        System.out.println(totalCount + "回連続で勝ちました");
        System.out.println("終了します");
    }
}

