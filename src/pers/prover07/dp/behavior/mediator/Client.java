package pers.prover07.dp.behavior.mediator;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 15:58
 */
public class Client {

    public static void main(String[] args) {
        HouseMediator houseMediator = new HouseMediator();

        Tenant tenant1 = new Tenant("张三", houseMediator);
        Tenant tenant2 = new Tenant("李四", houseMediator);
        Homeowner homeowner = new Homeowner("王五", houseMediator);

        houseMediator.getTenantList().add(tenant1);
        houseMediator.getTenantList().add(tenant2);
        houseMediator.getHomeownerList().add(homeowner);

        // tenant1.notify("我要个三房的整租");
        homeowner.notify("有个二房的房子");
    }

}
