package pers.prover07.dp.structural.facade;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 14:28
 */
public class ApplicationFacade {

    private TV tv;

    private Light light;

    private AirCondition airCondition;

    public ApplicationFacade() {
        tv = new TV();
        light = new Light();
        airCondition = new AirCondition();
    }

    public ApplicationFacade(TV tv, Light light, AirCondition airCondition) {
        this.tv = tv;
        this.light = light;
        this.airCondition = airCondition;
    }

    /**
     * 对外暴漏方法，内部自定义逻辑实现调用子系统
     * @param message
     */
    public void say(String message) {
        if (message.contains("开启")) {
            this.onAll();
        } else if (message.contains("关闭")) {
            this.offAll();
        } else {
            System.out.println("听不懂听不懂");
        }
    }

    private void onAll() {
        tv.on();
        light.on();
        airCondition.on();
    }

    private void offAll() {
        tv.off();
        light.off();
        airCondition.off();
    }
}
