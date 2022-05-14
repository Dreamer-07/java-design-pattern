package pers.prover07.dp.structural.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂 - 动态生成代理对象
 *
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 20:22
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 创建代理对象
     * @return
     */
    public TrainStation createTrainStationProxy() {
        // 类似于 JDK 代理中的 Proxy 类
        Enhancer enhancer = new Enhancer();
        // 设置父类(也就是真实主题类)
        enhancer.setSuperclass(TrainStation.class);
        // 设置增强类
        enhancer.setCallback(this);
        // 创建代理对象并返回
        return (TrainStation) enhancer.create();
    }

    /**
     * 代理类真正执行的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取代理商费用");
        return method.invoke(new TrainStation(), objects);
    }
}
