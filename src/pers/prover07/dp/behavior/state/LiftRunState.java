package pers.prover07.dp.behavior.state;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 13:36
 */
public class LiftRunState extends LiftState{
    public LiftRunState(Lift lift) {
        super(lift);
    }

    @Override
    void open() {
        this.lift.setLiftState(new LiftOpenState(this.lift));
    }

    @Override
    void run() {
        System.out.println("runing...");
    }

    @Override
    void close() {
        this.lift.setLiftState(new LiftCloseState(this.lift));
    }

    @Override
    void stop() {
        System.out.println("please close first...");
    }
}
