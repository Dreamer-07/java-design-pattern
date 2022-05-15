package pers.prover07.dp.structural.flyweight;

/**
 * 具体享元角色
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 17:08
 */
public class IBox extends AbstractBox {

    private IBox() {
        this.shape = "I";
    }

    public static IBox getInstance() {
        return IBoxEnum.INSTANCE.get();
    }

    private enum IBoxEnum {
        /**
         *
         */
        INSTANCE;

        private final IBox iBox;

        IBoxEnum() {
            iBox = new IBox();
        }

        public IBox get() {
            return iBox;
        }
    }
}
