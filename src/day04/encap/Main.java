package day04.encap;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
//        myCar.speed=9999;
//        myCar.mode='Z';

        myCar.setSpeed(80);
        System.out.println(myCar.getSpeed());

        myCar.setMode('D');
        System.out.println(myCar.getMode());

//        myCar.moveCylinder();
//        myCar.inject();
//        myCar.putOil();

        myCar.pressButton();

    }
}
