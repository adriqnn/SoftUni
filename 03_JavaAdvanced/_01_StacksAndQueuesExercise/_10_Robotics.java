package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _10_Robotics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> robots = Arrays.stream(scan.nextLine().split(";")).collect(Collectors.toList());
        int[] time = Arrays.stream(scan.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        Map<String, List<Integer>> robotsMapAndWork = new LinkedHashMap<>();
        ArrayDeque<String> productionLine = new ArrayDeque<>();

        // Read additional details
        String console = scan.nextLine();
        while(!console.equals("End")){
            productionLine.offer(console);
            
            console = scan.nextLine();
        }

        int timeInSeconds = (time[0] * 60 * 60) + (time[1] * 60) + time[2];

        for (int i = 0; i < robots.size(); i++) {
            String[] robotSpecs = robots.get(i).split("-");

            robotsMapAndWork.put(robotSpecs[0], new ArrayList<>());
            robotsMapAndWork.get(robotSpecs[0]).add(Integer.parseInt(robotSpecs[1]));
            robotsMapAndWork.get(robotSpecs[0]).add(0);

            robots.set(i, robotSpecs[0]);
        }

        // Robotics factory production line
        while(!productionLine.isEmpty()){
            timeInSeconds++;
            
            for (int i = 0; i < robotsMapAndWork.size(); i++) {
                if(robotsMapAndWork.get(robots.get(i)).get(1) > 0){
                    robotsMapAndWork.get(robots.get(i)).set(1, (robotsMapAndWork.get(robots.get(i)).get(1))-1);
                }
            }
            
            int size = productionLine.size();
            
            for (int i = 0; i < robotsMapAndWork.size(); i++) {
                if(robotsMapAndWork.get(robots.get(i)).get(1) == 0){
                    robotsMapAndWork.get(robots.get(i)).set(1,robotsMapAndWork.get(robots.get(i)).get(0));
                    int[] getTime = convertTime(timeInSeconds);
                    
                    System.out.printf("%s - %s [%02d:%02d:%02d]%n", robots.get(i), productionLine.poll(), getTime[0], getTime[1], getTime[2]);
                    break;
                }
            }
            
            if(size == productionLine.size()){
                productionLine.offer(productionLine.poll());
            }
        }
    }

    // Method that converts time to hours/minutes/seconds
    private static int[] convertTime(int timeInSeconds) {
        int seconds = timeInSeconds % 60;
        int minutes = ((timeInSeconds-seconds) / 60) % 60;
        int hours = ((timeInSeconds-minutes) / 60) / 60;

        if (hours >= 24){
            hours %= 24;
        }

        int[] time = new int[3];

        time[0] = hours;
        time[1] = minutes;
        time[2] = seconds;

        return time;
    }
}

