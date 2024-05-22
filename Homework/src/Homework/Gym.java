package Homework;

import java.util.ArrayList;
import java.util.List;

public class Gym {
        private static Gym instance;
        private List<Observer> observers;
        //private TrainingProgram trainingProgram;

        private Gym() {
            observers = new ArrayList<>();
            //trainingProgram = new BasicTrainingProgram();
        }

        public static Gym getInstance() {
            if (instance == null) {
                instance = new Gym();
            }
            return instance;
        }


}
