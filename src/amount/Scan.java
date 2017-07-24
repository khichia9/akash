package amount;

import java.util.Scanner;

public class Scan
{
    int itemId;
    String name;
    float price;
    Scanner s= new Scanner(System.in);
    Item i[]=new Item[10];
    int no=0;
    public Item[] scanItem()
    {
        do
        {
            System.out.println("Select item and quantity");
            System.out.println("1.Cloth\n2.Toy\n3.Done");
            itemId=s.nextInt();
            switch(itemId)
            {
                case 1:
                    readDetails();
                    Cloth c=new Cloth(name,price);
                    i[no]=c;
                    no++;
                    break;
                case 2:
                    readDetails();
                    Toy t= new Toy(name,price);
                    i[no]=t;
                    no++;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        }while(itemId!=3);
    return i;
    }
    void readDetails()
    {
        System.out.println("Enter name and price");
        name=s.next();
        price=s.nextFloat();

    }
    public int getQuantity()
    {
        return no;
    }


}
