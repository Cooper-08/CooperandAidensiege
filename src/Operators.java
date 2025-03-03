
class Operator extends r6 {

    public Operator(String name, int cost, int amount) {
        super(name, cost, amount, discount);

        if (IsOnSale == true) {
            cost = cost - saleprice;
        }
    }
    @Override
    public void getCost() {
        if (isFriendly) {
            addHappyPoints(2);
        } else {
            System.out.println(getName() + " roars and scratches you!");
        }
        setIsFriendly();
    }
}

