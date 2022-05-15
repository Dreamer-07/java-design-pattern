package pers.prover07.dp.behavior.strategy;

/**
 * 策略模式 - 环境
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 22:50
 */
public class SalesMan {

    /**
     * 聚合抽象策略类
     */
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesManShow() {
        strategy.show();
    }
}
