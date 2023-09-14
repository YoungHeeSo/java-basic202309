package day05.static_;

public class Count {

    //제한자 (modifier)
    //접근 제한자(access), 사용 제한자(usage), 동시 사용가능
    public static int x; //정적 필드: 모든 객체가 하나로 공유
    public int y; // 인스턴스 필드: 각 객체 별로 관리됨

    //static 메서드 안에서는 static필드만 직접 참조 가능
    //인스턴스 필드는 객체를 명시적으로 밝혀야 가능(누구의 것인지 알려줘야 돼)
    //정적 메서드
    public static void m1(Count c){
        System.out.println("static 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + c.y); //누구의 y인지 정해줘야 해, c1인지 c2인지
    }

    //인스턴스 메서드
    public void m2(){
        System.out.println("인스턴스 메서드 호출");
        System.out.println("x = " + x);
        System.out.println("y = " + this.y);
    }

}
