package pers.prover07.dp.structural.proxy.jdkproxy;


import java.lang.reflect.Proxy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 19:39
 */
public class ProxyFactory {

    static {
        System.getProperties().put( "sun.misc.ProxyGenerator.saveGeneratedFiles" , "true" );
    }

    private TrainStation trainStation = new TrainStation();

    public SellTickets createSellTicketsProxy() {
        return (SellTickets) Proxy.newProxyInstance(
                // 获取类加载器
                trainStation.getClass().getClassLoader(),
                // 获取真实主题实现的接口
                trainStation.getClass().getInterfaces(),
                /*
                * 设置代理对象对方法的处理
                *   -proxy:  代理对象
                *   -method: 执行的方法
                *   -args:   执行方法的参数
                * */
                (proxy, method, args) -> {
                    // 代理类增强
                    System.out.println("代理商收取服务费用...");
                    // 执行原方法
                    return method.invoke(trainStation, args);
                }
        );
    }

}
