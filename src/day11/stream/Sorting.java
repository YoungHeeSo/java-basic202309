package day11.stream;

import util.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;
import static util.Utility.*;

public class Sorting {
    public static void main(String[] args) {

//        음식 목록 중에 칼로리가 낮은 순으로 정렬
         menuList.stream()
            .sorted(comparing(Dish::getCalories))
            .collect(Collectors.toList())
            .forEach(dish -> System.out.println("dish = " + dish));

        makeLine();

//        칼로리 내림차 정렬(높은순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("============= 500칼로리보다 작은 요리 중에 앞에서 탑3 필터링 =============");
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}
