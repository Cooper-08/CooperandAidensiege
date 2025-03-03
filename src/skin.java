class skin extends r6 {

    public skin(String name, int cost, int amount) {
        super(name, cost, amount);

        if (IsOnSale == true) {
            cost = cost - saleprice;
        }
    }
}