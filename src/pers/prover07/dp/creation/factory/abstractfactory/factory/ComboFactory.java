package pers.prover07.dp.creation.factory.abstractfactory.factory;

import pers.prover07.dp.creation.factory.abstractfactory.product.drinks.Drinks;
import pers.prover07.dp.creation.factory.abstractfactory.product.pizza.Pizza;

public interface ComboFactory {

    Pizza createPizza();

    Drinks createDrinks();

}
