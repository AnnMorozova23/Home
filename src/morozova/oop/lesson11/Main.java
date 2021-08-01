package morozova.oop.lesson11;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6};
        String[] str = {"gjt", "tgyjtyu", "jgfg", "ghjyu",};
        char[] st = {'f', 'l', '4', 'y'};
        toList(Arrays.toString(num));
        toList(str);
        toList(Arrays.toString(st));
        List<Integer> listInt = new ArrayList<>(Arrays.asList(10, 15, 1, 17, 6));
        System.out.println(listInt);
        swap(listInt, 2, 4);

        BoxWithFruits<Apple> box1 = new BoxWithFruits<>();
        BoxWithFruits<Orange> box2 = new BoxWithFruits<>();
        BoxWithFruits<Apple> box3 = new BoxWithFruits<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        box1.addF(apple1);
        box1.addF(apple2);
        box2.addF(orange1);
        box2.addF(orange2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compareBox(box2));
        box1.swapBox(box3);
        System.out.println(box3.getWeight());

    }

    public static <T> void toList(T... array) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
    }


    public static <T> void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        System.out.println(list);
    }
}
