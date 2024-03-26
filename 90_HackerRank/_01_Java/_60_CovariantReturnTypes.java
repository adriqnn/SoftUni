package _05_HackerRank._01_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _60_CovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine().trim();
        Region region = null;

        switch (s) {
            case "South":
                region = new South();
                break;
            case "North":
                region = new North();
                break;
        }

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());

        reader.close();
    }
}

class Flower {
    public String whatsYourName(){
        return this.getClass().getSimpleName();
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class South extends Region{
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class North extends Region{
    @Override
    public Flower yourNationalFlower() {
        return new Lily();
    }
}
