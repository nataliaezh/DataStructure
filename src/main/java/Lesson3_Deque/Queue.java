package Lesson3_Deque;

public interface Queue<T> {

    void insert(T value);
    T remove();
    T peek();

    int size();
    boolean isFull();
    boolean isEmpty();
}