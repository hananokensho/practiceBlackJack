package ex_04;

public class Main {
    public static void main(String[] args) {
        //EX04_01
        int [] points = new int[4];
        double[] weights = new double[5];
        boolean[]  answers = new boolean[3];
        String [] names = new String[3];

        //EX04_02
        int[] moneyList = {121902 , 8302 , 55100};
        for(int i = 0 ; i < moneyList.length; i++){
            System.out.println(moneyList[i]);
        }

        for(int i : moneyList){
            System.out.println(i);
        }

        //EX04_03

        // nullpointerexception
        //　存在しない配列の要素を出そうとしているから

        // EX04_04

        int[] numbers = {3,4,9};
        System.out.print("一桁の数字を入力してください > ");
        int input = new java.util.Scanner(System.in).nextInt() ;
        for(int i : numbers){
            if(i == input){
                System.out.println("アタリ！");
            }else{
                System.out.println("ハズレ！");
            }
        }
    }
}
