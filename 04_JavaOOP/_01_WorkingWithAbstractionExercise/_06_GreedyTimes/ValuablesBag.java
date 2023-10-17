package _04_JavaOOP._01_WorkingWithAbstractionExercise._06_GreedyTimes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ValuablesBag {
    private List<Gold> gold;
    private List<Gem> gems;
    private List<Cash> cash;
    private long capacity;

    public ValuablesBag(long capacity){
        this.gold = new ArrayList<>();
        this.gems = new ArrayList<>();
        this.cash = new ArrayList<>();
        this.capacity = capacity;
    }

    public List<Gold> getGold() {
        return this.gold;
    }

    public List<Gem> getGems() {
        return this.gems;
    }

    public List<Cash> getCash() {
        return this.cash;
    }

    public long getGoldValue(){
        return this.gold.stream().mapToLong(Gold::getValue).sum();
    }

    public long getGemsValue(){
        return this.gems.stream().mapToLong(Gem::getValue).sum();
    }

    public long getCashValue(){
        return this.cash.stream().mapToLong(Cash::getValue).sum();
    }

    private long takenCapacity(){
        return this.getGoldValue() + this.getGemsValue() + this.getCashValue();
    }

    public void addGold(Gold gold){
        if (this.capacity >= this.takenCapacity() + gold.getValue()){
            this.gold.add(gold);
        }
    }

    public void addGems(Gem gem){
        if(this.capacity >= this.takenCapacity() + gem.getValue()){
            if(this.getGoldValue() >= this.getGemsValue() + gem.getValue()){
                boolean changed = false;
                
                for (Gem g : gems) {
                    if(g.getName().equals(gem.getName())){
                        g.setValue(g.getValue() + gem.getValue());
                        changed = true;
                        break;
                    }
                }
                
                if(!changed){
                    this.gems.add(gem);
                }
            }
        }
    }

    public void addCash(Cash cash){
        if(this.capacity >= this.takenCapacity() + cash.getValue()){
            if(this.getGemsValue() >= this.getCashValue() + cash.getValue()){
                boolean changed = false;
                for(Cash c : this.cash){
                    if(c.getName().equals(cash.getName())){
                        c.setValue(c.getValue() + cash.getValue());
                        changed = true;
                        break;
                    }
                }
                if(!changed) {
                    this.cash.add(cash);
                }
            }
        }
    }
    /*public String printValuablesBag(){
        StringBuilder sb = new StringBuilder();
        sb.append("<Gold> $").append(this.getGoldValue()).append(System.lineSeparator());
        sb.append("##Gold - $").append(this.getGoldValue()).append(System.lineSeparator());
        sb.append("<Gem> $").append(this.getGemsValue()).append(System.lineSeparator());
        this.gems.stream().sorted((a,b) -> Long.compare(b.getValue(),a.getValue())).forEach(sb::append);
        sb.append("<Cash> $").append(this.getCashValue()).append(System.lineSeparator());
        this.cash.stream().sorted((a,b) -> Long.compare(b.getValue(),a.getValue())).forEach(sb::append);;
        return sb.toString().trim();
    }*/
    public String printValuablesBag(){
        StringBuilder sb = new StringBuilder();
        if(this.gold.size() > 0) {
            sb.append("<Gold> $").append(this.getGoldValue()).append(System.lineSeparator());
            sb.append("##Gold - ").append(this.getGoldValue()).append(System.lineSeparator());
        }
        if(this.gems.size() > 0) {
            sb.append("<Gem> $").append(this.getGemsValue()).append(System.lineSeparator());
            this.gems.stream().sorted(Comparator.comparing(Gem::getName).reversed().thenComparingLong(Gem::getValue)).forEach(e -> sb.append(e).append(System.lineSeparator()));
            //this.gems.stream().sorted(Comparator.comparing(Gem::getName).reversed()).forEach(e -> sb.append(e).append(System.lineSeparator()));
        }
        if(this.cash.size() > 0) {
            sb.append("<Cash> $").append(this.getCashValue()).append(System.lineSeparator());
            this.cash.stream().sorted(Comparator.comparing(Cash::getName).reversed().thenComparingLong(Cash::getValue)).forEach(e -> sb.append(e).append(System.lineSeparator()));
            //this.cash.stream().sorted(Comparator.comparing(Cash::getName).reversed()).forEach(e -> sb.append(e).append(System.lineSeparator()));
        }
        return sb.toString();
    }
}
