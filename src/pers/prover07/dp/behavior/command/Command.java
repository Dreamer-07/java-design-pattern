package pers.prover07.dp.behavior.command;

/**
 * 命令模式 - 抽象命令类
 */
public abstract class Command {

    public Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract void execute();
}
