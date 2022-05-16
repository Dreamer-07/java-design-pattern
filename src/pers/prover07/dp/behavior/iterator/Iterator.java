package pers.prover07.dp.behavior.iterator;

/**
 * 抽象迭代器
 * @param <T>
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
