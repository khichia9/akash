package amount;

import java.util.Scanner;

/**
 * Created by Akash on 22/07/2017.
 */
public class Item
{
    float price;
    String name;
    public float gst_amount(){return 0;}
    public void show(){}
    public float getPrice(){return 0;}

}
class Cloth extends Item
{
    float price;
    static final int GST_RATE=5;
    String name;
    public void show()
    {
        System.out.print("\t"+name+"\t\t"+price+"\t\t");
    }
    Cloth(String name,float price)
    {
        this.name=name;
        this.price=price;


    }
    public float gst_amount()
    {
        return ((price * GST_RATE)/100);
    }
    public float getPrice(){return price;}
}
class Toy extends Item
{
    float price;
    static final int GST_RATE=12;
    String name;
    public void show()
    {
        System.out.print("\t"+name+"\t\t"+price+"\t\t");
    }
    Toy(String name,float price)
    {
        this.name=name;
        this.price=price;

    }
    public float gst_amount()
    {
        return ((price * GST_RATE)/100);
    }
    public float getPrice(){return price;}
}
