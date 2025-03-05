class Map extends r6 {

    public Map(String name, int cost, int amount) {
        super(name, cost, amount);

        if (IsOnSale == true) {
            cost = cost - saleprice;
        }

    }

}