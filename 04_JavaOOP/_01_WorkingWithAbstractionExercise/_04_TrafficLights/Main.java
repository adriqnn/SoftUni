package _04_JavaOOP._01_WorkingWithAbstractionExercise._04_TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Color[] signals = Arrays.stream(scan.nextLine().split(" ")).map(Color::valueOf).toArray(Color[]::new);
        List<TrafficLight> trafficLightList = new ArrayList<>();
        for(Color color : signals){
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight);
        }
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLightList){
                trafficLight.changeColor();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
