package pers.prover07.dp.creation.prototype;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 8:45
 */
public class Rectangle extends Shape{

    public Rectangle() {
        this.setName("rectangle");
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}
