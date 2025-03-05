import java.util.Random;

 class r6 {


    String name;
    public int cost;
    public int amount;
    
    
    public String getName() {
        return name;
    }

    //returns cost of an item
    public double getCost() {
        return cost;
    }
    //returns amount for an item
    public int getAmount() {
        return amount;
    }
    //
  public int buy(int quantity){

    if(amount - quantity < 0) {
        int boughtAmount = amount; 
         amount = 0;
         return boughtAmount;
    } else {
         amount = amount - quantity;
         return quantity;
  }
}

    Random r = new Random();
    boolean IsOnSale = false;

    int saleprice = r.nextInt(30);
    int money = r.nextInt(1000000);

    public r6(String name, int cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        
    }

}









