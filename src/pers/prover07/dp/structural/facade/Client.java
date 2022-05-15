package pers.prover07.dp.structural.facade;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 14:31
 */
public class Client {

    public static void main(String[] args) {
        ApplicationFacade applicationFacade = new ApplicationFacade();
        applicationFacade.say("开启");
        applicationFacade.say("关闭");
    }

}
