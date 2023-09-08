package day03;

// import 선언 | 성까지 써주어야 하지만 import함으로써 이름만 써줄 수 있어
//import day03.juice.Banana;
//import day03.juice.Mango;

// day03.juice의 모든 파일들을 import 해줘
import day03.juice.*;

//패키지 이름은 소문자로 지어줘, 대문자로 지으면 클레스랑 헷갈려
public class PackageMain {
    public static void main(String[] args) {

        Mango mango = new Mango();
        Banana banana=new Banana();
        day03.fruit.Apple apple1 = new day03.fruit.Apple();
        day03.juice.Apple apple2 = new day03.juice.Apple();
    }
}
