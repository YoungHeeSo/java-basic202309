package day03.player;

public class Player {
    //field
    String nickName;
    int level;
    int hp;

    public Player() {
        this("이름 없음");
//        this.nickName="이름 없음";
//        this.level=1;
//        this.hp=50;

        System.out.println("1번 생성자 호출");
    }

    public Player(String nickName) {
        //생성자 안에 생성자를 실행시킬 수 있어, 다만 생성자 안에 첫줄에 적어야 돼
        //재귀호출은 할 수 없어, 다른 생성자를 호출할 수 있어
        this(nickName,1,50);
//        this.nickName = nickName;
//        this.level=1;
//        this.hp=50;

        System.out.println("2번 생성자 호출");
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("3번 생성자 호출!");

        //this가 붙인 것이 field
        //이름이 달랐다면 this를 뺄수도 있었음
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    //method
    void attack(Player target){
        System.out.println("this = " + this);
        System.out.printf("%s님이 %s님을 공격했습니다 \n",
                this.nickName, target.nickName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
