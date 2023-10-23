package _04_JavaOOP._04_InterfacesAndAbstractionExercise._05_Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return this.numbers;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        
        this.urls.forEach(e -> {
            if(e.matches(".*[0-9].*")){
                sb.append("Invalid URL!").append(System.lineSeparator());
            }else{
                sb.append("Browsing: ").append(e).append("!").append(System.lineSeparator());
            }
        });
        
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        
        this.numbers.forEach(e -> {
            if(e.matches(".*\\D.*")){
                sb.append("Invalid number!").append(System.lineSeparator());
            }else {
                sb.append("Calling... ").append(e).append(System.lineSeparator());
            }
        });
        
        return sb.toString();
    }
}
