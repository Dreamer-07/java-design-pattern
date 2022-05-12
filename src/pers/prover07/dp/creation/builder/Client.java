package pers.prover07.dp.creation.builder;

import pers.prover07.dp.creation.builder.builder.HuaWeiBuilder;
import pers.prover07.dp.creation.builder.product.Phone;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 10:41
 */
public class Client {

    public static void main(String[] args) {
        Sellers sellers = new Sellers();
        sellers.setPhoneBuilder(new HuaWeiBuilder());
        Phone phone = sellers.phoneBuild();
        System.out.println(phone.getName());
    }

}
