package pers.prover07.dp.behavior.mediator;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 15:51
 */
public class Homeowner extends Person {
    public Homeowner(String name, HouseMediator houseMediator) {
        super(name, houseMediator);
    }

    @Override
    void notify(String message) {
        ((HouseMediator) mediator).notifyTenant(message, this);
    }
}
