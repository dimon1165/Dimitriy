/**
 * Created by dvorop on 16.02.2017.
 * Go to multicore CPU (improving of performance)
 * Different threads can be executed "at the same time".
 * Synchronized - JVM uses the special object lock that has a key (in fact every class in java has this key)
 * So when thread would like to get instance of a class it as Lock object for a key and if this Lock object has it
 * the Thread can use getInstance method. Another thread also ask about the Lock object but will not receive it
 * because the Lock has only one and it has been given to another thread.
 *
 *
 */
package learn.java.javacode.ThreadsMultithreading.Concurrency;