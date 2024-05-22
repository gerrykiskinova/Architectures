package Homework;

public class TrainingProgram implements TrainigProgram{
    private String baseProgram;
    private String name;

    public TrainingProgram(String baseProgram, String name) {
        this.baseProgram = baseProgram;
        this.name = name;
    }

    public String getBaseProgram() {
        return baseProgram;
    }

    public String getName() {
        return name;
    }

    @Override
    public String describe() {
        return "";
    }

    @Override
    public void addition() {

    }
}
