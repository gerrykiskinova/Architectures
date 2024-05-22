package Homework;

public abstract class TrainingProgramDecorator implements TrainigProgram{
    protected TrainigProgram trainigProgramDecorated;

    public TrainingProgramDecorator(TrainigProgram trainigProgramDecorated) {
        super();
        this.trainigProgramDecorated = trainigProgramDecorated;
    }

    @Override
    public void addition() {
        this.trainigProgramDecorated.addition();
    }

    @Override
    public String describe() {
        return trainigProgramDecorated.describe();
    }



}
