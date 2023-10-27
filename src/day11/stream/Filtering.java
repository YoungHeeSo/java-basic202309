package day11.stream;

import util.Utility;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;

public class Filtering {
    public static void main(String[] args) {

//        stream의 filter
//        필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

//        메뉴중에 채식주의자가 먹을 수 있는 요리를 필터링
        /*List<Dish> dishInVegetarian = menuList.stream()
                .filter(dish -> dish.isVegeterian())
                .collect(Collectors.toList());
        for (Dish dish: dishInVegetarian){
            System.out.println("dish = " + dish);
        }*/
//        dishInVegetarian.forEach(dish -> System.out.println("dish = " + dish));

        menuList.stream()
                .filter(Dish::isVegeterian)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("========= 육류 이면서 600칼로리 미만 요리 필터링 =========");
        menuList.stream()
                .filter(d->d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("========= 요리 중에 요리 이름이 4글자인 요리만 필터링 =========");
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("============ 요리에서 500칼로리보다 큰 요리만 필터링 ============");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .limit(3) // 상위 탑3 추출
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        Utility.makeLine();
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2) // 맨 앞 2개를 제외시킴
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("=========== 메뉴 목록에서 처음 등장하는 2개의 생선요리 필터링 ===========");
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        List<Integer> numbers = List.of(1,2,1,3,3,2,4,4,5,7);

//        짝수만 걸러내기
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("filteredNumbers = " + filteredNumbers);

//        중복 제거
        /*Set<Integer> distintNumbers = new HashSet<>(filteredNumbers);
        System.out.println("distintNumbers = " + distintNumbers);
        */

    }

}
