package ex_11;

public abstract class TangibleAsset extends Asset implements Thing{

    String color;
    double weight;

    public TangibleAsset(String name , int price , String color , double weight){
        super(name , price);
        this.color = color;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColor(){
        return this.color;
    }

    public void setWeight(double w){
        this.weight = w;
    }

    public double getWeight(){
        return this.weight;
    }

}
