package day01;

public class Casting {
    public static void main(String[] args) {
        byte a=100; //1바이트 
        int b=a; //4바이트
        System.out.println("b = " + b);

        //c: 00000000 00000000 00000011 11101000
        int c=200; //4바이트
        //d: 1 1(음수) 1101000
        //1의 보수: 0010111
        //2의 보수: + 1
        // 0011000 => 24
        byte d= (byte)c; //1바이트
        System.out.println("d = " + d);

        double n=3.5; //8
        int m = (int) n; //4
        //다운캐스팅은 데이터 소실이 일어날 수도 있어
        System.out.println("m = " + m);

        //연산시 일어나는 자동 캐스팅
        int k=100;
        double j=5.6;

        double result = k+j; //타입이 다른거끼리 계산 안돼
        //데이터가 크기가 다른 데이터끼리의 연산은
        //작은 쪽을 큰 쪽으로 자동 변환(캐스팅) 후 연산을 진행

        char x='A'; //2
        int y=3; //4
//        int result2=x+y;
        char result2 = (char) (x+y);
        System.out.println(result2); //D

        //int보다 작은 데이터(byte, short, char)
        //의 연산 결과가 자동으로 int로 처리돼
        byte b1=100;
        byte b2=120;

         int result3 = b1+b2;

        System.out.println('A'+'C'); //65+67

        int g=24;
//        double r= g / (double) 5;
        double r= (double) g / 5;
        System.out.println("r = " + r);

    }
}
