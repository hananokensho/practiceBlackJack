package ex_08;

public class Main {
    public static void main(String[] args) {
        Cleric c = new Cleric();
        System.out.println(c.name + "はMPを" + c.pray(2) + "回復した");
        c.selfAid();
    }
}


//  10  7 5