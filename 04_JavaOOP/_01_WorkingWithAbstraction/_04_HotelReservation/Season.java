package _04_JavaOOP._01_WorkingWithAbstraction._04_HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int pricePerDay;

    Season(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPricePerDay() {
        return this.pricePerDay;
    }

    /*
    public static Season fromString(String word){
        return Season.valueOf(seasonAsString.toUpperCase());
        
        return switch(word){
            case "Autumn" -> AUTUMN;
            case "Spring" -> SPRING;
            case "Winter" -> WINTER;
            case "Summer" -> SUMMER;
            
            default -> throw new IllegalArgumentException("just no");
        };
    }
    */
}
