package Homework;

public class Main {
    public static void main(String[] args) {
        Gym gym = Gym.getInstance();

        // Define strategies
        TrainigProgram basicTrainingProgram = new BasicTrainingProgram();
        TrainigProgram flexibilityTraining = new FlexibilityTraining();
        TrainigProgram strenghtTrainingProgram = new StrenghtTrainingProgram();

        Trainee trainee1 = new Trainee();
        Trainee trainee = new Trainee();
        Observer obs1 = new TraineeSubscriber("Obs1");
        Observer obs2 = new TraineeSubscriber("Obs2");
        Observer obs3 = new TraineeSubscriber("Obs3");

        trainee.subscribe(obs1);
        trainee.subscribe(obs2);
        trainee.subscribe(obs3);

        // Setting a basic training program
        BasicTrainingProgram basicProgram = new BasicTrainingProgram();
        obs1.setTrainee(basicProgram);

        // Setting a flexibility program
        FlexibilityTraining flexibilityTraining1 = new FlexibilityTraining();
        obs2.setTrainee(flexibilityTraining1);


        StrenghtTrainingProgram strenghtTrainingProgram1 = new StrenghtTrainingProgram();
        obs3.setTrainee(strenghtTrainingProgram);

        // Personalizing the basic program
        TrainingProgram personalizedProgram = new CardioDecorator(new StrenghtDecorator(flexibilityTraining));
        obs1.setTrainee(personalizedProgram);
    }
}
