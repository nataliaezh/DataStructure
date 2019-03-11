package Lesson8;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class Main {
    public static void main (String[] args) {
        HashMap map = new LinkedHashMap(5);
        map.put("Bread","Хлеб");
        map.put("Milk","Молоко");
        map.put("Mayo","Майонез");
        map.put("Coke","Кока-кола");
        map.put("Juice","Сок");
        System.out.println(map);

        System.out.println(map.get("Молоко"));
        System.out.println(map.remove("Milk"));
    }
}
