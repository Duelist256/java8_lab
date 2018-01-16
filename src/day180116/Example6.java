package day180116;

import java.util.ArrayList;
import java.util.List;

public class Example6 {

    public static void main(String[] args) {
//        List<String>[] list1 = new ArrayList<String>[10]; // Generic array creation
        List<?>[] list2 = new ArrayList<?>[10];
    }

    private static void varargsMethod(List<String> ... lists) {
        Object[] objects = lists;
        List<Integer> integers = (List<Integer>) objects[0];
        integers.add(10);
        integers.get(0);
    }
}
