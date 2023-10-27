package day11.quiz;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        // 거래목록에서 거래자들을 추출한담에 거래자안에 있는 도시이름을 추출
        // filter :  10개중에 조건에 맞는 3개를 필터링
        // map :  10개중에 10개를 가져오는데 조건에 맞게 추출
        List<String> collect1 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct() // 중복제거
                .collect(Collectors.toList());

        System.out.println("collect1 = " + collect1);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        List<Trader> collect2 = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>
        List<String> collect3 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted() // 문자나 숫자는 Comparator를 사용하지 않음, 특별한 기준이 있을 때 사용
                .collect(Collectors.toList());
        System.out.println("collect3 = " + collect3);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println("flag1 = " + flag1);
//        tip) 앞글자가 대문자나 소문자나 같기 때문에 equalsIgnoreCase(대문자 소문자 무시)를 사용해서 비교한다


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalValues = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .mapToInt(transaction -> transaction.getValue())
                .sum();

        System.out.println("totalValues = " + totalValues);


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int max = transactions.stream()
                .mapToInt(transaction -> transaction.getValue())
                .max()
                .getAsInt(); //int 타입으로 가져와
        System.out.println("max = " + max);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        Optional<Transaction> min = transactions.stream()
                .min(comparing(transaction -> transaction.getValue()));

        min.ifPresent(transaction -> System.out.println("transaction = " + transaction));

        Transaction transaction = min.get();
        System.out.println("transaction = " + transaction);


    }
}
