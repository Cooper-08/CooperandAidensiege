class Currency extends r6 {

    public Currency(String name, int cost, int amount) {
        super(name, cost, amount);

        if (IsOnSale == true) {
            cost = cost - saleprice;
            
        }
    }

}