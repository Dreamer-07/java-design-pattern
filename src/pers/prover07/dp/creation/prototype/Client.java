package pers.prover07.dp.creation.prototype;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 8:50
 */
public class Client {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = (Rectangle) rectangle.deepClone();
        // false
        System.out.println(rectangle == rectangle2);
    }

}
