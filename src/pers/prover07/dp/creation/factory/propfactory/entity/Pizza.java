package pers.prover07.dp.creation.factory.propfactory.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/11 9:48
 */
public abstract class Pizza {

    protected String name;

    /**
     * 制作原材料的过程
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + "in bake");
    };
    public void cut() {
        System.out.println(this.name + "in cut");
    };
    public void box() {
        System.out.println(this.name + "in box");
    };
}
