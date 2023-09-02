package day01;

import java.util.Date;

public class DataType {

    static int add(int n1, int n2){
        return n1+n2;
    }
    public static void main(String[] args) {

        add(1, 2);
        byte a=10; //1byte==8bit, -128~127
//        short b = 32767; //2byte==16bit
        int c=2147483647; //4byte
        long d=3147483648L; //8byte
        float e=3.151212111F; //4byte - 소수점 7자리
        System.out.println("e = " + e);

        boolean b1=true;
        boolean b2=false;
        if(1>2){ //1,0같은 truly fasly를 쓸 수 없어, 논리식을 써

        }

        //2byte
        char cc=97; //65==A 97==a 44033은 가-힣
        System.out.println("cc = " + cc); //가

        //문자열(문자 배열)
        char[] str={'h','e','l','l','o'};
        System.out.println("str = " + new String(str));

        //스트링은 기본(원시)타입이 아니야, 앞에 대문자인것은 원시타입이 아니야
        String s="hello";
        Date date = new Date();


    }
}
