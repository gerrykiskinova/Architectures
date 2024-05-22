package Homework;

public class StrenghtDecorator extends TrainingProgramDecorator{
    String exercise;

    public StrenghtDecorator(TrainingProgram trainigProgramDecorated) {
        super(trainigProgramDecorated);
        //this.exercise = exercise;
    }

    @Override
    public String describe() {
        return super.describe() + " + stretching exercises";
    }



}
