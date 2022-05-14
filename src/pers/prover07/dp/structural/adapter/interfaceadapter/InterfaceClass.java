package pers.prover07.dp.structural.adapter.interfaceadapter;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/13 23:57
 */
public class InterfaceClass extends InterfaceAdapter{

    @Override
    public void func1() {
        System.out.println("test.func1()....");
        super.func1();
    }

    @Override
    public void func2() {
        System.out.println("test.func2()....");
        super.func2();
    }
}
