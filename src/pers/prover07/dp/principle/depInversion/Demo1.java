package pers.prover07.dp.principle.depInversion;

/**
 * 依赖倒转原则 - 不使用依赖倒转
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/9 14:21
 */
public class Demo1 {

    public static void main(String[] args) {
        new Person().toSend(new Email());
    }

}

class Email {
    public void send() {
        System.out.println("发送电子邮件");
    }
}

class Person {
    /**
     * 高层模块直接使用底层模块
     * 优点：编码简单
     * 缺点：可扩展性低，如果这个时候说要发送wx/qq等等其他消息就需要对代码进行重构
     * @param email
     */
    public void toSend(Email email) {
        email.send();
    }
}
