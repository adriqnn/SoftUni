package hearthstone;

import java.util.Objects;

public class Card {
    private String name;
    private int score;
    private int damage;
    private int health;
    private int level;

    public Card(String name, int damage, int score, int level) {
        this.name = name;
        this.score = score;
        this.damage = damage;
        this.level = level;
        this.health = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReversedName() {
        StringBuilder builder = new StringBuilder(name);
        return builder.reverse().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        
        return score == card.score && damage == card.damage && health == card.health && level == card.level && Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score, damage, health, level);
    }
}
