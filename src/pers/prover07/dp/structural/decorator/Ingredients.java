package pers.prover07.dp.structural.decorator;

/**
 * 抽象装饰 - 原料(定义配料的规范)
 * - 也需要遵守抽象构件的规范，所以继承抽象构件
 *
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 22:04
 */
public abstract class Ingredients extends Food {

    /**
     * 聚合抽象构件，方便对具体构件进行装饰
     */
    private Food food;

    public Ingredients(String desc, float price, Food food) {
        super(desc, price);
        this.food = food;
    }

    @Override
    public float cost() {
        return super.getPrice() + food.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + food.getDesc();
    }
}
