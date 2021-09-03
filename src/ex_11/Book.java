package ex_11;

public class Book extends TangibleAsset{

    String isbn;

    public Book(String name , int price , String color , String isbn , double weight){
        super(name ,price , color ,weight);
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }


}
