package day07.inter;

public class Duck extends Livings {
//  인터페이스 다중 상속 가능
    @Override
    public void feed(String foodName) {

    }

    @Override
    public boolean sleep() {
        return false;
    }
}
