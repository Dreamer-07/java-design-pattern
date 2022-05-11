package pers.prover07.dp.creation.factory.factorymethod.factory.impl;

import pers.prover07.dp.creation.factory.factorymethod.entity.PepperPizza;
import pers.prover07.dp.creation.factory.factorymethod.entity.Pizza;
import pers.prover07.dp.creation.factory.factorymethod.factory.PizzaFactory;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 15:55
 */
public class PepperPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperPizza("Pepper Pizza");
    }
}
