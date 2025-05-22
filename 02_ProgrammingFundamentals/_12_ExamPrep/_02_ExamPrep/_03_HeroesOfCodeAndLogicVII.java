package _02_ProgrammingFundamentals._12_ExamPrep._02_ExamPrep;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        Map<String, Integer> heroesHP = new TreeMap<>();
        Map<String, Integer> heroesMP = new TreeMap<>();

        // Play the game
        for (int hero = 0; hero < n; hero++) {
            String data = scan.nextLine();
            String[] splitData = data.split("\\s+");

            String heroName = splitData[0];
            int hp = Integer.parseInt(splitData[1]);
            int mp = Integer.parseInt(splitData[2]);

            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] commandParams = command.split(" - ");
            String commandName = commandParams[0];
            String heroName = commandParams[1];

            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParams[2]);
                    String spellName = commandParams[3];
                    int currentMP = heroesMP.get(heroName);

                    if (currentMP >= mpNeeded) {
                        int mpLeft = currentMP - mpNeeded;
                        heroesMP.put(heroName, mpLeft);

                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }

                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParams[2]);
                    String attacker = commandParams[3];
                    int currentHP = heroesHP.get(heroName) - damage;

                    if (currentHP> 0) {
                        heroesHP.put(heroName, currentHP);

                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }

                    break;
                case "Recharge":
                    int amountRecharge = Integer.parseInt(commandParams[2]);
                    int currentMPForRecharge = heroesMP.get(heroName);
                    int increasedMP =currentMPForRecharge + amountRecharge;

                    if (increasedMP > 200) {
                        increasedMP = 200;
                    }

                    heroesMP.put(heroName, increasedMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increasedMP - currentMPForRecharge);

                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(commandParams[2]);
                    int currentHPForHeal = heroesHP.get(heroName);
                    int increasedHP = currentHPForHeal + amountHeal;

                    if (increasedHP > 100) {
                        increasedHP = 100;
                    }

                    heroesHP.put(heroName, increasedHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, increasedHP - currentHPForHeal);

                    break;
            }
            
            command = scan.nextLine();
        }

        // Print result
        heroesHP.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(heroEntry -> {
                    String heroName = heroEntry.getKey();
                    System.out.println(heroEntry.getKey());
                    System.out.println("  HP: " + heroEntry.getValue());
                    System.out.println("  MP: " + heroesMP.get(heroName));
                });

        scan.close();
    }
}
