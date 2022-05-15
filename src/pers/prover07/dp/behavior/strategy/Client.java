package pers.prover07.dp.behavior.strategy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 22:50
 */
public class Client {

    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan();
        salesMan.setStrategy(new StrategyA());
        salesMan.salesManShow();
    }

}
