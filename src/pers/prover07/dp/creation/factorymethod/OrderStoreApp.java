package pers.prover07.dp.creation.factorymethod;

import pers.prover07.dp.creation.factorymethod.factory.impl.GreekPizzaFactory;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 15:57
 */
public class OrderStoreApp {

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setPizzaFactory(new GreekPizzaFactory());
        orderPizza.createPizza();
    }

}
