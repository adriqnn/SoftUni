package _04_JavaOOP._04_InterfacesAndAbstractionExercise._07_CollectionHierarchy;


public class AddCollection extends Collection implements Addable{
    @Override
    public int add(String item) {
        super.getItems().add(item);
        return super.getItems().indexOf(item);
    }
}
