package pers.prover07.dp.behavior.templatemethod;

/**
 * 模板方法 - 抽象类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 19:51
 */
public abstract class dish {

    /**
     * 模板方法,定义基本方法的执行步骤
     */
    public final void cookProces() {
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }

    // 第一步：倒油是一样的，直接实现
    protected void pourOil() {
        System.out.println("倒油");
    }
    // 第二步：热油是一样的，直接实现
    protected void heatOil() {
        System.out.println("热油");
    }

    // 第三步：倒蔬菜是不一样的抽象方法
    protected abstract void pourVegetable();
    // 第四步：倒调味料是不一样，抽象方法
    protected abstract void pourSauce();

    // 第五步：翻炒是一样的，直接实现
    protected void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }

}
