package ex_08;

public class Cleric {
    String name;
    int hp;
    final int MAXHP = 50;
    int mp;
    final int MAXMP = 10;

    public void selfAid(){
        System.out.println("聖職者" + this.name + "はセルフエイドを唱えた" );
        System.out.println("HPがマックスになった");
        this.hp = MAXHP;
        this.mp -= 5;
    }

    public int pray(int sec){
        int quantity = new java.util.Random().nextInt(3) + sec;
        this.mp += quantity;
        if(this.mp >= MAXMP){
            int answer = MAXMP - this.mp;
            this.mp = MAXMP;
            return answer;
        }

        return quantity;
    }

}
