package day02.array;

import java.util.Arrays;

public class ListMain {
    public static void main(String[] args) {
        StringList foods=new StringList("자장면","탕수육","잡채밥");
        StringList userNames =new StringList("김철수","초롱이");

        foods.pop();
        userNames.pop();

        foods.printArray();
        userNames.printArray();

        System.out.println();
        System.out.println("================================");

        StringList foodList = new StringList("제육볶음", "김치찌개");
        StringList userNameList = new StringList("홍길동");

        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");

        userNameList.push("김철수");
        userNameList.push("박영희");

        foodList.pop();
        userNameList.pop();

        foodList.insert(0, "꽃게탕");
        foodList.insert(2, "닭도리탕");

        foodList.remove("꽃게탕");
        foodList.remove(2);

        System.out.println("짜장면 있음? " + foodList.includes("짜장면"));
        System.out.println("짱뽕 있음? " + foodList.includes("짬뽕"));

        System.out.println("제육볶음 어딨음? " + foodList.indexOf("제육볶음"));

//        foodList.clear();
//        System.out.println("foodList 비었니? " + foodList.isEmpty());

        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());
        System.out.println("userNameList = " + userNameList);
        System.out.println("userNameList.size() = " + userNameList.size());

    }
}
