package pers.prover07.dp.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 19:18
 */
public class StudentAggregation implements Aggregation<Student> {
    private final List<Student> studentList;
    private final Iterator<Student> studentIterator;

    public StudentAggregation() {
        studentList = new ArrayList<>();
        studentIterator = new StudentIterator(studentList);
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void remove(Student student) {
        studentList.remove(student);
    }

    @Override
    public Iterator<Student> getIterator() {
        return studentIterator;
    }
}
