package ex_10;

public class PoisonMatango extends  Matango{
    int poisonCount = 5;

    public PoisonMatango(char suffix){
        super(suffix);
    }

    public void attack(Hero h){
        super.attack(h);
        System.out.println("更に毒の胞子をばらまいた");
        int damage = h.hp / 5;
        h.hp -= damage;
        System.out.println(h.name + "更に" + damage + "のダメージを与えた");
        poisonCount--;
    }


}
