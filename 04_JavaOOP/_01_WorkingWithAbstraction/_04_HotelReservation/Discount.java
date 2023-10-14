package _04_JavaOOP._01_WorkingWithAbstraction._04_HotelReservation;

public enum Discount {
    VIP(0.8),
    SecondVisit(0.9),
    None(1.0);

    private double percentage;

    Discount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return this.percentage;
    }
}
