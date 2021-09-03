package ex_11;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("辞書" , 1000 , "赤色" , "A2344" , 135.6);
        Computer c = new Computer("Mac" , 150000 , "スペースグレイ" , "Apple" , 1498.5);
        Patent p = new Patent("特許権" , 35000, "令和⑤年5月⑤日");

        System.out.println("[本の紹介]");
        System.out.println("名前；" + b.name);
        System.out.println("値段；" + b.price + "円");
        System.out.println("色；" + b.color );
        System.out.println("商品番号；" + b.isbn);
        System.out.println("重さ；" + b.weight + "g");

        System.out.println("");

        System.out.println("[パソコンの紹介]");
        System.out.println("名前；" + c.name);
        System.out.println("値段；" + c.price + "円");
        System.out.println("色；" + c.color);
        System.out.println("商品番号；" + c.makerName);
        System.out.println("重さ；" + c.weight + "g");

        System.out.println("");

        System.out.println("[特許権の紹介]");
        System.out.println("名前；" + p.name);
        System.out.println("値段；" + p.price + "円");
        System.out.println("有効期限；" + p.expiration_date);
    }
}

//EX11_02
/*
ア　Asset
イ IntangibleAsset
ウ Patent
 */
