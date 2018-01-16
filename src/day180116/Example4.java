package day180116;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) throws NoSuchMethodException {
        Arrays.stream(Person.class.getDeclaredMethods()).forEach(System.out::println);

        Method compareTo = Person.class.getDeclaredMethod("compareTo", Object.class);
        System.out.println(compareTo);
    }

    private static class Person implements Comparable<Person> {

        private final String name;
        private final String surname;
        private final int age;

        private Person(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getSurname() {
            return surname;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person o) {
            return Integer.compare(age, o.age);
        }
    }
}
