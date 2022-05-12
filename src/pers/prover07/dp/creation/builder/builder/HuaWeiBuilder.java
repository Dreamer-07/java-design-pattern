package pers.prover07.dp.creation.builder.builder;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 10:35
 */
public class HuaWeiBuilder extends PhoneBuilder{
    @Override
    public PhoneBuilder buildName() {
        this.getPhone().setName("华为手机");
        return this;
    }

    @Override
    public PhoneBuilder buildCpu() {
        this.getPhone().setCpu("华为手机Cpu");
        return this;
    }

    @Override
    public PhoneBuilder buildCamera() {
        this.getPhone().setCamera("华为手机Camrea");
        return this;
    }
}
