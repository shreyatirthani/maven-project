package sweets;

public class Barfi extends Sweet
{
    String type;

    public Barfi(String name,int price,int weight,String type)
    {
        super(name,price,weight);
        this.type=type;
    }
}