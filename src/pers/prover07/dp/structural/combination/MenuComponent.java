package pers.prover07.dp.structural.combination;

/**
 * 组合模式 - 菜单组件(抽象根节点)
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 15:36
 */
public abstract class MenuComponent {

    protected String name;

    protected int level;

    /**
     * 添加菜单组件(菜单项组件不支持)
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除菜单组件(菜单项组件不支持)
     * @param menuComponent
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 查找菜单组件(菜单项组件不支持)
     * @param index
     */
    public MenuComponent get(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    /**
     * 打印其包含的所有菜单以及菜单项名称
     */
    abstract void print();
}
