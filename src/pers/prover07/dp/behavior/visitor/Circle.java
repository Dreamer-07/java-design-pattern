package pers.prover07.dp.behavior.visitor;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 22:13
 */
public class Circle implements Shape {

    // 内部应该还包含又原本的业务处理逻辑

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
