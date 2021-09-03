package ex_11;

public class IntangibleAsset extends Asset{
    String expiration_date;

    public IntangibleAsset(String name , int price , String expiration_date ){
        super(name ,price);
        this.expiration_date = expiration_date;
    }



}
