package pers.prover07.dp.principle.depInversion;

/**
 * 依赖传递的三种方式
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/9 14:29
 */
public class Demo3 {

    public static void main(String[] args) {

    }

}

interface Type {
    void test();
}

class TypeA implements Type {
    @Override
    public void test() {
        System.out.println("TypeA....test");
    }
}

/**
 * 1. 接口传递
 */
// class Memeber {
//     /**
//      * 通过接口(方法)参数传递依赖
//      * @param type
//      */
//     public void seeType(Type type) {
//         type.test();
//     }
// }

/**
 * 2. 通过构造器传递
 */
// class Member {
//
//     private Type iType;
//
//     public Member(Type iType) {
//         this.iType = iType;
//     }
//
//     public void seeType() {
//         this.iType.test();
//     }
// }

/**
 * 3. 通过setter方法传递
 */
class Member {
    private Type iType;

    public void seeType() {
        this.iType.test();
    }

    public void setiType(Type iType) {
        this.iType = iType;
    }
}