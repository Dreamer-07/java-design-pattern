package pers.prover07.dp.behavior.templatemethod;

/**
 * 实现子类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 19:54
 */
public class dishTwo extends dish {
    @Override
    protected void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    protected void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
