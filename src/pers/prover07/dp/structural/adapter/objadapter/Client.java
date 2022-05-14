package pers.prover07.dp.structural.adapter.objadapter;


import pers.prover07.dp.structural.adapter.classadapter.Voltage220V;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/13 23:36
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
