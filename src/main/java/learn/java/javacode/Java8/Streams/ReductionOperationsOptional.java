package learn.java.javacode.Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 1. Optional means "there might be no result". No value is suitable for this.
 * When I am not sure what method returns I use optional.
 * We can use optional like:
 *  Optional<String> opt = ...;
 *  if (opt.isPresent()){
 *      String s = opt.get();
 *  } else{
 *      ...
 *  }
 * Also with optional we can use orElseThrow() method which defines a thrown exception:
 *   String s = opt.orElseThrow(MyException::new);
 *
 * 2. Available reductions:
 * - max,min,count;
 * - allMatch, noneMatch, anyMatch;
 * - findFirst, findAny.
 * Reductions do not return the stream and called terminal operation.
 *
 * 3. BiFunction operation in root. Takes two arguments and returns one.
 */
public class ReductionOperationsOptional {
    public static void main(String[] args) {
        //Reduction
        List<Integer> list = Arrays.asList(-10, -10, 10);
        Integer sum = list.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        //Max
        Optional<Integer> max = list.stream()
                .reduce(Integer::max);
        System.out.println(max);
    }
}
