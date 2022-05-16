package pers.prover07.dp.behavior.mediator;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 15:40
 */
public abstract class Person {

    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void notify(String message);

    public void getMessage(String message) {
        System.out.println(this.name + "受到消息:" + message);
    };

    public String getName() {
        return name;
    }
}
