package pers.prover07.dp.structural.proxy.jdkproxy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 19:42
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets sellTicketsProxy = proxyFactory.createSellTicketsProxy();
        sellTicketsProxy.sell();
    }

}
