package Lesson4;

import java.util.Arrays;

import java.util.Iterator;
import java.util.List;


public class Main6 {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Oxygen", "Nitrogen", "Carbon dioxide");
        traverse(data);
    }
    public static void traverse(List data) {
        for(Object obj : data) {
            System.out.println(obj);
        }
        System.out.println("-----------");
        for(Iterator it = data.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
