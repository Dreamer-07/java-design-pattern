package pers.prover07.dp.behavior.visitor;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 22:13
 */
public class Dot implements Shape{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
