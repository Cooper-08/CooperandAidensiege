import java.util.Random;

 class r6 {


    String name;
    
    
    public String getName() {
        return name;
    }

    public int cost;
    int amount;

    public double getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public int getDiscount() {
        return discount;
    }

    Random r = new Random();
    boolean IsOnSale = false;

    int saleprice = r.nextInt(30);
    int money = r.nextInt(1000000);

    public r6(String name, int cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.discount = discount;
        
    }

}









