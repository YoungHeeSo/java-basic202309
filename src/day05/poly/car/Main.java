package day05.poly.car;

import day04.modi.pac1.A;
import day05.protec.pac2.D;
import util.Utility;

import static util.Utility.*;

public class Main {
    public static void main(String[] args) {

        //업캐스팅
        int a =10;
        double b= a;

        char c = (char) a;

        Avante avante = new Avante();
        Car cc = avante;
        Car avante2 = new Avante();
        Mustang mustang = new Mustang();
//        mustang.exhaust();
        Car stinger = new Stinger();

        Car[] cars = {avante, avante2, mustang, stinger};
        for (Car cx : cars) {
            cx.accelerate();
        }

        Object[] arr = {"hello", "안녕", 10, false};

        makeLine();

        Driver park = new Driver();
        park.drive(new Avante());
        park.drive(new Stinger());

        makeLine();

        CarShop shop = new CarShop();
        Mustang myCar = (Mustang) shop.exportCar(6000);
        myCar.accelerate();

        //올라갈땐 자동변환 되어서 들어가져
        Car[] myCarList= {myCar, avante};

        int x =10;
        double[] dArr = {x};

        // 객체의 다운캐스팅은 전재조건이 있어
        // 한번 업캐스팅이 된 자식객체만 다시 다운 캐스팅이 가능해

        makeLine();

        Car myStinger = new Stinger();
        Stinger ss = (Stinger) myStinger;

        // 부모 객체를 자식 으로 내린 상황
        // 부모는 자식으로 형변환은 안돼, 불가능한 상황
        /*Car car = new Car();
        Avante aaa = (Avante) car;*/

        makeLine();

        //tip)
        Car mycarcar=shop.exportCar(6000);
        System.out.println(mycarcar instanceof Avante);
        System.out.println(mycarcar instanceof Stinger);
        System.out.println(mycarcar instanceof Mustang);
        //carcar는 아반떼 객체 입니까?

        if(mycarcar instanceof Mustang){ //mycarcar가 머스탱이면
            Mustang ms =(Mustang) mycarcar;
            ms.exhaust();
        }

        //동종 타입이 아니면 배열에 들어갈 수 없어
//        Avante[] avantes = {avante, avante2};
//        for (Avante a : avantes) {
//            a.accelerate();
//        }

//        avante.accelerate();
//        mustang.accelerate();
//        stinger.accelerate();

    }
}
