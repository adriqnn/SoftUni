package _04_JavaOOP._02_EncapsulationExercise._04_PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough (String flourType, String bakingTechnique, double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType){
        if(flourType.equals("White") || flourType.equals("Wholegrain")){
            this.flourType = flourType;
        }else{
            String message = "Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }
    }

    private void setBakingTechnique(String bakingTechnique){
        if(bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")){
            this.bakingTechnique = bakingTechnique;
        }else{
            String message = "Invalid type of dough.";
            throw new IllegalArgumentException(message);
        }
    }

    private void setWeight(double weight){
        if(weight < 1 || weight > 200){
            String message = "Dough weight should be in the range [1..200].";
            throw new IllegalArgumentException(message);
        }
        
        this.weight = weight;
    }

    public double calculateCalories(){
        double flourModifier = 0;
        double bakingModifier = 0;
        
        if(flourType.equals("White")){
            flourModifier = 1.5;
        }else{
            flourModifier = 1.0;
        }
        
        if(bakingTechnique.equals("Crispy")){
            bakingModifier = 0.9;
        }else if(bakingTechnique.equals("Chewy")){
            bakingModifier = 1.1;
        }else{
            bakingModifier = 1.0;
        }
        
        return ((2 * weight) * flourModifier) * bakingModifier;
    }
}
