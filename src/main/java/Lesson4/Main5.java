package Lesson4;

import java.util.HashSet;
import java.util.Iterator;

import static java.util.Arrays.sort;

public class Main5 {

    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(34);
        set.add(6);
        System.out.println(set);
        return  set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() > 10) {
                    iterator.remove();
                }
            }
        }
        System.out.println(set);
        return set;
    }

    public static void main(String[] args) {

        removeAllNumbersGreaterThan10(createSet());
        System.out.println("----------");

        Iterator<Integer> iterator = createSet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);

        }
        System.out.println("----------");
        int[] array = {10,15,4,200,999};

        sort(array);

        for (int x : array) {
            System.out.print(x+". ");
        }
    }
}
