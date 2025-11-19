public class Customer {
    private int customerId;
    private char pickUp;
    private char drop;
    int pickTime;

    Customer(int id,char pickUp,char drop,int pickTime){
        this.customerId = id;
        this.pickUp = pickUp;
        this.drop = drop;
        this.pickTime = pickTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public char getDrop() {
        return drop;
    }

    public char getPickUp() {
        return pickUp;
    }

    public int getPickTime() {
        return pickTime;
    }
}
