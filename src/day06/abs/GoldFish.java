package day06.abs;

public class GoldFish extends Pet{
    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }
// 추상 클래스의 장점
    // 메서드 구현에 용의해
    @Override
    public void takeNap() {

    }

    @Override
    public void eat() {

    }
}
