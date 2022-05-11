package pers.prover07.dp.creation.factory.abstractfactory.factory.impl;

import pers.prover07.dp.creation.factory.abstractfactory.factory.ComboFactory;
import pers.prover07.dp.creation.factory.abstractfactory.product.drinks.Cola;
import pers.prover07.dp.creation.factory.abstractfactory.product.drinks.Drinks;
import pers.prover07.dp.creation.factory.abstractfactory.product.pizza.GreekPizza;
import pers.prover07.dp.creation.factory.abstractfactory.product.pizza.Pizza;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 18:39
 */
public class GreekPizzaColaDrinksFactory implements ComboFactory {
    @Override
    public Pizza createPizza() {
        return new GreekPizza("Greek Pizza");
    }

    @Override
    public Drinks createDrinks() {
        return new Cola("Cola");
    }
}
