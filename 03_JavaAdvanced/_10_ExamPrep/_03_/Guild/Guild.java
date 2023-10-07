package _03_JavaAdvanced._10_ExamPrep._03_.Guild;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Guild {
    private String name;
    private int capacity;
    private Map<String, Player> roster;
    private int size;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
        this.size = 0;
    }

    public void addPlayer(Player player){
        if(this.size < this.capacity) {
            this.roster.putIfAbsent(player.getName(), player);
            this.size++;
        }
    }

    public boolean removePlayer(String name){
        boolean containsThis = this.roster.containsKey(name);

        if(containsThis) {
            this.roster.remove(name);
            this.size--;
        }

        return containsThis;
    }

    public void promotePlayer(String name){
        if(this.roster.containsKey(name)) {
            if (!this.roster.get(name).getRank().equals("Member")) {
                this.roster.get(name).setRank("Member");
            }
        }

    }

    public void demotePlayer(String name){
        if(this.roster.containsKey(name)) {
            if (!this.roster.get(name).getRank().equals("Trial")) {
                this.roster.get(name).setRank("Trial");
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz){
        List<Player> kicked = new ArrayList<>();

        for (Map.Entry<String, Player> k : this.roster.entrySet()) {
            if(k.getValue().getClazz().equals(clazz)){
                kicked.add(k.getValue());
            }
        }

        for (Player s : kicked) {
            this.roster.remove(s.getName());
            this.size--;
        }

        return kicked.toArray(new Player[0]);
    }

    public int count(){
        return this.size;
    }

    public String report(){
        /*
        StringBuilder sb = new StringBuilder();

        sb.append("Players in the a.java.advanced.exampreps.bakery.guild: " + this.name + System.lineSeparator());
        for (Player p : this.roster.values()) {
            sb.append(p).append(System.lineSeparator());
        }

        return sb.toString();
        */

        return String.format(
                "Players in the guild: %s:%n%s", this.name, this.roster.values().stream().map(Player::toString).collect(Collectors.joining(System.lineSeparator())));
    }
}
