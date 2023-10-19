package _04_JavaOOP._02_EncapsulationExercise._03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        
        this.money = money;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        this.name = name;
    }

    public void buyProduct(Product product){
        if(this.money < product.getCost()){
            String message = String.format("%s can't afford %s", this.name, product.getName());
            throw new IllegalArgumentException(message);
        }
        
        this.products.add(product);
        this.money -= product.getCost();
        
        System.out.printf("%s bought %s%n", this.name, product.getName());
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public String getName() {
        return this.name;
    }
    
    /*
    public String getName(){
        if(this.products.size() > 0){
            StringBuilder sb = new StringBuilder();
            sb.append(this.name).append(" - ");
            sb.append(products.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            
            return sb.toString();
        }
        
        return this.name + " - Nothing bought";
    }
    */
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ");
        sb.append(this.products.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        
        return sb.toString();
    }
}
