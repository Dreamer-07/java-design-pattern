package pers.prover07.dp.behavior.strategy;

/**
 * 策略模式 - 具体策略类
 * 是一种具体策略算法的实现
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 22:49
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
