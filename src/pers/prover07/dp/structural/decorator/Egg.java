package pers.prover07.dp.structural.decorator;

/**
 * 具体装饰
 *
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 22:10
 */
public class Egg extends Ingredients {
    public Egg(Food food) {
        super("鸡蛋", 2, food);
    }
}
