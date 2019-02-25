package Lesson3_Deque;



public interface Deque<T> extends Queue<T> {

    void insertLeft(T value);
    void insertRight(T value);

    T removeLeft();
    T removeRight();
}