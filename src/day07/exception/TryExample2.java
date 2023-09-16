package day07.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ctrl+alt+T
        try {
            System.out.println("정수1: ");
            int n1 = sc.nextInt(); //InputMismatch

            System.out.println("정수2: ");
            int n2 = sc.nextInt(); //InputMismatch

            int result =  n1 / n2; //Arithmetic
            System.out.println("result="+result);
        } catch (ArithmeticException e) {
//            throw new RuntimeException(e);
            System.out.println("0으로 나눌수 없습니다");
//            System.out.println("나누기 오류 발생");
        }catch (InputMismatchException e){
            System.out.println("정수만 입력해주세요");
        }finally {
            System.out.println("이코드는 항상실행됩니다");
            sc.close();
        }

        System.out.println("프로그램 정상 종료");

    }
}
