package pers.prover07.dp.creation.prototype;

import java.io.*;

/**
 * 原型模式 - 抽象原型类
 *  - 需要实现 Cloneable 接口
 *  - 重写 clone 方法作为该对象的克隆方法
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/12 8:42
 */
public abstract class Shape implements Cloneable, Serializable {

    private String id;
    private String name;

    abstract void draw();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 深拷贝
     * @return
     */
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            return ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                assert bos != null;
                bos.close();
                assert oos != null;
                oos.close();
                assert bis != null;
                bis.close();
                assert ois != null;
                ois.close();
            } catch (Exception e2) {
                // TODO: handle exception
                System.out.println(e2.getMessage());
            }
        }
    }
}
