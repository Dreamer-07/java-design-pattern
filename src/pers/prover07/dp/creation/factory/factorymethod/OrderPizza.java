package pers.prover07.dp.creation.factory.factorymethod;

import pers.prover07.dp.creation.factory.factorymethod.entity.Pizza;
import pers.prover07.dp.creation.factory.factorymethod.factory.PizzaFactory;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 15:56
 */
public class OrderPizza {

    private PizzaFactory pizzaFactory;

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void createPizza() {
        Pizza pizza = pizzaFactory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
