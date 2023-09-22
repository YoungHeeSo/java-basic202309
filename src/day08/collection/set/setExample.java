package day08.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExample {
    public static void main(String[] args) {

//        빠른 저장속도, 중복 제거, 순서 없음
//        인덱스, 키를 사용하지 않아서 개별 탐색에는 불리함.
        Set<String> foodSet = new HashSet<>();

//        add(E e) : 데이터 추가
        // 기존 데이터가 있으면 추가가 실패됨
        boolean f1 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        foodSet.add("김말이");
        foodSet.add("김밥");

        System.out.println(foodSet.size());
        System.out.println(foodSet); // 순서 보장되지 않음
        System.out.println("f1 = " + f1);

        for (String s: foodSet) {
            System.out.println("s = " + s);
        }

        // remove(object)
        foodSet.remove("단무지");
        System.out.println("foodSet = " + foodSet);

        //데이터 중복을 빠르게 제거할 때 set 추천
        List<Integer> numbers = new ArrayList<>(
                List.of(1,1,1,3,3,5,7,7,7,7,9,9,9,9)
        );
        System.out.println("numbers = " + numbers);

        //Set으로 변환
        //빠르게 중복 제거
        Set<Integer> numberSet =  new HashSet<>(numbers);
        System.out.println("numberSet = " + numberSet);

        //List로 변환
        numbers =  new ArrayList<>(numberSet);
    }
}
