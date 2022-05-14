package pers.prover07.dp.structural.adapter.objadapter;

import pers.prover07.dp.structural.adapter.classadapter.IVoltage5V;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/13 23:26
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.get5V() == 5) {
            System.out.println("正在充电ing");
        } else {
            System.out.println("电压不足/过头啦");
        }
    }

}
