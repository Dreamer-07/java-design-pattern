package pers.prover07.dp.creation.factory.abstractfactory.product.drinks;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 18:34
 */
public abstract class Drinks {
    private String name;

    public Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
