package pers.prover07.dp.creation.builder;

import pers.prover07.dp.creation.builder.builder.PhoneBuilder;
import pers.prover07.dp.creation.builder.product.Phone;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 10:39
 */
public class Sellers {

    private PhoneBuilder phoneBuilder;

    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    /**
     * 制定生产过程的步骤
     * @return
     */
    public Phone phoneBuild() {
        phoneBuilder.buildName();
        phoneBuilder.buildCpu();
        phoneBuilder.buildCamera();
        return phoneBuilder.getPhone();
    }

}
