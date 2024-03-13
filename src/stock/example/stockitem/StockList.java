package stock.example.stockitem;

import java.util.ArrayList;

public class StockList {
    private ArrayList<StockItem> warehouse;

    public StockList() {
         warehouse = new ArrayList<StockItem>();
    }

    public void addStockItem(StockItem stockItem){
        warehouse.add(stockItem);
    }

    public int noOfStockItem(){
        return warehouse.size();
    }

    public void removeItem(int index){
        if(index>=0 && warehouse.size() > index ){
            warehouse.remove(index);
        }
    }

    public void showAllItems(){

        for (StockItem stockItem : warehouse) {
            System.out.println(stockItem.toString());
        }
    }

    public String getAllItems(){
        String s = "";
        for (StockItem stockItem : warehouse) {
            s+= stockItem.toString()+" \n";
        }
        return  s;
    }

    public StockItem getItem(String description){
        for (StockItem stockItem : warehouse) {
            if(stockItem.getDescription().equals(description))
                return  stockItem;
        }
        return null;
    }

    public StockItem getItem(int index){
        if(index >=0 && index < warehouse.size())
            return warehouse.get(index);
        return null;
    }
    public void createNewStockItem(String description, int level, double price){
        StockItem tempStockItem = new StockItem(description,level,price);
        addStockItem(tempStockItem);
    }

}
