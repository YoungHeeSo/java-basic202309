package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요,");

        String[] foodArray={"딸기","사과","오렌지","레몬","자몽"};
        int index=2;
        String newData="샤인머스켓";

        String[] foodCopy=new String[foodArray.length+1]; //6
        for (int i = 0; i < foodArray.length; i++) {
            foodCopy[i]=foodArray[i];
        }
        for (int i = foodCopy.length-1; i < index; i--) {
            foodCopy[i]=foodCopy[i+1];
        }

        System.out.println("foodCopy = " + Arrays.toString(foodCopy));




    }//end main
}
