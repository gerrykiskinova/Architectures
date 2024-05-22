package Homework;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observerble {
    private List<Observer> observerList;
    //private String topic;
    private TrainingProgram trainigProgram;

    public Trainee() {
        this.observerList = new ArrayList<>();
    }


    @Override
    public void subscribe(Observer observer) {
        this.observerList.add(observer);
        observer.setTrainee(this.trainigProgram);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observerList.remove(observer);
        observer.setTrainee(null);
    }


    @Override
    public void notifyObservers() {
        for(Observer observer : this.observerList) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return "";
    }

//    public void setTrainee(TrainigProgram topic) {
//        this.topic = topic;
//        this.notifyObservers();
//    }
    public void setTrainee(TrainigProgram program) {
        this.trainigProgram = program;
        notifyObservers();
    }

}
