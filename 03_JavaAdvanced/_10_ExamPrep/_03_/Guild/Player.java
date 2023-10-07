package _03_JavaAdvanced._10_ExamPrep._03_.Guild;

public class Player {
    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public String getName() {
        return this.name;
    }

    public String getClazz() {
        return this.clazz;
    }

    public String getRank() {
        return this.rank;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return String.format(
                "Player %s: %s%nRank: %s%nDescription: %s",
                name, clazz, rank, description);
    }
}
