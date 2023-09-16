package day07.inter;

public class BullDog extends Livings implements BadAnimal{
    //인터페이스 2개 이상 상속이 가능, 다중상속 가능

    @Override
    public void makeHobby() {
        super.makeHobby();
    }

    @Override
    public void hunt(Animal animal) {

    }

    @Override
    public void feed(String foodName) {

    }

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void angry() {

    }
}
