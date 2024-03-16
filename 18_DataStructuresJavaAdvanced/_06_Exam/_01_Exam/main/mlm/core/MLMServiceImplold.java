//package mlm.core;
//
//import mlm.models.Seller;
//
//import java.util.*;
//
//public class MLMServiceImplold implements MLMService {
//    private Map<String, Seller> sellersMap;
//    private List<Seller> sellersList;
//
//    public MLMServiceImplold() {
//        sellersMap = new HashMap<>();
//        sellersList = new ArrayList<>();
//    }
//
//    @Override
//    public void addSeller(Seller seller) {
//        if (this.sellersMap.containsKey(seller.id)) {
//            throw new IllegalArgumentException("Seller already exists");
//        }
//
//        this.sellersMap.put(seller.id, seller);
//        this.sellersList.add(seller);
//    }
//
//    @Override
//    public void hireSeller(Seller parent, Seller newHire) {
//        if (!exists(parent) || this.sellersMap.containsKey(newHire.id)) {
//            throw new IllegalArgumentException("Invalid parent or newHire already exists");
//        }
//
//        parent.addHire(newHire);
//        this.sellersMap.put(newHire.id, newHire);
//        this.sellersList.add(newHire);
//    }
//
//    @Override
//    public boolean exists(Seller seller) {
//        return this.sellersMap.containsKey(seller.id);
//    }
//
//    @Override
//    public void fire(Seller seller) {
//        if (!exists(seller)) {
//            throw new IllegalArgumentException("Seller does not exist");
//        }
//
//        Seller parent = seller.getParent();
//        if (parent != null) {
//            parent.removeHire(seller);
//            parent.addHires(seller.getHires());
//        }
//
//        this.sellersMap.remove(seller.id);
//        this.sellersList.remove(seller);
//    }
//
//    @Override
//    public void makeSale(Seller seller, int amount) {
//        int commission = (int) (amount * 0.05);
//        int amountLeft = amount;
//
//        Seller current = seller.getParent();
//        while (current != null) {
//            current.addEarnings(commission);
//            amountLeft -= commission;
//            current = current.getParent();
//        }
//
//        int earnings = amountLeft;
//        seller.addEarnings(earnings);
//    }
//
//    @Override
//    public Collection<Seller> getByProfits() {
//        List<Seller> sortedList = new ArrayList<>(this.sellersList);
//        sortedList.sort(Comparator.comparingInt(seller -> -seller.getEarnings()));
//        return sortedList;
//    }
//
//    @Override
//    public Collection<Seller> getByEmployeeCount() {
//        List<Seller> sortedList = new ArrayList<>(this.sellersList);
//        sortedList.sort(Comparator.comparingInt(seller -> -seller.getTotalEmployeeCount()));
//        return sortedList;
//    }
//
//    @Override
//    public Collection<Seller> getByTotalSalesMade() {
//        List<Seller> sortedList = new ArrayList<>(this.sellersList);
//        sortedList.sort(Comparator.comparingInt(seller -> -seller.getTotalSales()));
//        return sortedList;
//    }
//}
