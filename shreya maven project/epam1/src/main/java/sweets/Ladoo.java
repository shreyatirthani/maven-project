package sweets;

public class Ladoo extends Sweet
{
    String type;

    public Ladoo(String name,int price,int weight,String type)
    {
        super(name,price,weight);
        this.type=type;
    }
}
