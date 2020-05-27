public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private double bill;


    public Booking(Bedroom bedroom, int numberOfNights, double bill) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.bill = bill;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public double getBill() {
        return this.bill;
    }
}
