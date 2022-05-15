package pers.prover07.dp.structural.decorator;

/**
 * 抽象构件 - 食物
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/14 22:03
 */
public abstract class Food {

    private String desc;
    private float price;

    public Food() {
    }

    public Food(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算食物的价格
     * @return
     */
    public float cost() {
        return this.getPrice();
    };
}
