package _04_JavaOOP._05_PolymorphismExercise._04_Word;

public class CommandExecution implements CommandInterface {
    private StringBuilder text;
    private String cutToPaste;

    public CommandExecution(StringBuilder text) {
        this.text = text;
        this.cutToPaste = "";
    }

    @Override
    public void handleInput(String input) {
        String[] tokens = input.split("\\s+");

        String commandName = tokens[0];
        int startInd = Integer.parseInt(tokens[1]);
        int endInd = Integer.parseInt(tokens[2]);

        switch(commandName){
            case"uppercase":
                if(startInd == endInd){
                    return;
                }
                String s = this.text.substring(startInd, endInd).toUpperCase();
                this.text = this.text.delete(startInd,endInd).insert(startInd,s);
                break;
            case"cut":
                if(startInd == endInd){
                    this.cutToPaste = "";
                }
                this.cutToPaste = this.text.substring(startInd,endInd);
                this.text.delete(startInd, endInd);
                break;
            case"paste":
                if(startInd == 0 && endInd == 0){
                    this.text.insert(startInd,cutToPaste);
                }else {
                    this.text.delete(startInd, endInd).insert(startInd, cutToPaste);
                }
                break;
        }
    }
}
