package day180116;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        Holder<Integer> intHolder = new Holder<>(42);

        Holder objectHolder = new Holder(0.45);

        objectHolder = intHolder;
        objectHolder.setValue(100.5);

//        Integer value = intHolder.getValue();

//        System.out.println(intHolder.getValue());

        List<Integer> values = Arrays.asList(1, 2, 3, 4);

    }
}

class Holder<T extends Number & Comparable<T>> {
    T value;

    Holder(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
