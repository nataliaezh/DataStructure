package Lesson4;



import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Iterator;


public class TestIterator<collection> {
    private final LinkedList<collection> data;

    public TestIterator(LinkedList<collection> data) {
        this.data = data;
    }

    public static void main(String[] args) {


        java.util.LinkedList<Integer> linkedListJdk = new java.util.LinkedList<>();
        linkedListJdk.add(1);
        linkedListJdk.add(2);
        linkedListJdk.add(3);

        for (Integer integer : linkedListJdk) {
            System.out.println(integer);
        }
    }
    String mercury = new String("Меркурий");
    String venus = new String("Венера");
    String earth = new String("Земля");
    String mars = new String("Марс");
    String jupiter = new String("Юпитер");
    String saturn = new String("Сатурн");
    String uranus = new String("Уран");
    String neptune = new String("Нептун");

    ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
            jupiter, saturn, uranus, neptune));
                for(Element element:collection){
        doAction(element);
    }

    public void doAction(Element element) {
        for (int i=0; i<solarSystem.size();i++){
            Collections.sort(solarSystem);
            System.out.println(Arrays.asList(solarSystem));
        }
    }
}
