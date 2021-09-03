package ex_10;

public class Main {
    public static void main(String[] args) {

        Matango m = new Matango('B');
        PoisonMatango pm = new PoisonMatango('A');
        Hero h = new Hero("ミナト" , 100);
        m.attack(h);
        System.out.println(h.hp);
        pm.attack(h);
        System.out.println(h.hp);

    }
}

//EX10_01
// ②③⑤
//EX10_02
/*
ア　連絡手段
イ　スマートフォン
ゥ　移動手段
エ　エコカー
オ　書物
カ　英語辞典
 */
