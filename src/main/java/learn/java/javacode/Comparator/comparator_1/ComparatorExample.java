package learn.java.javacode.Comparator.comparator_1;

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
 *
 *  DIFFERENCE BETWEEN COMPARATOR AND COMPARABLE
 *  When your class implements Comparable, the compareTo method of the class is defining the "natural"
 *  ordering of that object. That method is contractually obligated (though not demanded) to be in line with
 *  other methods on that object, such as a 0 should always be returned for objects when the .equals() comparisons
 *  return true.
 *
 *  A Comparator is its own definition of how to compare two objects, and can be used to compare objects in a way
 *  that might not align with the natural ordering.
 *  For example, Strings are generally compared alphabetically. Thus the "a".compareTo("b") would use alphabetical
 *  comparisons. If you wanted to compare Strings on length, you would need to write a custom comparator.
 *
 *  In short, there isn't much difference. They are both ends to similar means. In general implement comparable
 *  for natural order, (natural order definition is obviously open to interpretation), and write a comparator
 *  for other sorting or comparison needs.
 *
 *  Comparable is implemented by a class in order to be able to comparing object of itself with some other objects.
 *  The class itself must implement the interface in order to be able to compare its instance(s).
 *  The method required for implementation is compareTo().
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
        Collections.sort(list);   // Sorts the array list by itself name in natural order

        for(Dog a: list)   // printing the sorted list of names
            System.out.print(a.getDogName() + ", ");

        // Sorts the array list using comparator by instances of itself
        Collections.sort(list,new Dog());
        System.out.println(" ");

        for(Dog a: list)   // printing the sorted list of ages
            System.out.print(a.getDogName() +"  : "+ a.getDogAge() + ", ");
    }
}
