package stock.example.stockitem;

public class Tester2 {
    public static void main(String[] args) {
        StockItem beans = new StockItem("Baked beans 415g",15,65);
        StockItem bread = new StockItem("Bread",7, 89);
        StockItem  eggs= new StockItem("Eggs (box of 6)",10,175);
        bread.setPrice(99);
        beans.doDelivery(10);
        eggs.doSale(3);
        System.out.println(beans.toString());
        System.out.println(eggs.toString());
        System.out.println(bread.toString());


    }
}
