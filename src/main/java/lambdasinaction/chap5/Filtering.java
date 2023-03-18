package lambdasinaction.chap5;

import lambdasinaction.chap4.Dish;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static lambdasinaction.chap4.Dish.menu;

/**
 * @author gaozebin
 * @date 2023/3/18 23:10
 */
public class Filtering {

    public static void main(String[] args) {

        // Filtering with predicate
        List<Dish> vegetarianMenu =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());

        vegetarianMenu.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .limit(3)
                        .collect(toList());

        dishesLimit3.forEach(System.out::println);

        // Skipping elements
        List<Dish> dishesSkips2 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(toList());

        dishesSkips2.forEach(System.out::println);
    }
}
