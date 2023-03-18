package lambdasinaction.chap4;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author gaozebin
 * @date 2023/3/18 21:57
 */
public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java8","Lambdas","In","Action");
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        // uncommenting this line will result in an IllegalStateException
        // because streams can be consumed only once
        //s.forEach(System.out::println);
    }
}
