package pers.prover07.dp.structural.flyweight;

/**
 * 非享元角色
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 17:03
 */
public class UnShardBox {

    private String color;

    private int angle;

    public UnShardBox() {
    }

    public UnShardBox(String color, int angle) {
        this.color = color;
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
