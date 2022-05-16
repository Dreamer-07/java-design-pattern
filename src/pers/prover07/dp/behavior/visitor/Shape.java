package pers.prover07.dp.behavior.visitor;

/**
 * 抽象元素类
 */
public interface Shape {

    /**
     * 定义接受访问者的方法
     * @param v
     */
    void accept(Visitor v);

}
