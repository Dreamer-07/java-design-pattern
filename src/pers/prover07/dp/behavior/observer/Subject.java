package pers.prover07.dp.behavior.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notify(String message);

}
