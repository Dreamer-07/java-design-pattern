package pers.prover07.dp.creation.factory.abstractfactory;

import pers.prover07.dp.creation.factory.abstractfactory.factory.impl.PepperPizzaSpriteDrinksFactory;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 18:41
 */
public class OrderStoreApp {

    public static void main(String[] args) {
        // GreekPizzaColaDrinksFactory factory = new GreekPizzaColaDrinksFactory();
        PepperPizzaSpriteDrinksFactory factory = new PepperPizzaSpriteDrinksFactory();
        System.out.println(factory.createDrinks().getName());
        System.out.println(factory.createPizza().getName());
    }

}
