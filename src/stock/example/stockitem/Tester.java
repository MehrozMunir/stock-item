package stock.example.stockitem;

public class Tester {
    public static void main(String[] args) {
        StockItem bob = new StockItem("Baked beans 415g",1,65, 30, 07,1991);
        bob.setPrice(23);
        System.out.println("done");
        System.out.println(bob.toString());
        bob.doDelivery(4);
        bob.doSale(1);
        System.out.println(bob.getLevel());
    }
}
