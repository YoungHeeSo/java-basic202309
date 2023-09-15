package day06.abs;

public abstract class Pet {

    //공통 속성
    private String name; // 이름
    private String kind; // 종
    private int age; // 나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    //공통 기능
//    낮잠
//    추상화 기능(abstract)
//    추상 메서드를 만들기 위해서는 추상 클래스여야 해, 일반 클래스도 같이 만들 수 있어
//    부모 클래스에서 기능의 선언만 해주고 자식클래스에서 오버라이딩 해줘
//    추상화 메서드는 강제성을 띄어, "무조건 만들어!"
    public abstract void takeNap();
//    밥먹기
    public abstract void eat();

//    선택기능
    public void walk(){

    }
//    자식 객체들은 이 내용을 바꾸지 말고 그냥 써! (오버라이딩 막아버리기)
    public final String info(){
        return "Hello"+name;
    }
}
