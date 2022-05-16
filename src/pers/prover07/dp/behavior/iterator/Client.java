package pers.prover07.dp.behavior.iterator;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 19:27
 */
public class Client {

    public static void main(String[] args) {
        StudentAggregation studentAggregation = new StudentAggregation();
        studentAggregation.add(new Student("张三", "001"));
        studentAggregation.add(new Student("张三", "002"));
        studentAggregation.add(new Student("张三", "003"));

        Iterator<Student> studentIterator = studentAggregation.getIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().getId());
        }
    }

}
