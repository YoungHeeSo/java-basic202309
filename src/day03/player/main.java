package day03.player;

public class main {
    public static void main(String[] args) {

        //기본생성자는 생성자가 없어야 자동생성 돼
        //생성자가 하나라도 있다면 수동으로 만들어줘야 돼
        new Player();

        Player parking=new Player("주차왕파킹");
        Player fucking=new Player("욕설왕퍼킹");

        parking.attack(fucking);

        System.out.println("parking = " + parking);
        System.out.println("fucking = " + fucking);
    }
}
