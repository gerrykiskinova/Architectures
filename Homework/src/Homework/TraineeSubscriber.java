package Homework;

public class TraineeSubscriber implements Observer{

    private Observerble trainee;
    private String name;
    private TrainigProgram trainingProgram;

//    public TraineeSubscriber(String name) {
//        this.name = name;
//    }


    public TraineeSubscriber(String name) {
        this.name = name;;
    }

    /*@Override
    public void update(TrainingProgram regimen) {
        this.trainingProgram = trainingProgram.chooseProgram(regimen);
        System.out.println(name + " has been notified of the regimen change to " + regimen.getName() + " and chose the program: " + this.trainingProgram);
    }*/



    @Override
    public void update() {
        System.out.println(this.getName() + " Updated with: " +
                this.trainee.getUpdate());
    }

    @Override
    public void setTrainee(TrainigProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }


    public String getName() {
        return name;
    }
}
