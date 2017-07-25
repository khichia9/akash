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
        //InvoicePrint invoice =new InvoicePrint();
        InvoicePrint.printInvoice(items);

    }
}
