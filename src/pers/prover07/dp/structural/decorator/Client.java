package pers.prover07.dp.structural.decorator;

import java.io.FileReader;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 10:24
 */
public class Client {

    public static void main(String[] args) {
        Food food;
        food = new FriedRice();
        printFood(food);
        food = new Egg(food);
        printFood(food);
        food = new Ham(food);
        printFood(food);
    }

    private static void printFood(Food food) {
        System.out.println(food.getDesc() + ":" + food.cost());
    }

}
