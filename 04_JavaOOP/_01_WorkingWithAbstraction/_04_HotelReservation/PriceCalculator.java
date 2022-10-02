package _04_JavaOOP._01_WorkingWithAbstraction._04_HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discount = discount;
    }

    public String returnPrice(){
        double pricePerDayWithSeason = this.pricePerDay*this.season.getPricePerDay();
        double totalPriceWithoutDiscount = pricePerDayWithSeason*this.numberOfDays;
        double totalPriceToPay = totalPriceWithoutDiscount*this.discount.getPercentage();
        return String.format("%.2f",totalPriceToPay);
    }
}
