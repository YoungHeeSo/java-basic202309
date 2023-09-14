package day05.final_;

public class Person {
    String name;
    final String nation; //국적

    static final double pi=3.14; //상수로 처리할땐 static와 final를 같이 붙여줘
//    public static final //pfs, prsf

    public Person(String nation) {
        this.nation = nation;
    }
}
