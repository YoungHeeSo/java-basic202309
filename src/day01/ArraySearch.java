package day01;

public class ArraySearch {
    public static void main(String[] args) {
        
        String[] foods={"족발","치킨","파스타","삼겹살"};
        String findTarget="파스타";
        
        //findTarget 의 index 를 알아 내고 싶어
        
        //선형 탐색(순차 탐색) 앞에서 부터 하나씩 확인
        int index=-1;
        for (int i = 0; i < foods.length; i++) {
            if(findTarget==foods[i]){
                index=i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}

// 자바 에서는 문자열 비교 시 ==대신 "equals" 함수를 써야 해.
