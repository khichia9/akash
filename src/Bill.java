import amount.*;

/**
 * Created by Akash on 22/07/2017.
 */
public class Bill {
    public static void main(String args[])
    {
        Item[] items;
        //items = new Item[];
        Scan getItems=new Scan();
        int size;
        for (Item item : items = getItems.scanItem())
        {

        }
        //items.
        System.out.println(items[0].gst_amount());
        System.out.println("======================================================");
        System.out.println("\tName\t\tPrice\t\tGst Amount\t\tTotal Amount");
        float gstTotal=0,priceTotal=0;
        for(int i=0;i<getItems.getQuantity();i++)
        {
            items[i].show();
            System.out.print(items[i].gst_amount());
            System.out.println("\t"+(items[i].getPrice()+items[i].gst_amount()));
            gstTotal+=items[i].gst_amount();
            priceTotal+=items[i].getPrice();
        }
        System.out.println("Total GST Amount = "+gstTotal);
        System.out.println("Total Price = "+priceTotal);
        System.out.println("Total Bill = "+(gstTotal+priceTotal));
        System.out.println("======================================================");
//  items[1].show();
        //System.out.println(items.);
        
    }
}
