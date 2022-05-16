package pers.prover07.dp.behavior.state;

/**
 * 状态模式 - 具体状态类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 13:36
 */
public class LiftCloseState extends LiftState{
    public LiftCloseState(Lift lift) {
        super(lift);
    }

    @Override
    void open() {
        this.lift.setLiftState(new LiftOpenState(this.lift));
    }

    @Override
    void run() {
        this.lift.setLiftState(new LiftRunState(this.lift));
    }

    @Override
    void close() {
        System.out.println("closed...");
    }

    @Override
    void stop() {
        this.lift.setLiftState(new LiftStopState(this.lift));
    }
}
