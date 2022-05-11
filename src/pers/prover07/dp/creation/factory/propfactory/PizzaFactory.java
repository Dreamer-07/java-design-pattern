package pers.prover07.dp.creation.factory.propfactory;

import pers.prover07.dp.creation.factory.propfactory.entity.Pizza;

import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 22:15
 */
public class PizzaFactory {

    private static HashMap<String, Pizza> pizzaHashMap = new HashMap<>();

    static {
        // 创建 properties 对象
        Properties properties = new Properties();
        // 获取配置文件输入流
        InputStream is = PizzaFactory.class.getClassLoader().getResourceAsStream("./pers/prover07/dp/creation/factory/propfactory/bean.properties");
        try {
            // 加载配置文件
            properties.load(is);
            // 获取 properties 文件中定义的 key
            for (Object key : properties.keySet()) {
                // 获取定义的 className
                String className = (String) properties.get(key);
                // 通过反射创建对象
                Pizza pizza = (Pizza) Class.forName(className).newInstance();
                // 保存起来
                pizzaHashMap.put((String) key, pizza);
            }
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }

    public static Pizza getPizza(String type) {
        return pizzaHashMap.get(type);
    }

}
