package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._08_PetClinics.interfaces;

public interface Clinic {

    void addPet(Pet pet);

    void releasePet();

    Pet[] getRooms();

    String getSpecificRoomInfo(int roomIndex);

    String getAllRoomsInfo();

    boolean hasEmptyRooms();

    boolean hasReleased();
}
