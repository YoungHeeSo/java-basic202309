package day06.abs;

public class Dog extends Pet{
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void takeNap() {
        System.out.println("강아지는 마당에서 쿨쿨쿨");
    }
    public void eat(){
        System.out.println("멍멍멍 냠냠냠");
    }

    @Override
    public void walk() {
        System.out.println("강아지가 꼬리사랑 산책중");
    }
    //    @Override
//    public void takeNap() {
//        super.takeNap();
//        System.out.println("강아지는 마당에서 쿨쿨쿨");
//    }
//
//    @Override
//    public void eat() {
//        super.eat();
//        System.out.println("멍멍멍 냠냠냠");
//    }
}
