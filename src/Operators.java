class Operator extends r6 {

    public Operator(String name, int cost, int amount) {
        super(name, cost, amount);

        if (IsOnSale == true) {
            cost = cost - saleprice%cost;
        }
    }
}
 

