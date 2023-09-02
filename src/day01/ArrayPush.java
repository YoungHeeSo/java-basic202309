package day01;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        //push: 맨 끝에 데이터 추가
        int[] arr={10,20,30};
        int newData=40;

        System.out.println("arr = " + Arrays.toString(arr));

        //기존 사이즈에 1 더 큰 새 배열 생성
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }

        // 맨 마지막 인덱스 에 새 데이터 추가
        temp[temp.length-1]=newData;

        //주소 값 변경
        arr = temp;
        temp = null;

        System.out.println("arr= " + Arrays.toString(arr));
        System.out.println("temp= " + Arrays.toString(temp));
    }
}
