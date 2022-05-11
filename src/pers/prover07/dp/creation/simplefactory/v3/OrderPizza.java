package pers.prover07.dp.creation.simplefactory.v3;

import pers.prover07.dp.creation.simplefactory.entity.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 9:52
 */
public class OrderPizza {

    /**
     * 使用方只用整合 pizzaFactory，传递数据就能得到结果，而具体实现不用在意
     * @return
     */
    public Pizza createPizza() {
        String type = getType();
        return PizzaFactory.createPizza(type);
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
