package learn.java.javacode.HashCodeAndEquals;

/**
 * Created by dvorop on 03.02.2017.
 * This calls described idea of hashcode and equals functionality
 */
public class HashCodeAndEquals {
    public static void main(String[] args) {
        Flight flight1 = new Flight(175);
        Flight flight2 = new Flight(175);
//  we will use "==" for comparing and it will give to us false, because this sign compares
//  the equality of references  if they point to the same object, but not objects of references.
        if (flight1 == flight2){
            System.out.println("the refernce to objects are equals");
        }
//  if we will use equals method which should compare the object it will also return to us
//  false. Because default implementation inside method equal uses "==" sign
        if (flight1.equals(flight2)){
            System.out.println("the refernce to objects are equals");
        }
//  if we would like to compare object logically we need to override hashcode and equals methods like below
//  this is ok  because of inheritance of all objects in java for Object class. See Flight.class
    }
}
