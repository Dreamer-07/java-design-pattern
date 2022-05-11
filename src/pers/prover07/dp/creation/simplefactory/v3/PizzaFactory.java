package pers.prover07.dp.creation.simplefactory.v3;

import pers.prover07.dp.creation.simplefactory.entity.GreekPizza;
import pers.prover07.dp.creation.simplefactory.entity.PepperPizza;
import pers.prover07.dp.creation.simplefactory.entity.Pizza;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 14:49
 */
public class PizzaFactory {

    /**
     * 封装创建实例的过程，避免由于底层代码的扩展而倒是使用者修改大部分代码
     * @param type
     * @return
     */
    public static Pizza createPizza(String type) {
        Pizza pizza;

        if ("greek".equals(type)) {
            pizza = new GreekPizza(" 希腊披萨 ");
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza("胡椒披萨");
        } else {
            System.out.println("该披萨类型不存在");
            return null;
        }

        //输出pizza 制作过程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
