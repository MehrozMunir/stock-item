package stock.example.stockitem;

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        StockItem  eggs= new StockItem("Eggs (box of 6)",10,175);
        System.out.println("How many boxes of eggs do you want?");
        eggs.setLevel(reader.nextInt());
        System.out.println(eggs.toString());

        }
}
