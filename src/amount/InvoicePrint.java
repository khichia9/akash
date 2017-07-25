package amount;

public class InvoicePrint {
    static public void printInvoice(Item items[]) {

        System.out.println("======================================================");
        System.out.println("\tName\t\tPrice\t\tGst Amount\t\tTotal Amount");
        float gstTotal = 0, priceTotal = 0;
        for (int i = 0; i < Scan.getQuantity(); i++) {
            items[i].show();
            System.out.print(items[i].gst_amount());
            System.out.println("\t" + (items[i].getPrice() + items[i].gst_amount()));
            gstTotal += items[i].gst_amount();
            priceTotal += items[i].getPrice();
        }
        System.out.println("Total GST Amount = " + gstTotal);
        System.out.println("Total Price = " + priceTotal);
        System.out.println("Total Bill = " + (gstTotal + priceTotal));
        System.out.println("======================================================");


    }
}
