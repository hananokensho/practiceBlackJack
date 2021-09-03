package rockPaperScissors;

import java.util.Scanner;

public class Decision {
    private String playerMySignal;
    private String pairMySignal;

    public Decision(String playerMySignal, String pairMySignal) {
        this.pairMySignal = pairMySignal;
        this.playerMySignal = playerMySignal;
    }

    public String decisionResult() {
        if (playerMySignal.equals((pairMySignal))) {
            return "あいこ";
        } else if ((playerMySignal.equals("1")) && (pairMySignal.equals("2")) ||
                (playerMySignal.equals("3")) && (pairMySignal.equals("1")) ||
                (playerMySignal.equals("2")) && (pairMySignal.equals("3"))) {
            return "勝ち";
        } else if ((playerMySignal.equals("3")) && (pairMySignal.equals("2")) ||
                (playerMySignal.equals("2")) && (pairMySignal.equals("1")) ||
                (playerMySignal.equals("1")) && (pairMySignal.equals("3"))) {
            return "負け";
        }
        return "測定不能";
    }

    public boolean winOrLoseDecision(String decisionResult, Pair pair) {
        if (decisionResult.equals("あいこ")) {
            return drawProcess(pair);
        } else if (decisionResult.equals("勝ち")) {
            return true;
        }
            return false;

    }

    // あいこの場合勝敗がつくまで繰り返す
    public boolean drawProcess(Pair pair) {
        Scanner sc = new Scanner(System.in);
        boolean winOrLoseDecision = false;
        boolean winUntil = false;
        while (!winUntil) {
            System.out.print("あいこでっ > ");
            //　プレイヤーのシグナル
            String playerSignal = sc.nextLine();
            Player player = new Player(playerSignal);
            // 相手のシグナルをランダムで生成
            pair.setMySignal();
            // 判定
            Decision decision = new Decision(player.getMySignal(), pair.getMySignal());
            String decisionResult = decision.decisionResult();
            if(decisionResult.equals("勝ち")){
                winUntil = true;
                winOrLoseDecision = true;
            }else if (decisionResult.equals("負け")){
                winUntil = true;
                winOrLoseDecision = false;
            }
        }
        if(winOrLoseDecision){
            return true;
        }
        return false;
    }

}


