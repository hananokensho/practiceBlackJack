package oldMaidGame;

public class Player extends Human{

    public void show(){
        System.out.println("playerのカードリスト");
        for(int i = 0 ; i < getMyCardList().size(); i++){
            System.out.print((i + 1) + "枚目:" );
            System.out.println(getMyCardList().get(i).getNum() + " : " + getMyCardList().get(i).getSimbol());
        }
    }


}
