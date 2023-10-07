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
        if(this.size < capacity) {
            this.roster.putIfAbsent(player.getName(), player);
            size++;
        }
    }

    public boolean removePlayer(String name){
        boolean containsThis = roster.containsKey(name);
        if(containsThis) {
            roster.remove(name);
            size--;
        }
        return containsThis;
    }

    public void promotePlayer(String name){
        if(roster.containsKey(name)) {
            if (!roster.get(name).getRank().equals("Member")) {
                roster.get(name).setRank("Member");
            }
        }

    }

    public void demotePlayer(String name){
        if(roster.containsKey(name)) {
            if (!roster.get(name).getRank().equals("Trial")) {
                roster.get(name).setRank("Trial");
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz){
        List<Player> kicked = new ArrayList<>();
        for (Map.Entry<String, Player> k : roster.entrySet()) {
            if(k.getValue().getClazz().equals(clazz)){
                kicked.add(k.getValue());
            }
        }
        for (Player s : kicked) {
            roster.remove(s.getName());
            this.size--;
        }
        return kicked.toArray(new Player[0]);
    }

    public int count(){
        return this.size;
    }

    public String report(){
        /*StringBuilder sb = new StringBuilder();
        sb.append("Players in the a.java.advanced.exampreps.bakery.guild: " + this.name + System.lineSeparator());
        for (Player p : roster.values()) {
            sb.append(p).append(System.lineSeparator());
        }
        return sb.toString();*/
        return String.format(
                "Players in the guild: %s:%n%s", name, roster.values().stream().map(Player::toString).collect(Collectors.joining(System.lineSeparator())));
    }
}
