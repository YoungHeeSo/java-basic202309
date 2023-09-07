package day02.array;

import java.util.Arrays;

public class StringList {
    // String 배열을 필드로 등록
    String[] sArr;

    //생성자를 통해 배열을 초기화
    StringList(){
        sArr=new String[0];
    }
    StringList(String... initData){
        sArr=new String[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i]=initData[i];
        }
    }

    //배열 맨 끝 데이터 제거
    void pop(){
        String[] temp = new String[sArr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=sArr[i];
        }
        sArr=temp;
    }

    //배열 맨 끝 데이터 추가
    void push(String newData){
        String[] dataPush = new String[sArr.length+1];
        for (int i = 0; i < sArr.length; i++) {
            dataPush[i]=sArr[i];
        }
        dataPush[sArr.length]=newData;
        sArr=dataPush;
    }

    //배열 중간에 데이터 삽입
    void insert(int index, String food){
        String[] insertArr=new String[sArr.length+1];

        for (int i = 0; i < sArr.length; i++) {
            insertArr[i]=sArr[i];
        }
        for (int i = sArr.length; i > index; i--) {
            insertArr[i]=sArr[i-1];
        }
        insertArr[index]=food;
        sArr=insertArr;
    }

    //배열 중간 값 삭제
    void remove(int index){
        for (int i = index; i < sArr.length-1; i++) {
            sArr[i]=sArr[i+1];
        }
        String[] reArray=new String[sArr.length-1];
        for (int i = 0; i < reArray.length; i++) {
            reArray[i]=sArr[i];
        }
        sArr=reArray;
    }
    void remove(String food){
        for (int i = 0; i < sArr.length; i++) {
            if(food.equals(sArr[i])){
                remove(i);
            }
        }
    }


    void printArray(){
        System.out.println(Arrays.toString(sArr));
    }

}
