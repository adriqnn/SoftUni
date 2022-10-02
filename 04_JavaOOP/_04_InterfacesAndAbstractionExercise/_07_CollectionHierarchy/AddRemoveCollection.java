package _04_JavaOOP._04_InterfacesAndAbstractionExercise._07_CollectionHierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable{
    @Override
    public String remove() {
        return super.getItems().remove(super.getItems().size()-1);
    }

    @Override
    public int add(String item) {
        this.getItems().add(0,item);
        return 0;
    }
}