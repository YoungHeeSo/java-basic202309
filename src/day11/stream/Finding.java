package day11.stream;

import day04.modi.pac2.C;

import java.util.Comparator;
import java.util.Optional;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;

public class Finding {
    public static void main(String[] args) {

//        음식 메뉴 중에 채식주의자가 먹을 수 있는 요리가 있는가?
        boolean flag1 = menuList.stream()
                .anyMatch(dish -> dish.isVegeterian());
        System.out.println("flag1 = " + flag1);

//        칼로리가 50미만인 음식?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() < 50);
        System.out.println("flag2 = " + flag2);

//        모든 요리가 1000칼로리 미만?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);

//        모든 요리가 1000칼로리 미만이 아닌지?
        boolean flag4 = menuList.stream()
            .noneMatch(dish -> dish.getCalories() < 1000);
        System.out.println("flag4 = " + flag4);

//        음식 중 칼로리가 가장 낮은 음식 조회
        Dish dish = menuList.stream()
                .min(comparing(Dish::getCalories))
                .get();
        System.out.println("dish = " + dish);

//        null 확인
        Optional<Dish> min = menuList.stream()
                .min(comparing(Dish::getCalories));
        min.ifPresent(d -> d.getCalories());
        System.out.println("min = " + min);




    }
}
