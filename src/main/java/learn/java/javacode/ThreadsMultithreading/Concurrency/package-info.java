/**
 * Created by dvorop on 16.02.2017.
 * Go to multicore CPU (improving of performance)
 * Different threads can be executed "at the same time".
 * Synchronized - JVM uses the special object lock that has a key (in fact every class in java has this key)
 * So when thread would like to get instance of a class it as Lock object for a key and if this Lock object has it
 * the Thread can use getInstance method. Another thread also ask about the Lock object but will not receive it
 * because the Lock has only one and it has been given to another thread.
 * Best way to make synchronized block is:
 *   public class Person{
 *    //create an object which will lock key for synchronization
 *   private final Object key = new Object();
 *     public void init(){
 *     synchronized (key){
 *
 *     }
 *   }
 * }
 *
 *
 *  @see learn.java.javacode.ThreadsMultithreading.Concurrency.CheckRunnablemethod
 * The Runnable pattern:
 * How to run a thread ?
 * Object Runnable was created for putting in it task and then after creating thread like
 * Thread thread = new Thread (task) - giving this task (implementation of runnable interface) to thread constructor
 * and then launching the thread by calling thread.start(); but do not mess it with run() method which executes run in
 * current thread.
 * How stop thread ?
 * There is method called stop() which is deprecated. It should not be used.
 * The right method is interrupt(). But the tricky thing is that this method not stop current thread but sends the
 * signal to the task which thread is running that it is time for this task to stop itself.
 * thread.interrupt(); - the code of the task should call isInterrupted() to terminate itself.
 * For better implementation it is good to use in method run pattern like this:
 * Runnable task = () -> {
 *     while(! Thread.currentThread().isInterrupted()){
 *         // the task itself
 *     }
 * }
 *
 *  Producer/Consumer
 *  Producer - produces values in a buffer
 *  Consumer - consumes the values from this buffer
 *  They run in theirs owns threads and the buffer is sheared. So we reed properly sync the code.
 *  The better way to orginize it is to use wait and notify pattern.
 *  Wait/notify
 *  1. They are invoced on a given object
 *  2. The thread executing the invocation SHOULD hold the key of that oobject
 *  3. Wait and notify cannot be invoked outside a synchronized block
 *  WAIT
 *  - Calling the wait() method releases the key held by this thread and it becames available to another threads
 *  - It puts that thread in a particular state that called WAIT. The only way to release a thread form a WAIT state is
 *  to call notify on the lock object this thread is using.
 *  NOTIFY
 *  - releases a Thread in Runnable state.
 *  - if there are lot of threads the released thread is chose randomly of the threads.
 *  - notifyAll() - start of threads from WAIT.
 *  And the code should look like this:
 *  @see learn.java.javacode.ThreadsMultithreading.Concurrency.ProducerConsumer
 *  see Consumer_ProducerPattern.jpg
 *  private Object lock;
 *   class Producer{
 *    public void produce(){
 *     synchronized (lock){
 *      if(isFull(buffer)){
 *       lock.wait();
 *        buffer[count++] = 1;
 *         lock.notifyAll();
 *        }
 *      }
 *     }
 *   }
 *
 *  Happens before Link - happens in synchroniztion, volotile cases
 *
 *
 */
package learn.java.javacode.ThreadsMultithreading.Concurrency;
