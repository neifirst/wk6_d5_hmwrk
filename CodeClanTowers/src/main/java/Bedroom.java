public class Bedroom extends Room {

    private double cost;


    public Bedroom(int roomNo, int capacity, double cost) {
        super(roomNo, capacity);
        this.cost = cost;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
