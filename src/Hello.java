import java.util.Date;

public class Hello { //클래스 이름은 파일 이름과 같아야 해, 대소문자 구별
    public static void main(String[] args) {
        System.out.println(200*2);
        System.out.println("Hello Java"); //``,'' 쓰면 안돼

        int a = 100; //ctrl + alt + v, 변수 타입에 맞게 작성해줘
        double v = 3.14;

        String hello = "hello";
        boolean b = true;

        Date date = new Date();

        System.out.println(a+v);

        System.out.println("a = " + a); //soutv
    }

}
