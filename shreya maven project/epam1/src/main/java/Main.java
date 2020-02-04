import gifts.*;
import sweets.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Sweet l1=new Ladoo("X",120,80,"Besan");
        Sweet l2=new Ladoo("Y",110,70,"Boondi");
        Sweet l3=new Ladoo("Z",100,50,"MotiChoor");

        Sweet b1=new Barfi("A",200,50,"Badam");
        Sweet b2=new Barfi("B",250,60,"Chocolate");


        Gift gifts=new Gift();
        gifts.add(l1);
        gifts.add(l2);
        gifts.add(l3);

        gifts.add(b1);
        gifts.add(b2);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());

    }
}