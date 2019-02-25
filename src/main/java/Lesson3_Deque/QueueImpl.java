package Lesson3_Deque;


public class QueueImpl<T> implements Queue<T> {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;

    protected T[] data;
    protected int size;

    public int front;
    public int rear;

    public QueueImpl(int maxSize) {
        this.data = (T[]) new Object[maxSize];
        this.size = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insert(T value) {
        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        size++;
    }

    @Override
    public T remove() {
        T value = data[front++];
        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        size--;
        return value;
    }

    @Override
    public T peek() {
        return data[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}
