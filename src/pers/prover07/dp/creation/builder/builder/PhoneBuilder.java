package pers.prover07.dp.creation.builder.builder;

import pers.prover07.dp.creation.builder.product.Phone;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 10:32
 */
public abstract class PhoneBuilder {

    private Phone phone = new Phone();

    // 定义生产一个手机需要的生产过程
    public abstract PhoneBuilder buildName();
    public abstract PhoneBuilder buildCpu();
    public abstract PhoneBuilder buildCamera();

    /**
     * 返回产品
     * @return
     */
    public Phone getPhone() {
        return phone;
    }

}
