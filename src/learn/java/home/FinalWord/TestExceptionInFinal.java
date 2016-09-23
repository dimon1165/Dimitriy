package learn.java.home.FinalWord;

import java.util.ArrayList;
import java.util.List;

/**
 * Scenario 1
 * private final List foo;  // 1
 * foo is an instance variable. When we create Test class' object then instance variable foo 
 * will be copied inside object of Test class. If we assign foo inside constructor then compiler know that 
 * Constructor will be invoked only one time, so there is no problem to assign it inside constructor. 
 * If we assign foo inside method then compiler knows that method may be invoked multiple time. 
 * So value will have to be changed multiple time which is not allowed for final variable. 
 * You can assign value to the final variable only one time. So compiler decides constructor is good choice!
 *
 * Scenario 2
 * private static final List foo = new ArrayList();
 * foo is now static variable. 
 * When we create object of Test class then foo will not be copied to the object of Test class because foo is static. 
 * Now foo is not the property of each object. 
 * This is the property of Test class. But foo can be seen by many objects and
 * if every object which is created by using new keyword which ultimately invoke Test constructor then value will be changed 
 * at the time of multiple object creation (Remember static foo is not copied in every object now but is shared between multiple objects.) 
 *
 * Scenario 3
 * In above case you are not changing first referenced object but you are adding contents inside foo which is allowed. 
 * Compiler complains if you try to assign new ArrayList() object to the foo reference variable. 
 * Rule is that if you have initialized object to final reference variable then you cannot change it to refer different ArrayList object. (in this case ArrayList)
 */

class TestExceptionInFinal {
    private final List foo;

    public TestExceptionInFinal() {
        foo = new ArrayList();
        foo.add("foo"); // Modification-1
        System.out.println(foo);
    }
    public static void main(String[] args) 
    {
        TestExceptionInFinal t = new TestExceptionInFinal();
        t.foo.add("bar"); // Modification-2
        System.out.println("print - " + t.foo);
    }
}