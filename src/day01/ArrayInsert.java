package day01;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr={10,20,90,100,999,2000};
        int newDate=50;
        int targetIndex=2;

        //20과 90사이에 50을 넣어줘

        //배열 크기가 1 더 큰 새 배열 생성
        int[] temp = new int[arr.length+1];

        //temp 에 원본 배열의 데이터 를 전부 복수
        for (int i = 0; i < arr.length; i++) {
           temp[i]=arr[i];
        }

        //맨 뒤부터 한칸씩 뒤로 이동
        /*temp[4]=temp[3];
        temp[3]=temp[2];*/

        for (int i = arr.length; i > targetIndex; i--) {
            temp[i]=temp[i-1];
        }

        //targetIndex 에 새 데이터 추가
        temp[targetIndex]=newDate;

        arr=temp;
        temp=null;

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("temp = " + Arrays.toString(temp));

    }
}
