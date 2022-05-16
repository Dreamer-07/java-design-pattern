package pers.prover07.dp.behavior.observer;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 14:45
 */
public class Client {

    public static void main(String[] args) {
        TestSubject testSubject = new TestSubject();
        testSubject.attach(new WxUser("张三"));
        testSubject.attach(new WxUser("李四"));
        testSubject.notify("new message");
    }

}
