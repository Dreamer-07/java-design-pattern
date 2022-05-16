package pers.prover07.dp.behavior.iterator;

/**
 * 抽象聚合类
 * @param <T>
 */
public interface Aggregation<T> {

    void add(T t);

    void remove(T t);

    Iterator<T> getIterator();

}
