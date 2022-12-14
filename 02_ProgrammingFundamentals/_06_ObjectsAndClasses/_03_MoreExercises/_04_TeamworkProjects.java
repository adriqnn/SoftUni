package _02_ProgrammingFundamentals._06_ObjectsAndClasses._03_MoreExercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _04_TeamworkProjects {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfTeams = Integer.parseInt(scan.nextLine());

        List<Teams> teamsList = new ArrayList<>();
        for (int i = 0; i < numberOfTeams; i++) {
            String[] teamCreation = scan.nextLine().split("-");
            String creator = teamCreation[0];
            String newTeam = teamCreation[1];
            boolean creatorIsThere = false;
            boolean teamExists = false;
            boolean sameCreatorAndName = false;
            for (Teams creatorExist : teamsList) {
                if(creatorExist.getCreator().equals(creator)){
                    creatorIsThere = true;
                }
                if(creatorExist.getTeam().equals(newTeam)){
                    teamExists = true;
                }
                if (creatorExist.getCreator().equals(creator) && creatorExist.getTeam().equals(newTeam)){
                    sameCreatorAndName = true;
                }
            }
            if (!creatorIsThere && !teamExists){
                Teams team = new Teams(creator,newTeam,new ArrayList<>(),0);
                teamsList.add(team);
                System.out.printf("Team %s has been created by %s!%n",newTeam,creator);
            }else if(creatorIsThere && teamExists && sameCreatorAndName){
                System.out.printf("Team %s was already created!%n",newTeam);
            }else if(!creatorIsThere){
                System.out.printf("Team %s was already created!%n",newTeam);
            }else if(!teamExists){
                System.out.printf("%s cannot create another team!%n",creator);
            }
        }

        String console = scan.nextLine();

        while(!console.equals("end of assignment")){
            String[] consoleLine = console.split("->");
            String name = consoleLine[0];
            String team = consoleLine[1];
            boolean teamDoesNotExist = true;
            boolean containsName = false;
            boolean isCreator = false;
            boolean anotherTeamContainsName = false;
            for (Teams teamExist : teamsList) {
                if(teamExist.getTeam().equals(team)){
                    teamDoesNotExist = false;
                }
                if(teamExist.getCreator().equals(name)){
                    isCreator = true;
                }
                if(teamExist.getTeam().equals(team) && !teamExist.getMembers().contains(name)){
                    containsName = true;
                }
                if(!teamExist.getTeam().equals(team) && teamExist.getMembers().contains(name)){
                    anotherTeamContainsName = true;
                }
            }
            if(anotherTeamContainsName){
                System.out.printf("Member %s cannot join team %s!%n",name,team);
                console = scan.nextLine();
                continue;
            }
            if(teamDoesNotExist){
                System.out.printf("Team %s does not exist!%n",team);
                console = scan.nextLine();
                continue;
            }
            if(isCreator || !containsName){
                System.out.printf("Member %s cannot join team %s!%n",name,team);
                console = scan.nextLine();
                continue;
            }
            for (Teams join : teamsList) {
                if(join.getTeam().equals(team)){
                    join.getMembers().add(name);
                    join.setSize(join.getSize()+1);
                }
            }
            console = scan.nextLine();
        }
        List<String> disband = new ArrayList<>();
        teamsList.stream().sorted((e1,e2) -> Integer.compare(e2.getMembers().size(),e1.getMembers().size())).forEach(element -> {
            if(element.getMembers().size() == 0){
                disband.add(element.getTeam());
                teamsList.remove(element);
            }
        });
        teamsList.stream().sorted(Comparator.comparingInt(Teams::getSize).reversed().thenComparing(Teams::getTeam)).forEach(e -> {
            System.out.println(e);
            System.out.println("- " + e.getCreator());
            e.getMembers().stream().sorted().forEach(z -> System.out.println("-- " + z));
        });
        System.out.println("Teams to disband:");
        disband.stream().sorted().forEach(System.out::println);
    }
}
class Teams{
    private String creator;
    private String team;
    private List<String> members;
    private int size;
    public Teams(String creator, String team, List<String> members, int size) {
        this.creator = creator;
        this.team = team;
        this.members = members;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getCreator() {
        return creator;
    }
    public String getTeam() {
        return team;
    }
    public List<String> getMembers() {
        return members;
    }
    @Override
    public String toString(){
        return this.team;
    }
}

