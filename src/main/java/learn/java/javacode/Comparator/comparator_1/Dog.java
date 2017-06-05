package learn.java.javacode.Comparator.comparator_1;

import java.util.Comparator;

/**
 * Created by Voropai Dmytro on 30.05.2017.
 */
public class Dog implements Comparator<Dog>, Comparable<Dog> {
    private String name;
    private int age;

    Dog() {
    }

    Dog(String n, int a) {
        name = n;
        age = a;
    }
    public String getDogName() {
        return name;
    }
    public int getDogAge() {
        return age;
    }

    @Override
    public int compareTo(Dog dogName) {
        return this.name.compareTo(String.valueOf(dogName));
    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.age-o2.age;
    }
}
