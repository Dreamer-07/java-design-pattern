package pers.prover07.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 17:12
 */
public class BoxFactory {

    private static Map<String, AbstractBox> boxMap = new HashMap<>();

    static {
        boxMap.put("I", IBox.getInstance());
        boxMap.put("L", new LBox());
    }

    public static AbstractBox getBox(String type) {
        return boxMap.get(type);
    }
}
