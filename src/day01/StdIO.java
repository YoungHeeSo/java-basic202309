package day01;

import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) {
        //자바에서 입력을 처리하는 객체
        //입력이 필요한 상황에서 선언하면 돼
        Scanner sc = new Scanner(System.in);

        //문자 입력
        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("나이 입력: ");
        String inputAge = sc.nextLine();
        
        //문자열을 정수로 변환
        int birthYear=2023-Integer.parseInt(inputAge)+1;

        System.out.printf("name: %s age: %s", name, inputAge);
        System.out.println("f{name inputAge}");
        System.out.println("birthYear = " + birthYear);

        //메모리 자원 해제(하드웨어, 네트워크, 데이터베이스, 외부장치접근)
        sc.close();
    }
}
