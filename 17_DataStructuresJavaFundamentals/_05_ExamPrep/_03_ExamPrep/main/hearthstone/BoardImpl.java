package hearthstone;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BoardImpl implements Board {
    Map<String, Card> cards;

    public BoardImpl() {
        this.cards = new LinkedHashMap<>();
    }

    @Override
    public void draw(Card card) {
        if(contains(card)){
            throw new IllegalArgumentException();
        }

        this.cards.putIfAbsent(card.getName(), card);
    }

    public boolean contains(Card card){
        return this.cards.containsKey(card.getName());
    }

    @Override
    public Boolean contains(String name) {
        return this.cards.containsKey(name);
    }

    @Override
    public int count() {
        return this.cards.size();
    }

    @Override
    public void play(String attackerCardName, String attackedCardName) {
        if(!this.cards.containsKey(attackedCardName) || !this.cards.containsKey(attackerCardName)){
            throw new IllegalArgumentException();
        }

        Card attacker = this.cards.get(attackerCardName);
        Card attacked = this.cards.get(attackedCardName);

        if(attacker.getLevel() != attacked.getLevel()){
            throw new IllegalArgumentException();
        }else{
            int damage = attacker.getDamage();
            int health = attacked.getHealth();

            if(health > 0){
                if(damage >= health) {
                    attacker.setScore(attacker.getScore() + attacked.getLevel());
                }
                attacked.setHealth(health - damage);
            }
        }
    }

    @Override
    public void remove(String name) {
        if(!contains(name)){
            throw new IllegalArgumentException();
        }

        this.cards.remove(name);
    }

    @Override
    public void removeDeath() {
        this.cards = this.cards.entrySet().stream().filter(e -> e.getValue().getHealth() > 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Iterable<Card> getBestInRange(int start, int end) {
        return this.cards.values().stream().filter(e -> e.getScore() >= start && e.getScore() <= end).sorted(Comparator.comparing(Card::getLevel).reversed()).collect(Collectors.toList());
    }

    @Override
    public Iterable<Card> listCardsByPrefix(String prefix) {
        return this.cards.values().stream().filter(e -> e.getName().substring(0, prefix.length()).equals(prefix)).sorted((c1, c2) -> {
            String reversedNameC1 = c1.getReversedName();
            String reversedNameC2 = c2.getReversedName();

            int result = reversedNameC1.compareTo(reversedNameC2);

            if(result == 0){
                result = Integer.compare(c1.getLevel(), c2.getLevel());
            }

            return result;
        }).collect(Collectors.toList());
    }

    @Override
    public Iterable<Card> searchByLevel(int level) {
        return this.cards.values().stream().filter(e -> e.getLevel() == level).sorted(Comparator.comparing(Card::getScore).reversed()).collect(Collectors.toList());
    }

    @Override
    public void heal(int health) {
        Card card = this.cards.values().stream().sorted(Comparator.comparing(Card::getHealth)).collect(Collectors.toList()).get(0);
        card.setHealth(card.getHealth() + health);
    }
}
