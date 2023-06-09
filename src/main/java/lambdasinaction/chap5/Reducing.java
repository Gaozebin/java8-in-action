package lambdasinaction.chap5;

import lambdasinaction.chap4.Dish;

import java.util.*;

import static lambdasinaction.chap4.Dish.menu;

/**
 * @author gaozebin
 * @date 2023/3/19 22:28
 */
public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 5, 1, 2);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("Number of calories:" + calories);

    }
}
