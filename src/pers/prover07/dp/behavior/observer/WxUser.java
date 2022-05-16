package pers.prover07.dp.behavior.observer;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 14:41
 */
public class WxUser extends Observer{

    private String name;

    public WxUser(String name) {
        this.name = name;
    }

    @Override
    void update(String message) {
        System.out.println(name + "接收到了消息:" + message);
    }
}
