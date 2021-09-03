package ex_zoho_01;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //数当てゲーム

        //重複無しのランダムな4桁の数字生成し配列に格納
        int[] array = new int[4];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < 10; i++){
            list.add(i);
        }
        Collections.shuffle(list);
        for(int i = 0 ; i < array.length; i++) {
            array[i] = list.get(i);
        }

        //回数カウント
        int count = 0;
        //フラグみたいな役割カウント
        int flag = 0;
        //表示用文字列配列
        String [] str2 = new String[4];

        while(flag < 4){
            //入力した４桁の数字を配列に格納
            int [] array2 = new int[4];
            System.out.print("4桁の数字を入力してください>");
            flag = 0;
            String str = sc.nextLine();
            for(int i = 0; i < array2.length; i++){
                array2[i] = Integer.parseInt(str.substring(i,i+1));
            }
            //チェック
            for(int i = 0; i < array2.length;i++){
                for(int j = 0; j < array.length; j++){
                    if(array[j] == array2[i] && i == j){
                        str2[i] = "○";
                        flag++;
                        break;
                    }else if(array[j] == array2[i]) {
                        str2[i] = "△";
                        break;
                    }
                    str2[i] = "☓";
                }
            }
            for(String str3 : str2){
                System.out.print(str3);
            }
            System.out.println("");
            count++;
        }

        if(flag == 4){
            System.out.println("正解です");
            System.out.println(count + "回目で成功しました");
        }
    }

}
