package pers.prover07.dp.behavior.command;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 9:43
 */
public class Client {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setCommand(new CommandA());
        gui.call();
    }

}
