package day08.collection.list;

// 컬렉션이 모여 있는 패키지
import day08.generic.Apple;
import util.Utility.*;

import java.util.*;

import static util.Utility.makeLine;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // add(E e): 맨 끝에 데이터 추가
        list.add("ddd");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        System.out.println(list);

        //중간 삽입: add(index, E)
        list.add(2, "fff");
        System.out.println(list);

        int size = list.size();
        System.out.println("size = " + size);

//        indexOf(E e) : 해당 데이터의 인덱스 반환
        int index =  list.indexOf("ccc"); //앞에서부터 0부터 세기 시작
        System.out.println("index = " + index);

        // contains(E e): 해당 데이터 저장 유무 반환
        System.out.println(list.contains("aaa"));
        System.out.println(list.contains("ooo"));

        // remove(index), remove(Object)
        list.remove("aaa");
        list.remove(0);

        System.out.println("list = " + list);

        // set(index, newElement): 수정
        list.set(0, "yyy");
        System.out.println("list = " + list);

        // get(index): 리스트에 저장된 데이터 참조
        String s=list.get(1);
        System.out.println("s = " + s);

        makeLine();
        // 반복문 처리
        //일부순회 할때 사용해
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        makeLine();
        //전체순회할때 사용해
        for (String ss: list) {
            System.out.println("ss = " + ss);
        }

        // clear:  전체 삭제
        //isEmpty(): 리스트가 비어있는 확인
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

        // 리스트에 초기값 넣고 시작하기
//        List<Integer> numbers = new ArrayList<>(); //빈 정수 리스트
        List<Integer> numbers = new ArrayList<>(
//                List.of(5, 30, 7, 99, 3, 41)
                Arrays.asList(5, 30, 7, 99, 3, 41)
        );

        makeLine();
        System.out.println("numbers = " + numbers);

        // 오름차 정렬(퀵 정렬) > 속도 엄청 빠르다!
        numbers.sort(Integer::compareTo);
        System.out.println("numbers 오름차 정렬= " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers 내림차 정렬= " + numbers);

        // 배열 리스트 와 연결 리스트
        /**
         *              탐색속도       삽입삭제속도
         * 배열 리스트      빠름           느림
         * 연결 리스트      느림           빠름
         */

        List<Apple> applelist = new LinkedList<>();
        // array == linked, 둘 다 List 인터페이스로 통합되어 있기 때문에
        applelist.add(new Apple(10));

    }
}
