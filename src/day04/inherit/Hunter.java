package day04.inherit;

public class Hunter extends Player{

    private String beast;

    public Hunter(String nickName){
        super(nickName);
        this.beast="곰돌이";
    }

    @Override
    public void status() {
        super.status();
        System.out.println("# 몬스터: "+beast);
    }

    public void arrowShot(){
        System.out.println("화살을 쏩니다");
    }


    public String getBeast() {
        return beast;
    }

    public void setBeast(String beast) {
        this.beast = beast;
    }
}
