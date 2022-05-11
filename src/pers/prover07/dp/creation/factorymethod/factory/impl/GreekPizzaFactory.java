package pers.prover07.dp.creation.factorymethod.factory.impl;

import pers.prover07.dp.creation.factorymethod.entity.GreekPizza;
import pers.prover07.dp.creation.factorymethod.entity.Pizza;
import pers.prover07.dp.creation.factorymethod.factory.PizzaFactory;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 15:54
 */
public class GreekPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new GreekPizza("Greek Pizza");
    }
}
