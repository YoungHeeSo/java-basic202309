package day09.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    //파일을 저장할 기본 경로
    public static final String ROOT_PATH= "/Users/youngheeso/Desktop";
    public static void main(String[] args) {

//        폴더 생성
//        파일 정보에 대한 객체 생성
        File file = new File(ROOT_PATH + "/hello");
//        폴더 생성 명령
        if(!file.exists()) file.mkdir(); // 만약 파일 정보가 존재 하지 않는다면, 파일 정보로 폴더를 생성해
//        파일 생성
        File f = new File(ROOT_PATH + "/hello/food.txt");
        if(!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
                System.out.println("파일 생성 실패");
            }
        }
    }
}
