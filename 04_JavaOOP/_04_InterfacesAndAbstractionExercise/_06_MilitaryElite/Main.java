package _04_JavaOOP._04_InterfacesAndAbstractionExercise._06_MilitaryElite;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        ArrayList<Private> privates = new ArrayList<>();

        while(!console.equals("End")){
            String[] commandLine = console.split("\\s+");
            
            String rank = commandLine[0];
            int id = Integer.parseInt(commandLine[1]);
            String firstName = commandLine[2];
            String lastName = commandLine[3];
            double salary = Double.parseDouble(commandLine[4]);
            
            if(rank.equals("Private")){
                Private p = new Private(id, firstName, lastName, salary);
                
                if(!privates.contains(p)){
                    privates.add(p);
                    System.out.print(p);
                }
            }else if(rank.equals("LieutenantGeneral")){
                LieutenantGeneral lieutenantGeneral = new LieutenantGeneral(id, firstName, lastName, salary, privates);
                System.out.print(lieutenantGeneral);
            }else if(rank.equals("Engineer")){
                try{
                    String corps = commandLine[5];
                    Engineer engineer = new Engineer(id, firstName, lastName, salary, corps);
                    int n = (commandLine.length - 6) / 2;
                    
                    for (int i = 6; i < commandLine.length; i+=2) {
                        String replacePart = commandLine[i];
                        int repairHours = Integer.parseInt(commandLine[i+1]);
                        Repair repair = new Repair(replacePart, repairHours);
                        engineer.addRepair(repair);
                    }
                    
                    System.out.print(engineer);
                }catch (Exception e){
                    console = scan.nextLine();
                    continue;
                }
            }else if(rank.equals("Commando")){
                try{
                    String corps = commandLine[5];
                    Commando commando = new Commando(id, firstName, lastName, salary, corps);
                    int n = (commandLine.length - 6) / 2;
                    
                    for (int i = 6; i < commandLine.length; i+=2) {
                        String codeName = commandLine[i];
                        String missionState = commandLine[i+1];
                        
                        try{
                            Mission mission = new Mission(codeName, missionState);
                            commando.addMission(mission);

                        }catch (Exception e){
                        }
                    }
                    
                    System.out.print(commando);
                }catch (Exception e){
                    console = scan.nextLine();
                    continue;
                }
            }else if(rank.equals("Spy")){
                String codeNumber = commandLine[4];
                Spy spy = new Spy(id, firstName, lastName, codeNumber);
                
                System.out.print(spy);
            }
            
            console = scan.nextLine();
        }
        
        scan.close();
    }
}
