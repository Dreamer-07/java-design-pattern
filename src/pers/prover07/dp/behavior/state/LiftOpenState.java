package pers.prover07.dp.behavior.state;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 13:36
 */
public class LiftOpenState extends LiftState{
    public LiftOpenState(Lift lift) {
        super(lift);
    }

    @Override
    void open() {
        System.out.println("opened...");
    }

    @Override
    void run() {
        this.lift.setLiftState(new LiftRunState(this.lift));
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
