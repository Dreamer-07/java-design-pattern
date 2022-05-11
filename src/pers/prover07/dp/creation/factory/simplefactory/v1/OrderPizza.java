package pers.prover07.dp.creation.factory.simplefactory.v1;

import pers.prover07.dp.creation.factory.simplefactory.entity.GreekPizza;
import pers.prover07.dp.creation.factory.simplefactory.entity.PepperPizza;
import pers.prover07.dp.creation.factory.simplefactory.entity.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 9:52
 */
public class OrderPizza {

    public Pizza createPizza() {
        Pizza pizza = null;
        String orderType = getType(); // 订购的披萨类型

        if ("greek".equals(orderType)) {
            pizza = new GreekPizza(" 希腊披萨 ");
        } else if ("pepper".equals(orderType)) {
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

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
