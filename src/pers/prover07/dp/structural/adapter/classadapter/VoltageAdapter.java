package pers.prover07.dp.structural.adapter.classadapter;

/**
 * !!!类适配器的核心在于直接继承被被适配的类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/13 23:25
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int get5V() {
        // 获取 220V 电压
        int v = this.get220V();
        // 进行处理转换成 5V 电压并返回
        return v / 44;
    }
}
