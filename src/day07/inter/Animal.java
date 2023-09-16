package day07.inter;

// class: 객체를 만드는 설계도
// interface: 클래스를 만드는 명세서
public interface Animal {

    /*int a; //필드선언 불가능
    Animal(){} //생성자 선언 불가능*/

//    상수는 선언가능
    String PET="귀여운 동물";

    //기능들을 명세
    //interface는 추상메서드만 허용됨
    // abstract는 자동으로 들어감
    public abstract void feed(String foodName);
    boolean sleep();

    default void makeHobby(){};
}
