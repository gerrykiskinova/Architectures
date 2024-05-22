package Homework;

public class CardioDecorator extends TrainingProgramDecorator {
    String exercise;

    public CardioDecorator(TrainingProgram trainigProgramDecorated) {
        super(trainigProgramDecorated);
        //this.exercise = exercise;

    }

    @Override
    public String describe() {
        return "Adding exercise: " + this.exercise;
    }

    public void create() {
        super.addition();
        this.addExercise();
    }

    private void addExercise() {
        System.out.println("Adding cardio exercise:  " + this.exercise);
    }
}
