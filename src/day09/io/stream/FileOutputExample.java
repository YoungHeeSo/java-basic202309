package day09.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) {

//        바이트 기반 스트림 -> 이미지, 영상, 텍스트, 기타 파일 전부 가능
//        텍스트 기반 스트림 -> 텍스트 특화
//        FileOutputStream fos = null;

        String msg = " 멍멍, 왈왈~ \n 히히이ㅏ하아ㅏㅏ";

//        try with resources : auto close 기능
        try (FileOutputStream fos = new FileOutputStream("/Users/youngheeso/Desktop/hello/dog.txt")) {
//            fos = new FileOutputStream("/Users/youngheeso/Desktop/hello/dog.txt");
            fos.write(msg.getBytes()); // 세이브 파일 생성
            System.out.println("파일 저장 성공");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//            e.printStackTrace();
            System.out.println(" 해당 경로를 찾을 수 없습니다~");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println(" 출력 시스템에 장애가 발생");
        }

        /*finally { //에러가 나도 안나도 실행된다
            try {
                if(fos!=null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
                e.printStackTrace();

            }
        }*/

    }
}
