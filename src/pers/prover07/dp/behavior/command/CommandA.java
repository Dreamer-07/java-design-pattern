package pers.prover07.dp.behavior.command;

/**
 * 策略模式 - 具体命令类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 9:41
 */
public class CommandA extends Command{

    public CommandA() {
        this.receiver = new Receiver();
    }

    @Override
    void execute() {
        System.out.println("CommandA...");
        this.receiver.action();
    }
}
