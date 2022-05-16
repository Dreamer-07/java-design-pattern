package pers.prover07.dp.behavior.visitor;

import java.util.List;

/**
 * 具体访问者 - 扩展具体元素类的方法
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 22:15
 */
public class XmlExportVisitor implements Visitor {

    /**
     * 批量导出数据集合
     * @param shapeList
     */
    public void export(List<Shape> shapeList) {
        shapeList.forEach(shape -> shape.accept(this));
    }

    @Override
    public void visit(Dot dot) {
        System.out.println("将 dot 转成 xml");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("将 circle 转成 xml");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("将 rectangle 转成 xml");
    }
}
