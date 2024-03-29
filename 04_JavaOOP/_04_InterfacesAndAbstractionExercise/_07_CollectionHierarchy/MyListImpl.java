package _04_JavaOOP._04_InterfacesAndAbstractionExercise._07_CollectionHierarchy;

public class MyListImpl extends Collection implements MyList{
    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String item) {
        super.getItems().add(0, item);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
