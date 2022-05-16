package pers.prover07.dp.behavior.command;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 9:41
 */
public class CommandB extends Command{

    public CommandB() {
        this.receiver = new Receiver();
    }

    @Override
    void execute() {
        System.out.println("CommandB...");
        this.receiver.action();
    }
}
