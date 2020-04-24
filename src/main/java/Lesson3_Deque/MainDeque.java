package Lesson3_Deque;

public class MainDeque {
    public static void main(String[] args) {


        Deque<String> deq1 = new DequeImpl<>(12);


        insertRight(deq1, "декабрь");
        insertRight(deq1, "январь");
        insertRight(deq1, "февраль");

        removeLeft(deq1);
        insertRight(deq1, "март");
        insertRight(deq1, "апрель");
        insertRight(deq1, "май");
        displayLeftToRight(deq1);
        insertLeft(deq1,"июнь");
        insertLeft(deq1,"июль");
        insertLeft(deq1,"август");
        displayRightToLeft(deq1);
    }

    public static <T> void insertRight(Deque<T> deq, T value) {
        if (!deq.isFull()) {
            deq.insertRight(value);
        }
    }

    private static <T> void insertLeft(Deque<T> deq, T value) {
        if (!deq.isFull()) {
            deq.insertLeft(value);
        }
    }

    private static <T> void removeRight(Deque<T> deq) {
        if (!deq.isEmpty()) {
            deq.removeRight();
        }
    }

    private static <T> void removeLeft(Deque<T> deq) {
        if (!deq.isEmpty()) {
            deq.removeLeft();
        }
    }

    private static <T> void displayRightToLeft(Deque<T> deq) {
        while (!deq.isEmpty()) {
            System.out.println(deq.removeRight());
        }
    }

    public static <T> void displayLeftToRight(Deque<T> deq) {
        while (!deq.isEmpty()) {
            System.out.println(deq.removeLeft());
        }
    }



}
