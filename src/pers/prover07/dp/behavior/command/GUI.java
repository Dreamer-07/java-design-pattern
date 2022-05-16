package pers.prover07.dp.behavior.command;

/**
 * 命令模式 - 调用者
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 9:42
 */
public class GUI {

    private Command command;

    public GUI() {
    }

    public GUI(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
