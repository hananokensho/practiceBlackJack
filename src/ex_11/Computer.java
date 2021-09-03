package ex_11;

public class Computer extends TangibleAsset {

    String makerName;

    public Computer(String name , int price , String color , String makername , double weight){
        super(name , price , color , weight);
        this.makerName = makername;
    }

    public String getMakerName(){
        return this.makerName;
    }



}
