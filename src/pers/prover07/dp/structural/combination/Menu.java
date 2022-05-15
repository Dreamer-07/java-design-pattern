package pers.prover07.dp.structural.combination;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合模式 - 菜单类(树枝节点)
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 15:38
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComplist = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComplist.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComplist.remove(menuComponent);
    }

    @Override
    public MenuComponent get(int index) {
        return menuComplist.get(index);
    }

    @Override
    void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
        menuComplist.forEach(MenuComponent::print);
    }
}
