package pers.prover07.dp.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 14:44
 */
public class TestSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notify(String message) {
        observerList.forEach(observer -> observer.update(message));
    }
}
