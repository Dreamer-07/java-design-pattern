package pers.prover07.dp.creation.factory.propfactory.entity;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 9:50
 */
public class GreekPizza extends Pizza {

    public GreekPizza() {
        this.name = "Greek";
    }

    @Override
    public void prepare() {
        System.out.println("Greek Pizza in prepare");
    }
}
