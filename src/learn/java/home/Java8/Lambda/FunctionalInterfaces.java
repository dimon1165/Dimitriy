package learn.java.home.Java8.Lambda;

/**
 * Разделяются на 4 категории:
 * 1. SUPPLIER: не принимает никаких объектов,только создает их.
 *         @FunctionalInterface
 *         public interface Supplier<T>{
 *           T get();
 *         }
 *
 * 2. CONSUMER/BiCONSUMER: принимает объкты, но ничего не возвращает
 *         @FunctionalInterface
 *         public interface Consumer<T>{
 *           void accept(T t);
 *         }
 *
 * 3. PREDICATE/BiPREDICATE: принимает объект в качестве параметра и возвращает boolean
 *         @FunctionalInterface
 *         public interface Predicate<T>{
 *           boolean test(T t);
 *         }
 * 4. FUNCTION/BiFUNCTION: принимает объект в качестве параметра и возвращает объект.
 *         @FunctionalInterface
 *         public interface Function<T, R>{
 *           R apply(T t);
 *         }
 *
 */
public class FunctionalInterfaces {

}
