import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<r6> itemshop = new ArrayList<>();
        Random r = new Random();


        int lowerBound = 1000000;
        int upperBound = 2500000;
        
        double wallet = r.nextInt(lowerBound, upperBound);


        itemshop.add(new skin("Aquarium Ace", 50000, 15));
        itemshop.add(new skin("Ash Elite", 60000, 10));
        itemshop.add(new skin("Doc Rick", 75000, 5));
        itemshop.add(new skin("Iana Elite", 90000, 3));
        itemshop.add(new skin ("Tachanka Elite", 100000, 2));

        itemshop.add(new Operator("Tachanka", 10000, 1));
        itemshop.add(new Operator("Blackbeard", 20000, 1));
        itemshop.add(new Operator("Sens", 30000, 1));
        itemshop.add(new Operator("Solis", 40000, 1));
        itemshop.add(new Operator("Azami", 50000, 1));
        itemshop.add(new Operator("Fenrir", 60000, 1));
        itemshop.add(new Operator("EARLY ACCESS RAUORA", 200000, 1));

        itemshop.add(new Map("Oregon", 200000, 1));
        itemshop.add(new Map("Chalet", 300000, 1));
        itemshop.add(new Map("Plane", 500000, 1));

        itemshop.add(new Currency("Renown", 1000, 999));
        itemshop.add(new Currency("Siege Credits", 1500, 999));

        Scanner sc = new Scanner(System.in);
        
        
            System.out.println("Buy as much as you want, but be careful! You could go over the card limit and make your mom angry.");
            System.out.println(wallet);
            while (true) {
            for(int i = 0; i < itemshop.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + itemshop.get(i).getName() + " which is a " + 
            itemshop.get(i).getClass() + " and is $" + itemshop.get(i).getCost() + ". you can buy " + 
            itemshop.get(i).getAmount() + " of these");
        }
        int item = whatubuy(sc, itemshop);
        r6 thing = itemshop.get(item - 1);
        System.out.println("Are you sure you wish to buy " + thing.getName() + "?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int choice = sc.nextInt();
        if(choice == 1) {
        System.out.println("How much would you like to buy? You can get " + thing.getAmount() + " of these");
        int quantity = sc.nextInt(); 
        sc.nextInt(quantity);
        double number = quantity * thing.getCost();
        System.out.println(number);
        }
        }
}

    public static int whatubuy(Scanner sc, ArrayList<r6> itemshop) {
        int item = sc.nextInt();
        if (item < 1 || item > itemshop.size()) {
            System.out.println("You can't buy something that's not there dummy.");
            return whatubuy(sc, itemshop);
        }
        return item;
    }
}