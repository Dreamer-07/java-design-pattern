package pers.prover07.dp.behavior.state;

/**
 * 状态模式 - 抽象状态类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 13:33
 */
public abstract class LiftState {

    protected Lift lift;

    public LiftState(Lift lift) {
        this.lift = lift;
    }

    abstract void open();

    abstract void run();

    abstract void close();

    abstract void stop();

}
