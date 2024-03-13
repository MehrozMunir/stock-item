package stock.example.stockitem;

public class StockItem {
    private java.lang.String description;
    private int level;
    private double price;
    private Date sellByDate;


    public StockItem(String description, int level, double price) {
        this.description = description;
        this.level = level;
        this.price = price;
        sellByDate = new Date(21,02,2024);
    }

    public StockItem(String description, int level, double price, int day, int month, int year) {
        this.description = description;
        this.level = level;
        this.price = price;
        this.sellByDate = new Date(day,month,year);
    }
/*
    public void printReport(){
        System.out.println("**********Stock Report*********\n"+
                           "*  Item:      "+description+"\n"+
                           "*  Price:     "+price+"\n"+
                           "*  Stock level: "+level);;
    }*/

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void doDelivery(int amount){
        level = level+amount;
    }
    public void doSale(int amount){
        level = level - amount;
    }

    public int getLevel() {
        return level;
    }
    public String getDescription() {
        return description;
    }
    public void setSellByDate(int day, int month, int year) {
        this.sellByDate = new Date(day,month,year);
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "description='" + description + '\'' +
                ", level=" + level +
                ", price=" + price +
                ", sellByDate=" + sellByDate.getAsString() +
                '}';
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
