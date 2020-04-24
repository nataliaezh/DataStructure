package Lesson5;

public class Powering {
    public static void main(String[] args) {
        System.out.println(powering(10, 2));
    }

    public static int powering(int n, int a) {
        int c = (int) Math.pow(n, a);
        if (a >= 0 || a != 0) {
            try {
                return c;
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }

        return 0;
    }
}