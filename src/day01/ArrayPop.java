package day01;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {

        //pop: 맨 끝 데이터 삭제
        int[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));

        //배열은 크기가 고정 되어 크기를 바꿀 수 없어
        //새로운 배열을 생성(기존 사이즈 보다 1개 작은 배열)
        int[] temp=new int[arr.length-1];

        //맨 앞 데이터 부터 순차적 으로 새 배열에 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }

        arr = temp; //주소 값 변경
        temp = null; //temp 의 주소 값을 가리키기

        //배열의 수정 삭제는 원본에서 이루어질 수 없으므로
        //원본 배열을 복사해서 배열을 수정하고
        //원본 배열 주소 값을 복사한 주소 값을 가리키게 하도록 해

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}
