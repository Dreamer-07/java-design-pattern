package pers.prover07.dp.behavior.mediator;

/**
 * 中介模式 - 抽象中介者
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 15:39
 */
public abstract class Mediator {

    abstract void notify(String message, Person person);

}
