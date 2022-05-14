package pers.prover07.dp.structural.proxy.staticproxy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 12:15
 */
public class Client {

    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        // 通过代理商买票
        proxyPoint.sell();
    }

}
