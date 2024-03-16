//package mlm.models;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Sellerold {
//    public String id;
//    public int earnings;
//    private Seller parent;
//    private Set<Seller> hires;
//    private int totalSales;
//
//    public Sellerold(String id) {
//        this.id = id;
//        earnings = 0;
//        hires = new HashSet<>();
//        totalSales = 0;
//    }
//
//    public void addHire(Seller newHire) {
//        hires.add(newHire);
//        newHire.setParent(this);
//    }
//
//    public void addHires(Set<Seller> newHires) {
//        for (Seller newHire : newHires) {
//            addHire(newHire);
//        }
//    }
//
//    public void removeHire(Seller hire) {
//        hires.remove(hire);
//    }
//
//    public Set<Seller> getHires() {
//        return new HashSet<>(hires);
//    }
//
//    public Seller getParent() {
//        return parent;
//    }
//
//    public void setParent(Seller parent) {
//        this.parent = parent;
//    }
//
//    public void addEarnings(int amount) {
//        earnings += amount;
//    }
//
//    public int getEarnings() {
//        return earnings;
//    }
//
//    public int getTotalEmployeeCount() {
//        int count = hires.size();
//        for (Seller hire : hires) {
//            count += hire.getTotalEmployeeCount();
//        }
//        return count;
//    }
//
//    public int getTotalSales() {
//        int count = totalSales;
//        for (Seller hire : hires) {
//            count += hire.getTotalSales();
//        }
//        return count;
//    }
//
//    public void recordSale(int amount) {
//        totalSales += amount;
//    }
//}