package pers.prover07.dp.structural.proxy.staticproxy;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 12:14
 */
public class ProxyPoint implements SellTickets{
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取代理商费用...");
        trainStation.sell();
    }
}
