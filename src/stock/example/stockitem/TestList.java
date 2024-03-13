package stock.example.stockitem;

public class TestList {

    public static void main(String[] args) {
        StockList stockList = new StockList();
        stockList.createNewStockItem("Baked beans 415g",15,65);
        stockList.createNewStockItem("Bread",7, 89);
        stockList.createNewStockItem("Eggs (box of 6)",10,175);
        //stockList.showAllItems();

        System.out.println(stockList.getAllItems());
    }
}
