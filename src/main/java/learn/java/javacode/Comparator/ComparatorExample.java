package learn.java.javacode.Comparator;

import java.util.*;

/**
 * Created by Voropai Dmytro on 30.05.2017.
 * Check Dog class for more information
 * The Comparator interface defines two methods: compare( ) and equals( ).
 * The compare Method:
 * int compare(Object obj1, Object obj2)
 * obj1 and obj2 are the objects to be compared. This method returns zero if the objects are equal.
 * It returns a positive value if obj1 is greater than obj2. Otherwise, a negative value is returned.
 *
 * The equals Method
 * The equals( ) method, shown here, tests whether an object equals the invoking comparator
 * boolean equals(Object obj)
 * obj is the object to be tested for equality. The method returns true if obj and the invoking object are both
 * Comparator objects and use the same ordering. Otherwise, it returns false.
 */
public class ComparatorExample{
    public static void main(String args[]) {
        // Takes a list o Dog objects
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Shaggy", 3));
        list.add(new Dog("Lacy", 2));
        list.add(new Dog("Roger", 10));
        list.add(new Dog("Tommy", 4));
        list.add(new Dog("Tammy", 1));
        Collections.sort(list);   // Sorts the array list

        for(Dog a: list)   // printing the sorted list of names
            System.out.print(a.getDogName() + ", ");

        // Sorts the array list using comparator
        Collections.sort(list,new Dog());
        System.out.println(" ");

        for(Dog a: list)   // printing the sorted list of ages
            System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
    }
}
