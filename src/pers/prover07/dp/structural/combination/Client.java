package pers.prover07.dp.structural.combination;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 15:45
 */
public class Client {

    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        MenuComponent menu2 = new Menu("权限配置", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent root = new Menu("系统管理", 1);
        root.add(menu1);
        root.add(menu2);

        root.print();
    }

}
