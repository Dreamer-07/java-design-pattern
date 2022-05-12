package pers.prover07.dp.creation.builder.builder;

import pers.prover07.dp.creation.builder.product.Phone;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 10:35
 */
public class IPhoneBuilder extends PhoneBuilder{
    @Override
    public PhoneBuilder buildName() {
        this.getPhone().setName("苹果手机");
        return this;
    }

    @Override
    public PhoneBuilder buildCpu() {
        this.getPhone().setCpu("苹果手机Cpu");
        return this;
    }

    @Override
    public PhoneBuilder buildCamera() {
        this.getPhone().setCamera("苹果手机Camrea");
        return this;
    }
}
