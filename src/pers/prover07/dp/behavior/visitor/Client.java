package pers.prover07.dp.behavior.visitor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 22:15
 */
public class Client {

    private static List<Shape> shapeList = new ArrayList<>();

    static {
        shapeList.add(new Dot());
        shapeList.add(new Rectangle());
        shapeList.add(new Circle());
    }

    public static void main(String[] args) {
        XmlExportVisitor xmlExportVisitor = new XmlExportVisitor();
        xmlExportVisitor.export(shapeList);
    }

}
