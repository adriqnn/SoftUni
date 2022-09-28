package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

public class _03_MOBAChallenger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Map<String, Integer>> players = new HashMap<>();

        while(!input.equals("Season end")){

            if(input.contains("->")){
                String[] information = input.split(" -> ");
                String player = information[0];
                String position = information[1];
                int skill = Integer.parseInt(information[2]);

                if(!players.containsKey(player)){
                    players.put(player, new HashMap<>());
                }
                if(!players.get(player).containsKey(position)){
                    players.get(player).put(position, skill);
                }else{
                    if(skill > players.get(player).get(position)){
                        players.get(player).put(position, skill);
                    }
                }
            }else{
                String[] information = input.split(" vs ");
                String player1 = information[0];
                String player2 = information[1];

                if(players.containsKey(player1) && players.containsKey(player2)){
                    if(!Collections.disjoint(players.get(player1).keySet(), players.get(player2).keySet())){
                        int playerOneScore = players.get(player1).values().stream().mapToInt(Integer::intValue).sum();
                        int playerTwoScore = players.get(player2).values().stream().mapToInt(Integer::intValue).sum();
                        if(playerOneScore > playerTwoScore){
                            players.remove(player2);
                        }else if(playerOneScore < playerTwoScore){
                            players.remove(player1);
                        }
                    }
                }
            }
            input = scan.nextLine();
        }

        List<PLayer> playersNew = new ArrayList<>();
        players.entrySet().stream().forEach(e -> {
            PLayer pLayer = new PLayer(e.getKey(), 0);
            pLayer.setTotalPoints(e.getValue().values().stream().mapToInt(Integer::intValue).sum());
            e.getValue().entrySet().stream().forEach(el -> {
                Position position = new Position(el.getKey(), el.getValue());
                pLayer.getPositions().add(position);
            });
            playersNew.add(pLayer);
        });

        playersNew.stream().sorted(Comparator.comparing(PLayer::getTotalPoints).reversed().thenComparing(PLayer::getName)).forEach(e -> {
            System.out.printf("%s: %d skill%n",e.getName(),e.getTotalPoints());
            String collect = e.getPositions().stream().sorted(Comparator.comparing(Position::getSkillPoints).reversed().thenComparing(Position::getName)).map(p -> String.format("- %s <::> %d", p.getName(), p.getSkillPoints())).collect(Collectors.joining("\n"));
            System.out.printf("%s%n",collect);
        });
    }
}

class PLayer{
    private String name;
    private int totalPoints;
    private List<Position> positions;

    public PLayer(String name, int totalPoints) {
        this.name = name;
        this.totalPoints = totalPoints;
        this.positions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public PLayer setName(String name) {
        this.name = name;
        return this;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public PLayer setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
        return this;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public PLayer setPositions(List<Position> positions) {
        this.positions = positions;
        return this;
    }
}

class Position{
    private String name;
    private int skillPoints;

    public Position(String name, int skillPoints) {
        this.name = name;
        this.skillPoints = skillPoints;
    }

    public String getName() {
        return name;
    }

    public Position setName(String name) {
        this.name = name;
        return this;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public Position setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
        return this;
    }
}



