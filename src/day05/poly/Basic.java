package day05.poly;

import java.util.Scanner;

class A extends Object{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {

    void test(){
        //다형성: 자식객체가 부모의 타입을 사용할 수 있음
        Object a = new A();
        Object b = new B();
        A c = new C();
        B d = new D();
        A e = new E();

        //모든 자바의 클레스에 Object를 쓸 수 있어
        // 다양한 타입,형태를 쓸수 있어
        Object sc = new Scanner(System.in);
    }
}
