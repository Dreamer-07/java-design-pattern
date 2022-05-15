package pers.prover07.dp.structural.combination;

/**
 * 组合模式 - 菜单项类(叶子节点)
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 15:42
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
    }
}
