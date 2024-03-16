package mlm.core;

import mlm.models.Seller;

import java.util.*;
import java.util.stream.Collectors;

public class MLMServiceImpl implements MLMService {
    Map<String, Seller> sellers;

    public MLMServiceImpl() {
        this.sellers = new LinkedHashMap<>();
    }

    @Override
    public void addSeller(Seller seller) {
        if(this.sellers.containsKey(seller.id)){
            throw new IllegalArgumentException();
        }

        this.sellers.put(seller.id, seller);
    }

    @Override
    public void hireSeller(Seller parent, Seller newHire) {
        if(!this.sellers.containsKey(parent.id)){
            throw new IllegalArgumentException();
        }

        if(this.sellers.containsKey(newHire.id)){
            throw new IllegalArgumentException();
        }

        newHire.setParent(parent);
        this.sellers.put(newHire.id, newHire);
        this.sellers.get(parent.id).getChildren().add(newHire);
    }

    @Override
    public boolean exists(Seller seller) {
        return this.sellers.containsKey(seller.id);
    }

    @Override
    public void fire(Seller seller) {
        if(!this.sellers.containsKey(seller.id)){
            throw new IllegalArgumentException();
        }


        Set<Seller> children = this.sellers.get(seller.id).getChildren();

        Seller fired = this.sellers.get(seller.id);
        Seller parent = fired.getParent();

        if(parent != null){
            parent.getChildren().remove(fired);

            if(!children.isEmpty()){
                children.forEach(e -> e.setParent(parent));
            }
        }

        if(!children.isEmpty()){
            children.forEach(e -> e.setParent(parent));
        }

        this.sellers.remove(fired.id);
    }

    @Override
    public void makeSale(Seller seller, int amount) {
        int commission = (int) (amount * 0.05);
        int amountLeft = amount;

        Seller parent = seller.getParent();

        while(parent != null){
            parent.setEarnings(parent.getEarnings() + commission);
            amountLeft -= commission;
            parent = parent.getParent();
        }

        Seller npc = this.sellers.get(seller.id);

        npc.setEarnings(npc.getEarnings() + amountLeft);
        npc.setSalesCount(npc.getSalesCount() + 1);
    }

    @Override
    public Collection<Seller> getByProfits() {
        return this.sellers.values().stream().sorted(Comparator.comparing(Seller::getEarnings).reversed()).collect(Collectors.toList());
    }

    @Override
    public Collection<Seller> getByEmployeeCount() {
        return this.sellers.values().stream().sorted((e1, e2) -> {

            int e1Count = 0;
            Deque<Seller> e1Hires = new ArrayDeque<>(e1.getChildren());

            while(!e1Hires.isEmpty()){
                Seller poll = e1Hires.poll();
                e1Count++;
                e1Hires.addAll(poll.getChildren());
            }

            int e2Count = 0;
            Deque<Seller> e2Hires = new ArrayDeque<>(e2.getChildren());

            while(!e2Hires.isEmpty()){
                Seller poll = e2Hires.poll();
                e2Count++;
                e2Hires.addAll(poll.getChildren());
            }

            int cmp = Integer.compare(e2Count, e1Count);

            return cmp;
        }).collect(Collectors.toList());
    }

    @Override
    public Collection<Seller> getByTotalSalesMade() {
        return this.sellers.values().stream().sorted(Comparator.comparing(Seller::getSalesCount).reversed()).collect(Collectors.toList());
    }
}
