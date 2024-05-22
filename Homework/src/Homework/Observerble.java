package Homework;

public interface Observerble {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
    String getUpdate();
    void setTrainee(TrainigProgram program);

}
