package pers.prover07.dp.creation.prototype;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 8:46
 */
public class Square extends Shape{

    public Square() {
        this.setName("square");
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
