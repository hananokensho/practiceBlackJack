package rockPaperScissors;
import java.util.*;

public class Pair {
    List<String> pairSignal = Arrays.asList("1", "2", "3");
    private String mySignal;

    public void setMySignal(){
        Collections.shuffle(pairSignal);
        this.mySignal = pairSignal.get(1);
    }

    public String getMySignal() {
        return mySignal;
    }

}
