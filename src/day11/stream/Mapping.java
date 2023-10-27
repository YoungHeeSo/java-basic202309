package day11.stream;

import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Dish.*;
import static day11.stream.Menu.*;

public class Mapping {
    private static class dishNameOfType{
        private String name;
        private Type type;
        public dishNameOfType(Dish dish){
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "dishNameOfType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

//    이름과 칼로리만 가진 클래스 설계
    private static class SimpleDish{
        private String name;
        private  int calories;

    public SimpleDish(Dish dish){
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }
}

    public static void main(String[] args) {

//        stream의 map: 컬렉션(리스트, 셋, 맵...)에서 원하는 정보만
//             추출하여 새로운 컬렉션으로 반환해준다

        List<String> nameList = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("nameList = " + nameList);

        /*
        * 요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다
        * */
        menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println("d = " + d));

        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new dishNameOfType(dish))
                .collect(Collectors.toList())
                .forEach(dish-> System.out.println("dish = " + dish));
    }
}
