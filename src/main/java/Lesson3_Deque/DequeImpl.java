package Lesson3_Deque;

public class DequeImpl<T> extends QueueImpl<T> implements Deque<T> {

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public T removeLeft() {
        return super.remove();
    }

    @Override
    public void insertRight(T value) {
        super.insert(value);
    }

    @Override
    public void insertLeft(T value) {
        if (front - 1 < 0)
            front = data.length;

        data[--front] = value;
        size++;
    }

    @Override
    public T removeRight() {
        if (rear < 0)
            rear = data.length - 1;

        size--;
        return data[rear--];
    }

}