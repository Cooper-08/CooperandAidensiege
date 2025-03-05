import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<r6> itemshop = new ArrayList<>();
        Random r = new Random();

        //the minimum and maximum amount of money you can have
        int lowerBound = 1500000;
        int upperBound = 3000000;
        double wallet = r.nextInt(lowerBound, upperBound);

        //boolean to check whether or not you have money left
        boolean rich = true;

        //array list for all the things in the item shop
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
        
            //starting line-instructions
            System.out.println("Buy as much as you want, but be careful! You could go over the card limit and make your mom crash out.");

            while (rich = true) {

            //prints out what you can buy, the cost, and the amount
            for(int i = 0; i < itemshop.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + itemshop.get(i).getName() + " which is a " + 
            itemshop.get(i).getClass() + " and is $" + itemshop.get(i).getCost() + ". you can buy " + 
            itemshop.get(i).getAmount() + " of these");
        }
        int item = whatubuy(sc, itemshop);
        r6 thing = itemshop.get(item-1);

        //clarifying whether or not you wish to make the purchase
        System.out.println("Are you sure you wish to buy " + thing.getName() + "?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int choice = sc.nextInt();

        //if you choose to buy something, the code brings you to the section where you choose the amount
        if(choice == 1) {
        System.out.println("How much would you like to buy? You can get " + thing.getAmount() + " of these");
        int quantity = sc.nextInt(); 

        //the code takes your input for how much you would like to buy and multiplies it by its cost
        int thing2 = thing.buy(quantity);
        double number = thing2 * thing.getCost();
        System.out.println("Sorry we are now out of stock on that item. You spent $" + number);

        //subtracts the amount spent from your wallet and subtracts the amount bought from what is in stock
        wallet = wallet-number;
    
    
        }
        
        //if you spend more than what you have you lose. P.S you don't know how much you have
        if(wallet < 0) {
            System.out.println("Haha Stupid Idiot. You went over the limit and now your mom will beat you");
            break;
        }
        }
        
    }

        //checks what you're buying and whether or not it's an available item
    public static int whatubuy(Scanner sc, ArrayList<r6> itemshop) {
        int item = sc.nextInt();
        if (item < 1 || item > itemshop.size()) {
            System.out.println("You can't buy something that's not there dummy.");
            return whatubuy(sc, itemshop);
        }
        return item;
    }

    

    
}

    