package pers.prover07.dp.structural.flyweight;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 17:15
 */
public class Client {

    public static void main(String[] args) {
        AbstractBox IBox = BoxFactory.getBox("I");
        IBox.drawBox(new UnShardBox("红色", 90));
    }

}
