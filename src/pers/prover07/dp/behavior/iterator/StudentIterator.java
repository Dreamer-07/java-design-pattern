package pers.prover07.dp.behavior.iterator;

import java.util.List;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/16 19:22
 */
public class StudentIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int position;

    public StudentIterator(List<Student> studentList) {
        this.studentList = studentList;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(position++);
    }
}
