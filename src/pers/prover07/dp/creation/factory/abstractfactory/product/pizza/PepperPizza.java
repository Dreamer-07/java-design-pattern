package pers.prover07.dp.creation.factory.abstractfactory.product.pizza;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 9:50
 */
public class PepperPizza extends Pizza {

    public PepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("PepperPizza in prepare");
    }
}
