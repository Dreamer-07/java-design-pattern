package pers.prover07.dp.behavior.state;

/**
 * 状态模式 - 环境类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 13:31
 */
public class Lift {

    private LiftState liftState;

    public Lift() {
        liftState = new LiftCloseState(this);
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    /**
     * 将状态相关的操作委托给当前状态来处理
     */
    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }
}
