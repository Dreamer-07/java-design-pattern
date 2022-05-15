package pers.prover07.dp.structural.flyweight;

/**
 * 抽象享元角色
 *
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 17:04
 */
public abstract class AbstractBox {

    protected String shape;

    public void drawBox(UnShardBox state) {
        System.out.printf("颜色为%s,角度为%s度的%s形状%n", state.getColor(), state.getAngle(), this.shape);
    }


}
