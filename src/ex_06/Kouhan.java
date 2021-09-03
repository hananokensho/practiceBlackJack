package ex_06;
import java.lang.Thread;

public class Kouhan {
    public static void callDeae(){
        System.out.println("ええいこしゃくなくせ者だ");
    }

    public static void showMondokoro() throws Exception{
        System.out.println("助さん格さんもういいでしょう");
        System.out.println("この紋所が目に入らぬか");
        Thread.sleep(3000);
        ex_06.Zenhan.doTogame();
    }
}
