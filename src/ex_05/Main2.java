package ex_05;

public class Main2 {

    public void introduceOneself(){
        String name = "ミナト";
        int age = 22;
        double height = 167;
        char c = '丑';

        System.out.println(name + age + height + c);
    }

    public void email(String title , String address , String text){
        System.out.println(address + "に以下のメールをお送りしました");
        System.out.println("件名：" + title);
        System.out.println("本文:" + text);
    }

    public void email(String address , String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

    public double calcTriangleArea(double bottom , double height){
        return bottom * height / 2;
    }

    public double calcCircleArea(double radius){
        return radius * radius * 3.14;
    }

}
