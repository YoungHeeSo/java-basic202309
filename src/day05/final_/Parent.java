package day05.final_;

class Child extends Parent{
    int x;
//    @Override
//    public void sing() {
//        System.out.println("zzzz");
//    }

    @Override
    public void dance() {
        int a = 10;
    }
}

public  class Parent { //class에 final를 하면 상속 불가능
    public final void sing(){

    }
    public void dance(){

    }
}
