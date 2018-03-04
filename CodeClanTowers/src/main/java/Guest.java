public class Guest {

    private String name;
    private int duration;
    private double bill;

    public Guest(String name) {
        this.name = name;
        this.duration = 0;
        this.bill = 0;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}
