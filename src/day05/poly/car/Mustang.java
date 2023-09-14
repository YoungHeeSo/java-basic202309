package day05.poly.car;

public class Mustang extends Car{

    @Override
    public void accelerate() {
        System.out.println("머스탱이 가속합니다.");
    }

    public void exhaust(){
        System.out.println("머스탱 이 천둥 같은 배기 소리를 냅니다");
    }
}
