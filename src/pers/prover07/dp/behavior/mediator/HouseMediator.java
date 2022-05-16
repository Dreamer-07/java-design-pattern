package pers.prover07.dp.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 15:41
 */
public class HouseMediator extends Mediator{

    private List<Person> tenantList;
    private List<Person> homeownerList;

    public HouseMediator() {
        tenantList = new ArrayList<>();
        homeownerList = new ArrayList<>();
    }

    @Override
    void notify(String message, Person receiver) {
        receiver.getMessage(message);
    }

    public void notifyHomeowner(String message, Person person) {
        System.out.println(person.getName() + "发出租房消息:" + message);
        homeownerList.forEach(homeowner -> notify(message, homeowner));
    }

    public void notifyTenant(String message, Person person) {
        System.out.println(person.getName() + "发出房子消息:" + message);
        tenantList.forEach(tenant -> notify(message, tenant));
    }

    public List<Person> getTenantList() {
        return tenantList;
    }

    public List<Person> getHomeownerList() {
        return homeownerList;
    }
}
