package rockPaperScissors;

public class Player {
    private String mySignal;

    public String getMySignal() {
        return mySignal;
    }

    public void setMySignal(String mySignal) {
        this.mySignal = mySignal;
    }

    public Player(String mySignal) {
        this.mySignal = mySignal;
    }
}
