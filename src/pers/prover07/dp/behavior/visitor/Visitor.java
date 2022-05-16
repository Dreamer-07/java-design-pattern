package pers.prover07.dp.behavior.visitor;

public interface Visitor {

    // 定义扩展具体角色的方法定义
    void visit(Dot dot);

    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
