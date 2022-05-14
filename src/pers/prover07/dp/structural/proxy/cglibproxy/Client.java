package pers.prover07.dp.structural.proxy.cglibproxy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 20:27
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation trainStationProxy = proxyFactory.createTrainStationProxy();
        trainStationProxy.sell();
    }

}
